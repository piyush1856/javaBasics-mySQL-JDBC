package day4.assingment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day4.assingment.exceptions.DepartmentException;
import day4.assingment.exceptions.EmployeeException;
import day4.assingment.model.Department;
import day4.assingment.model.Employee;
import day4.assingment.utility.DBUtility;

public class DepartmentDaoImplementation implements DepartmentDao {

	@Override
	public String insertDepartmentData(Department d) throws DepartmentException {
		String result = "not inserted";
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into department(dname,location) values(?,?)");
			ps.setString(1, d.getName());
			ps.setString(2, d.getLocation());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				result = "inserted";
			}
			
			
		} catch (SQLException e2) {
			e2.printStackTrace();
			throw new DepartmentException(e2.getMessage());
		}
		
		
		
		
		
		return result;
	}

	@Override
	public String deleteDepartment() throws DepartmentException, EmployeeException {
		
		String result = "Not deleted";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deptID ...");
		int deptid = sc.nextInt();
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee set depid = null where depid = ?");
			ps.setInt(1, deptid);
			int x= ps.executeUpdate();

			if(x>0) {
				
				try (Connection conn2 = DBUtility.provideConnection()){
					PreparedStatement ps2 = conn2.prepareStatement(" delete from department where did =?");
					ps2.setInt(1, deptid);
					int y= ps2.executeUpdate();
					
					result = "deletion done";
					
					
					
				} catch (Exception e) {
					throw new EmployeeException("Department not founnd ..");
				}
				
				
				
			}else {
				throw new EmployeeException(" value not be updated in employee table ...");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<Department> departmentDetail() throws DepartmentException, EmployeeException {
		List<Department> dept = new ArrayList<>();
		
		
		
		try (Connection conn = DBUtility.provideConnection()){
			
			PreparedStatement  ps = conn.prepareStatement("select * from department d inner join employee e on e.depid = d.did  where e.address ='Mumbai'");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int e = rs.getInt("did");
				String n = rs.getString("dname");
				String l = rs.getString("location");
				
				
				Department department = new Department(e, n, l);
				dept.add(department);
			}	
			
		} catch (Exception e) {
			throw new EmployeeException("no Employee Present ...");
		}
		
		
		if(dept.size() ==0) {
			throw new EmployeeException("Employee not present ..");
		}
		
		
		
		
		
		
		return dept;
	}

}
