/* Problem statement :- display a menu card to perform mathematical operations*/


package LoopingControlStructure;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		int num1,num2,result;
		 System.out.println("*******menu********");
		 System.out.println("1.Addition");
		 System.out.println("2.Substraction");
		 System.out.println("3.multiplication");
		 System.out.println("4.Division");
		 System.out.println("5.Modulus");
		 
		 
		 Scanner Sc = new Scanner(System.in);
		 
		 int choice = Sc.nextInt();
		 
		switch(choice) { 
		case 1:
			 System.out.println("Enter 2 numbers to perform addition");
			 num1 =Sc.nextInt();	
			 num2 =Sc.nextInt();	
			 result =num1+num2;
			 System.out.println("Addition is:"+result);
			 break;
		case 2:
			 System.out.println("Enter 2 numbers to perform subtraction");
			 num1 =Sc.nextInt();	
			 num2 =Sc.nextInt();	
			 result =num1-num2;
			 System.out.println("Subtraction is:"+result);
			 break;
		case 3:
			 System.out.println("Enter 2 numbers to perform multiplication");
			 num1 =Sc.nextInt();	
			 num2 =Sc.nextInt();	
			 result =num1*num2;
			 System.out.println("Multiplication is:"+result);
			 break;
		case 4:
			 System.out.println("Enter 2 numbers to perform division");
			 num1 =Sc.nextInt();	
			 num2 =Sc.nextInt();	
			 result =num1/num2;
			 System.out.println("Division is:"+result);
			 break;
		case 5:
			 System.out.println("Enter 2 numbers to perform operation");
			 num1 =Sc.nextInt();	
			 num2 =Sc.nextInt();	
			 result =num1%num2;
			 System.out.println("remainder is:"+result);
			 break;
	   default:
		   System.out.println("Please enter valid choice");
		}

	}

}
