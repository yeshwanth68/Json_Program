package json;

import java.io.Serializable;

import org.json.JSONObject;

public class jsonjavabean implements Serializable{
	
	private int empid;
	private String name;
	private double salary;
	
	
	public jsonjavabean() {
		
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
class beanmain{
	public static void main (String args[]) {
		jsonjavabean e = new jsonjavabean();
		e.setEmpid(01);
		e.setName("Yeshwanth");
		e.setSalary(5000);
		System.out.println(e.getEmpid());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		JSONObject js=new JSONObject(e);
		System.out.println(js.toString(4));
		
		
	}
}