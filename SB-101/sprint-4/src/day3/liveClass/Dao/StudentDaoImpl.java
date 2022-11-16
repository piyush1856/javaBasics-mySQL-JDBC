package day3.liveClass.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day3.liveClass.exceptions.StudentException;
import day3.liveClass.model.Student;
import day3.liveClass.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String insertStudentDetails(int roll, String name,String address, int marks) {
		
		String message = "Not inserted ..";
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, marks);
			
			int x=  ps.executeUpdate();
			
			
			if(x > 0)
				message = "Record Inserted Successfully..";
				
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
		
	}

	
	
	
	
	
	@Override
	public String insertStudentDetails2(Student student) {
		
		String message = "Not inserted ..";
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?,?)");
			
			
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getMarks());
			
			int x=  ps.executeUpdate();
			
			
			if(x > 0)
				message = "Record Inserted Successfully..";
				
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;	
	}






	@Override
	public int getMarksByRoll(int roll) throws StudentException {
		
		int marks = -1;
		
		
		try (Connection conn= DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select marks from student where roll = ?");
			
			ps.setInt(1, roll);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				marks= rs.getInt("marks");
			else
				throw new StudentException("Student not found ..");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StudentException(e.getMessage());
		}
		
		
		return marks;
	}






	@Override
	public Student getStudentByRoll(int roll) throws StudentException {
		Student student= null;
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement("select * from student where roll = ?");
			
			ps.setInt(1, roll);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				String a = rs.getString("address");
				int m= rs.getInt("marks");
				
				
				student = new Student(r, n,a, m);
				
				
			}else {
				throw new StudentException("Student doesn't exist");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StudentException(e.getMessage());

		}
		
		
		return student;
	}






	@Override
	public List<Student> getAllStudent() throws StudentException {
		List<Student> students = new ArrayList<>();
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from student");
			
			
			ResultSet rs= ps.executeQuery();
			
			
			while(rs.next()) {
				
				
				int r= rs.getInt("roll");
				String n= rs.getString("name");
				String a = rs.getString("address");
				int m= rs.getInt("marks");
				
				
				Student student = new Student(r, n,a, m);
				
				students.add(student);
				
				
				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			//e.printStackTrace();
			//exception rethrowing
			throw new StudentException(e.getMessage());
		}
		
		
		if(students.size() == 0)
			throw new StudentException("No Student found...");
		
		
		
		return students;
	}
}
	
	



