package day1.assingment._2QuestionNumber2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Input (1,2,3)");
		int input = scanner.nextInt();
		
		TreeSet<Employee> employeeTreeSet = new TreeSet<Employee>();
		
		
		if(input ==1) {
			EmployeeIdComparison idComp = new EmployeeIdComparison();
			employeeTreeSet = new TreeSet<>(idComp);
		}else if(input ==2) {
			EmployeeAddressComparision addressComp = new EmployeeAddressComparision();
			employeeTreeSet = new TreeSet<>(addressComp);
		}else if(input ==3) {
			EmployeeSalaryComparison salaryComp = new EmployeeSalaryComparison();
			employeeTreeSet = new TreeSet<>(salaryComp);
		}/*else {
			System.out.println("Invalid");
			return;
		}*/
		
		
		
		try {
			
			employeeTreeSet.add(new Employee(1, "Piyush", "Godda", 100));
			employeeTreeSet.add(new Employee(2, "Tyagi", "Ranchi", 200));
			employeeTreeSet.add(new Employee(3, "Krishna", "Purnea", 300));
			employeeTreeSet.add(new Employee(4, "Suraj", "Mumbai", 400));
			employeeTreeSet.add(new Employee(5, "Abhinav", "Saharanpur", 600));
			employeeTreeSet.add(new Employee(6, "Mayuresh", "Pune", 400));
			
			for(Employee employee : employeeTreeSet) {
				System.out.println(employee);
			}
			
		} catch (Exception e) {
			System.out.println("You are ordered to give valid input ...");
		}

	}

}
