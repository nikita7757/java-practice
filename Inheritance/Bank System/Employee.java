package com.acc.Banksystem;

public class Employee extends Person{
	String designation,department,username,password;
	int salary,tl,pl,empid;
	
	public void setData(String designation,String department,String username,String password,int salary,int tl,int pl,int empid) {
		this.designation=designation;
		this.department=department;
		this.username=username;
		this.password=password;
		this.salary=salary;
		this.tl=tl;
		this.pl=pl;
		this.empid=empid;
	}
	
	public void showData() {
		 System.out.println("name of employee="+name);
		 System.out.println("city="+city);
		 System.out.println("address="+address);
		 System.out.println("mobno="+mobno);
		 System.out.println("age="+age);
		 System.out.println("gender="+gender);
		 System.out.println("branch="+branch);
	
		 System.out.println("salary="+salary);
		 System.out.println("designation="+designation);
		 System.out.println("department="+department);
		 System.out.println("username="+username);
		 System.out.println("password="+password);
		 System.out.println("tl="+tl);
		 System.out.println("pl="+pl);
		 System.out.println("empid="+empid);
}
}
