package day1.liveClass;

public class _3equalsAndHashCode {
	public static void main(String[] args) {
		Student s1 = new Student(10, "N1", 15);
		Student s2 = new Student(10, "N1", 15);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//if two object are logically equal the hash code should also be same 
		
		// if we remove hashCode from bean class it will give different hash code 
		// it is violation of contact of equal and hashCode ..
		
		//
	}
}
