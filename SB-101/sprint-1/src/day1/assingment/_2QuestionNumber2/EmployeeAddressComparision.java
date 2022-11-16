package day1.assingment._2QuestionNumber2;

import java.util.Comparator;

public class EmployeeAddressComparision implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getAddress().compareTo(e2.getAddress());
	}

}
