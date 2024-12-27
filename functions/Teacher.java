
public class Teacher {
	int id,yp,tl,pl;
	String city,name,subject;
	
	public void setData(int id,int yp, String name, String city, String subject,int tl,int pl) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.subject=subject;
		this.yp=yp;
		this.pl=pl;
		this.tl=tl;
		
	}

	public void showData() {
	 System.out.println("id="+id);
	 System.out.println("name="+name);
	 System.out.println("city="+city);
	 System.out.println("subject="+subject);
	 System.out.println("yp="+yp);
	 System.out.println("tl="+tl);
	 System.out.println("pl="+pl);
}
	public void salary() {
		int monthly_salary = yp/12;
		int daily_salary = monthly_salary/30;
		int non_paidleave;
		if(tl<=2) {
			System.out.println("total salary of teacher="+monthly_salary);
		}
		else {
			
			non_paidleave= tl-pl;
			monthly_salary=monthly_salary-(daily_salary*non_paidleave);
			System.out.println("total salary of teacher="+monthly_salary);
		}
		
	}
}
