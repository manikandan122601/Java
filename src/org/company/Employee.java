package org.company;

public class Employee {

	public void EployeeDob() {
		String Dob = "12/07/1995";
		System.out.println(Dob);	
	}
	
	public void age() {
		int age = 29;
		System.out.println(age);
	}
	
	public void idNo() {
		int id = 30;
		System.out.println(id);
	}
	
	public void empName() {
		String empName = "Manikandan";
		System.out.println(empName);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();	
		e.idNo();
		
	}
	
}
