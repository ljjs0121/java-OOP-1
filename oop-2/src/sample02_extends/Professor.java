package sample02_extends;

public class Professor extends Person {

	private String major;
	private String position;
	private int salary;
	private String research;
	
	public Professor() {
		
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getResearch() {
		return research;
	}

	public void setResearch(String research) {
		this.research = research;
	}

	public Professor(String id, String major, String name, String position, int salary, String research, String tel, String email) {
		super(id, name, tel, email);
		this.major = major;
		this.position = position;
		this.salary = salary;
		this.research = research;
	}
}
