package day3.assingment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import day3.assingment.Exception.EmployeeException;
import day3.assingment.model.Employee;
import day3.assingment.utility.DBUtility;

public class EmployeeDaoImplementation implements EmployeeDaoInterface {

	@Override
	public int getSalaryByID(int eid) {
		
		int salary  = -1;
		
		
		try (Connection conn = DBUtility.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select salary from employee3 where eid =?");
			ps.setInt(1, eid);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				salary = rs.getInt("salary");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return salary;
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeException {
		
		List<Employee> empList = new ArrayList<>();
		
		try (Connection conn = DBUtility.getConnection()){
			
			PreparedStatement  ps = conn.prepareStatement("select * from employee3");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int e = rs.getInt("eid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				
				Employee emp = new Employee(e, n, a, s);
				empList.add(emp);
			}	
		} catch (Exception e) {
			throw new EmployeeException("no Employee Present ...");
		}
		
		if(empList.size() ==0) {
			throw new EmployeeException("Employee not present ..");
		}
		
		
		return empList;
	}

	@Override
	public void updateSalary() {
		
		try (Connection conn = DBUtility.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee3 set salary = salary+500");
			
			int x= ps.executeUpdate();
			
			if(x>0) {
				EmployeeDaoInterface dao = new EmployeeDaoImplementation();
				List<Employee> emp = dao.getAllEmployee();
				
				emp.forEach(e -> System.out.println(e));
				
			}else {
				System.out.println("No record updated");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String insertEmployeeDetail(int eid, String name, int salary) {
		String result = "Not Inserted ...";
		
		
		try (Connection conn = DBUtility.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee3(eid,name,salary) values(?,?,?)");
			
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int x= ps.executeUpdate();
			
			if(x>0) {
				result = "record inserted ..";
						
				EmployeeDaoInterface dao = new EmployeeDaoImplementation();
				List<Employee> emp = dao.getAllEmployee();
				
				emp.forEach(e -> System.out.println(e));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}

	@Override
	public Employee searchEmployee(int eid) throws EmployeeException {
		Employee emp = null;
		
		try (Connection conn = DBUtility.getConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3 where eid = ?");
			
			ps.setInt(1, eid);
			
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int e = rs.getInt("eid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				
				emp = new Employee(e, n, a, s);
			}else {
				throw new EmployeeException("Employee don't exist ..");
			}
			
		} catch (Exception e) {
			throw new EmployeeException("No employee found ...");
		}

		return emp;
	}

	
	@Override
	public List<Employee> getEmployeeSalaryLessthan80000() throws EmployeeException {
		
		List<Employee> empList = new ArrayList<>();
		
		
		try (Connection conn = DBUtility.getConnection()){
			
			PreparedStatement  ps = conn.prepareStatement("select * from employee3 where salary < 80000");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int e = rs.getInt("eid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int s = rs.getInt("salary");
				
				Employee emp = new Employee(e, n, a, s);
				empList.add(emp);
			}	
		} catch (Exception e) {
			throw new EmployeeException("no Employee Present ...");
		}
		
		if(empList.size() ==0) {
			throw new EmployeeException("Employee not present ..");
		}
		
		
		
		return empList;
		
	}
	

}
