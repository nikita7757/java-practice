package  While_loop_basic;
//write a pogram to count the odd digits of the given number
//input=  942111423
//*******************************************************************************

public class Program4 {
    public static void main(String [] args){
      int num =  942111423;
      int digit_count = 0;
      int rem;
      while(num != 0){
        rem = num % 10;
        if(rem%2!=0){
          digit_count++;
        }
        num =num /10;
      }
      System.out.println("digit_count="+digit_count);
    }
}