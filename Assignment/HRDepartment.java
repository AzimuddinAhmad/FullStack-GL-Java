package com.GL.Assignment;

public class HRDepartment extends SuperDepartment {

	public  String departmentName()
	{
	 deptName ="*** Welcome to HR Department ***";
		return deptName;
	}

	public  String getTodaysWork()
	{
		workToday ="Fill today's timesheet and Mark your Attendance";
		return workToday;
	}

	public  String getWorkDeadline()
	{
		 workDeadline ="Complete by EOD";
		return workDeadline;
	}

	public  String doActivity()
	{
		 String activity ="Team Lunch";
		return activity;
	}

}