package day1.assingment._3QuestionNumber3;

import java.util.Objects;

public class StudentBean implements Comparable<StudentBean> {
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	
	@Override
	public String toString() {
		return "StudentBean [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, marks, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentBean other = (StudentBean) obj;
		return Objects.equals(address, other.address) && marks == other.marks && Objects.equals(name, other.name)
				&& roll == other.roll;
	}

	
	
	public StudentBean(int roll, String name, String address, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	@Override
	public int compareTo(StudentBean s1) {
		
		StudentBean s2 = this;
		
		
		if(s1.getMarks() > s2.getMarks())
			return -1;
		else if(s1.getMarks() < s2.getMarks())
			return 1;
		else
			return s2.getName().compareTo(s1.getName());
	}

	
	
	
}
