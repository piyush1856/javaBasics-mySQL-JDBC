package day4.assingment.usecases;

import java.util.Scanner;

import day4.assingment.dao.DepartmentDao;
import day4.assingment.dao.DepartmentDaoImplementation;
import day4.assingment.exceptions.DepartmentException;
import day4.assingment.model.Department;

public class InsertDepartmentDataUseCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name= sc.next();
		
		System.out.println("Enter location :");
		String location= sc.next();
		
		Department dept = new Department();
		dept.setLocation(location);
		dept.setName(name);
		
		DepartmentDao dao = new DepartmentDaoImplementation();
		
		try {
			String result =  dao.insertDepartmentData(dept);
			System.out.println(result);
		} catch (DepartmentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
