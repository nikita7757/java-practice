/* WAP to return factorial of a number given by parameter passing to the function*/

public class Factorial {
	int factorial;
	
	public int Fact(int a) {
		for(int i=1;i<=a;i++) {
		factorial = i*a;
		
	}
		return factorial;
}
  
	public static void main(String[] args) {


		Factorial obj = new Factorial();
		System.out.println(obj.Fact(5));

	}

}

