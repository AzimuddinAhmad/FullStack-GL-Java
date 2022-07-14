package com.GL.Assignment;

public class SuperDepartment {
	public	String deptName;
	public	String workToday;
	public String workDeadline;
	public String today;

	public  String departmentName()
	{
	 deptName ="Super Department";
		return deptName;
	}

	public  String getTodaysWork()
	{
		workToday ="No Work As of Now";
		return workToday;
	}

	public  String getWorkDeadline()
	{
		 workDeadline ="Nil";
		return workDeadline;
	}
	public  String isTodayAHoliday()
	{
		today ="Today is not a Holiday ..!";
		return today;
	}
}