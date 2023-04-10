package com.Assignment3;

public class EmployeeDemo
{
	private int empId=2;
	private String name;
	private int basicSal=20000;
	private int incentive=200;
	
	EmployeeDemo(String empName, int eid)
	{
		name=empName;
		empId=eid;
		
	}
	
	public void countSalaries()
	{
		System.out.println("Total salary is="+(basicSal+incentive));
	}
	
	
    public int getEmpId() {
		return empId;
	}

    public void setEmpId(int empId) {
		this.empId = empId;
	}

    public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

    public int getBasicSal() {
		return basicSal;
	}

    public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}

    public int getIncentive() {
		return incentive;
	}

    public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

}
