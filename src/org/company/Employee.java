package org.company;

public class Employee {

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
