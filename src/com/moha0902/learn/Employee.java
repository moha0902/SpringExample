package com.moha0902.learn;

public class Employee {
    
	private int empId = 000;
	private String empName = "SampleName";
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String toString(){
		String employee = String.format(
			"Employee Id : %s \n" +
			"Employee name: %s ", empId, empName);
		
		return employee;
	}
}
