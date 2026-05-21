//program to take number from user if number is even print number in reverse order if number is off print in reverse order indiffernce of 2
package While_loop_basic;

public class Program7 {
    public static void main(String [] args){
      int num = 9;
        if(num%2==0){
          while(num>=1){
            System.out.println(num+" ");
            num--;
          }  

        }
        else{
            while(num>1){
                System.out.println((num-2)+ " ");
                num=num-2;
            }
           
        }
    }
}