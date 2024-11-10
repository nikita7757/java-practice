/*Problem statement:-
Define a class student with rollno,name city marks of three subjects as a member variables.
Also define setData(parametrs)using ---parameter passing no return value and shoeData using
----no parameter no return value.
Calculate the percentage of student –per()using no parameter but return value.
And return result – with parameter with return value.
*/

public class Student {
	int rollno,cns_marks,dsa_marks,dbms_marks,avg;
	double per;
	String name,city;
	
	public void setData(int cns,int dbms,int dsa,String studentname,String studentcity) {
		cns_marks = cns;
		dsa_marks = dsa;
		dbms_marks = dbms;
		city= studentcity;
		name = studentname;
		
	}
	public void showData() {
		System.out.println("marks of cns are :"+cns_marks);
		System.out.println("marks of dsa are :"+dsa_marks);
		System.out.println("marks of dbms are :"+dbms_marks);
		System.out.println("student name:"+name);
		System.out.println("student city:"+city);
	}
	public double percentage() {
	    double per = ((cns_marks + dsa_marks + dbms_marks) / 300.0) * 100;
	    return per;
	}
	
	public int avg(int sub1, int sub2) {
		 avg = (sub1+sub2)/2;
		 return avg;
	}

}
