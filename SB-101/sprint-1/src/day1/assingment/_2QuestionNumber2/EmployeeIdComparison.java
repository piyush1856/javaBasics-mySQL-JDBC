package day1.assingment._2QuestionNumber2;

import java.util.Comparator;

public class EmployeeIdComparison implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getEmpId()>e2.getEmpId() ? 1 : -1;
	}

}
