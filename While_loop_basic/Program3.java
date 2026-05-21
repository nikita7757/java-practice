package While_loop_basic;
////write a pogram to count the digits of given number 
//input = 942111423
//*******************************************************************************

public class Program3 {
    public static void main(String [] args){
      int num = 942111423;
      int digit_count = 0;
      //int rem;
      while(num != 0){
      //  rem = num % 10;
        num =num /10;
        digit_count++;
      }
      System.out.println("digit_count="+digit_count);
    }
}

