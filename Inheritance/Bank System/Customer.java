package com.acc.Banksystem;

public class Customer extends Person {
	
	
	int acno,loanamt,fdno,cid;
	float bal;
	
	public void setData(int acno,int loanamt,int cid,int fdno,float bal) {
		this.acno=acno;
		this.loanamt=loanamt;
		this.cid=cid;
		this.bal=bal;
		this.fdno=fdno;
	}
	
	public void showData() {
		 System.out.println("name of customer="+name);
		 System.out.println("city="+city);
		 System.out.println("address="+address);
		 System.out.println("mobno="+mobno);
		 System.out.println("age="+age);
		 System.out.println("gender="+gender);
		 System.out.println("branch="+branch);
		 System.out.println("acno="+acno);
		 System.out.println("loanamt="+loanamt);
		 System.out.println("cid="+cid);
		 System.out.println("bal="+bal);
		 System.out.println("fdno="+fdno);
	}
	
}
