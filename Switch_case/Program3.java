/* Write a program in which user enters two numbers
   me nummbers are positive multiply them and
   proceed to check result is odd or even.if user enters negative value
   give message negative numbers are not allowed.
 */
import java.util.Scanner;

public class Program3 {
    static int result ;
    void mult(int num1,int num2){
        if(num1 <0 ||num2<0){
            System.out.println("Sorry negative numbers are not allowed!");
        }
        else{
             result = num1*num2;
            System.out.println("multiplication ="+ result);
            switch(result%2){
                case 0:
                        System.out.println("Result is even");
                        break;
                case 1:
                        System.out.println("Result is odd");
                        break;
                default:
                    System.out.println("unexpected Result");
            }
        }
       
    }
    
}

class Client{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("please enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Program3 obj = new Program3();
        obj.mult(num1,num2);

        sc.close();

    }
}