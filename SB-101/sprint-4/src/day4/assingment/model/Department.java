package day4.assingment.model;

public class Department {
	
	private int did;
	private String name;
	private String location;
	
	
	
	public Department() {
		
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", location=" + location + "]";
	}
	public Department(int did, String name, String location) {
		super();
		this.did = did;
		this.name = name;
		this.location = location;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
