package com.GL.Assignment;

public class AdminDepartment  extends SuperDepartment{
//String	deptName ="Admin Department";
public  String departmentName()
{
	deptName ="*** Welcome to Admin Department ***";
	return deptName;
}

public  String getTodaysWork()
{
	workToday ="Complete your document Submission";
	return workToday;
}

public  String getWorkDeadline()
{
	workDeadline ="Complete by EOD";
	return workDeadline;
}


}