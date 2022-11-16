package day4.assingment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day4.assingment.exceptions.EmployeeException;
import day4.assingment.model.Employee;
import day4.assingment.utility.DBUtility;

public class EmployeeDaoImplementation implements EmployeeDao{

	@Override
	public String insertEmployeeData(Employee e) throws EmployeeException {
		
		String result = "Not Inserted";
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee(ename,address,mobile,depid) values(?,?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getAddress());
			ps.setString(3, e.getPhone());
			ps.setInt(4, e.getDeptid());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "inserted";
			}
			
			
		} catch (SQLException e2) {
			e2.printStackTrace();
			throw new EmployeeException(e2.getMessage());
		}
		

		return result;
	}

	@Override
	public List<Employee> detailOfEmployeeOfAcconts() throws EmployeeException {
		
		List<Employee> empList = new ArrayList<>();
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement  ps = conn.prepareStatement("select * from employee e inner join department d on e.depid = d.did  where d.dname ='Account'");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int e = rs.getInt("empid");
				String n = rs.getString("ename");
				String a = rs.getString("address");
				String m = rs.getString("mobile");
				int d = rs.getInt("depid");
				
				Employee emp = new Employee(e, n, a, m, d);
				empList.add(emp);
			}	
			if(empList.size() ==0) {
				throw new EmployeeException("Employee not present ..");
			}
		} catch (Exception e) {
			throw new EmployeeException("no Employee Present ...");
		}
		
		

		return empList;
	}

}
