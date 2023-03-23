package sample4;

import java.text.SimpleDateFormat;
import java.util.Date;
// 클래스메소드의 용도
public class CommonUtils {
	
	/**
	 * 패턴을 전달받아서 날짜정보를 패턴에 맞는 형식의 문자열로 변환해서 반환한다.
	 * @param pattern 날짜표시 패턴
	 * @return 지정된 패턴으로 변환되는 날짜정보
	 */
	static String dataToString(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(new Date());
		return text;
	}
}
