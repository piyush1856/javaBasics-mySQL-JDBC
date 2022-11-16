package day4.assingment.model;

public class Employee {
	
	private int empid;
	private String name;
	private String address;
	private String phone;
	private int deptid;
	
	public Employee() {
	
	}

	public Employee(int empid, String name, String address, String phone, int deptid) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.deptid = deptid;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", phone=" + phone + ", deptid="
				+ deptid + "]";
	}
	
	
	

}
