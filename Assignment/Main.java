package com.GL.Assignment;

public class Main {

	public static void main(String[] args) {
	//	SuperDepartment sd = new AdminDepartment();

		AdminDepartment adminDept= new AdminDepartment();
		System.out.println(adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());

		HRDepartment hrDept= new HRDepartment();
		System.out.println("\n"+ "\n"+hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());

		TechDepartment techDept= new TechDepartment();
		System.out.println("\n"+ "\n"+techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());


	}

}