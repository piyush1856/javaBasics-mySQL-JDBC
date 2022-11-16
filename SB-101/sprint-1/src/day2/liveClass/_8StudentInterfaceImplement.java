package day2.liveClass;

public class _8StudentInterfaceImplement implements _7StudentInterfaceForFunctional{

	@Override
	public Student getStudent(int roll, String name, int marks) {
		Student s1 = new Student(roll, name.toUpperCase(), marks+100);
		return s1;
	}

	
	
	
	
	
//	@Override
//	public String sayHello(String name) {
//		
//		return "Welcome : " + name.toUpperCase();
//	}

//	@Override
//	public void sayHello(Student student) {
//		System.out.println("Roll is : " + student.getRoll());
//		System.out.println("Name is : " + student.getName());
//		System.out.println("Marks is : " + student.getMarks());
//		
//	}

}
