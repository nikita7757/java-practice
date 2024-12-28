
public class Addition {
	
	int a,b,c,d,e;
	
	public Addition() {
		a=10;
		b=20;
	}
	public void showData() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public void add() {
		c=a+b;
		System.out.println("Sum of instace variable="+c);
	}
	public void add(int c) {
		d=a+b+c;
		System.out.println("Sum of local variable="+d);
	}
	public void add(int c,int d) {
		e=a+b+c+d;
		System.out.println("Sum of local variable="+e);
	}
}
