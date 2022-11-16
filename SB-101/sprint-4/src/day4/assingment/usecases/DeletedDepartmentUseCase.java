package day4.assingment.usecases;

import day4.assingment.dao.DepartmentDao;
import day4.assingment.dao.DepartmentDaoImplementation;
import day4.assingment.exceptions.DepartmentException;
import day4.assingment.exceptions.EmployeeException;

public class DeletedDepartmentUseCase {
	
	public static void main(String[] args) {
		
		DepartmentDao dao = new DepartmentDaoImplementation();
		
		 
		try {
			String result = dao.deleteDepartment();
			System.out.println(result);
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
