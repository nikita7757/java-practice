package com.acc.Banksystem;

public abstract class Person {
	String name,address,city,branch;
	int age,mobno;
	char gender;
	
	public void setData(String name,String address,String city,int age,char gender,int mobno,String branch) {
		this.name=name;
		this.address=address;
		this.city=city;
		this.age=age;
		this.gender=gender;
		this.mobno=mobno;
	
		this.branch=branch;
	}
	
	public abstract void showData();
		
	
}
