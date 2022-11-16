package day1.liveClass;

import java.util.Objects;

public class Student /*implements Comparable <Student>*/{
	private int roll;
	private String name;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	


/*
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
		//return roll;
	}




	@Override
	public boolean equals(Object obj) {
		
		Student s1 = this;
		Student s2 = (Student)obj;
		
		if(s1.getRoll()==s2.getRoll() && s1.getName().equals(s2.getName()) && s1.getMarks()== s2.getMarks()) {
			return true;
		}else {
			return false;
		}
		
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}

*/


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}


/*
	//if generic is defined :<Student>
	@Override
	public int compareTo(Student s2) {
		
//		return 0;
		Student s1 = this;
		//getting ride of down-cating
//		if(s1.getMarks()<s2.getMarks()) {
//			return +1;
//		}else if (s1.getMarks()>s2.getMarks()) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		
		//over here duplicate will not be removed
//		if(s1.getMarks()<s2.getMarks()) {
//			return +1;
//		}else {
//			return -1;
//		}
		//simplifying --> no change in logic
		return this.getMarks()>s2.getMarks() ? +1:-1;
		
	}



	
	//if noting is defined in Comparable generic at line no.5
	
//	@Override
//	public int compareTo(Object obj) {
//	
////		return 0;
//		
//		Student s1=this;
//		Student s2 = (Student)obj;
//		
//		//if return "+ve" no. means s1 is bigger and vice-versa. "0" for same.
//		
//		//sort according to requirement
//		
//		if(s1.getMarks()>s2.getMarks()) {
//			return +1;
//		}else if (s1.getMarks()<s2.getMarks()) {
//			return -1;
//		}else {
//			return 0;
//		}
//		// for reverse change greater and less than symbol, or reverse the place 1 and -1
//		
//	}
	
	*/
	
	
}
