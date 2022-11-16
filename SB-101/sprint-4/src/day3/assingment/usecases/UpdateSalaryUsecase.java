package day3.assingment.usecases;

import day3.assingment.dao.EmployeeDaoImplementation;
import day3.assingment.dao.EmployeeDaoInterface;

public class UpdateSalaryUsecase {
	
	public static void main(String[] args) {
		
		EmployeeDaoInterface emp = new EmployeeDaoImplementation();
		emp.updateSalary();
		
	}

}
