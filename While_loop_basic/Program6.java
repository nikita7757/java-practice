//program to print sum of even numbers and multiplication of odd numbers between 1 to 10
//*******************************************************************************
package While_loop_basic;

public class Program6 {
    public static void main(String [] args){
      int num = 1;
      int sum=0;
      int multi=1;
      while(num <=10){
        if(num%2==0){
          sum=sum+num;
        }
        else{
            multi=multi*num;
        }
        num++;
      }
      System.out.println(("the sum of even numbers  between 1 to 10 is"+ sum));
      System.out.println(("the multiplication of odd numbers  between 1 to 10 is"+ multi));
    }
}