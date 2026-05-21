//program to print square of even digits in number
//input =  942111423
//*******************************************************************************
package While_loop_basic;

public class Program5 {
    public static void main(String [] args){
      int num =  942111423;
      int rem;
      while(num != 0){
        rem = num % 10;
        if(rem%2==0){
          System.out.println("square of "+rem +" is "+rem*rem);
        }
        num =num /10;
      }
    }
}