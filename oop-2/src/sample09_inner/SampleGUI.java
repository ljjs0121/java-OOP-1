package sample09_inner;
// 익명객체 활용하기 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SampleGUI extends JFrame{

	private JButton newButton = new JButton("새 파일");
	private JButton openButton = new JButton("불러오기");
	private JButton saveButton = new JButton("저장하기");
	private JButton exitButton = new JButton("종료하기");
	
	public SampleGUI() {
		
		setLayout(new FlowLayout());
		
		add(newButton);
		add(openButton);
		add(saveButton);
		add(exitButton);
		
		// 이벤트핸들러(이벤트리스너) 객체 생성하고, 등록하기
		/*
		 * 클릭이벤트 발생시 실행될 이벤트핸들러 객체는 아래의 ActionListener 인터페이스를 구현한 객체다.
		 * 		public interface ActionListener {
		 * 				public void actionPerformed(ActionEvent event);
		 * 		}
		 * 
		 * 		ActionListener litener1 = new ActionListener() {
		 * 			public void actionPerformed(ActionEvent event) {
		 * 				// 새파일 표시
		 * 			}
		 * 		}
		 * 		ActionListener litener2 = new ActionListener() {
		 * 			public void actionPerformed(ActionEvent event) {
		 * 				// 불러오기창 표시
		 * 			}
		 * 		}
		 * 		
		 * 		newButton.addActionListener(listener1);
		 * 		newButton.addActionListener(listener2);
		 */
		
		ActionListener listener1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "새파일을 불러옵니다.");
			}
		};
		// 람다식
		ActionListener listener2 = (e) -> {
			JFileChooser filechooser = new JFileChooser();
			filechooser.showOpenDialog(null);
		};
		
		// 이벤트소스(버튼)에 이벤트리스너(이벤트핸들러) 등록하기
		newButton.addActionListener(listener1);
		openButton.addActionListener(listener2);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser filechooser = new JFileChooser();
				filechooser.showSaveDialog(null);
			}
		});
		exitButton.addActionListener((e) -> {	// 익명객체 만들기
			int answer = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?");
			if (answer == JOptionPane.YES_NO_OPTION) {
				dispose();
				System.exit(0);
			}
		});
		
		setBounds(100, 100, 500, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SampleGUI();
	}
}
