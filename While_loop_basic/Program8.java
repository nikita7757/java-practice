// write prog to print count down of remaining days to submit assignment
package While_loop_basic;

public class Program8 {
    public static void main(String [] args){
        int day =7;
        if(day==0){
                System.out.println(day+ "days remainning");
        }
        else{
          while(day>=1){
            System.out.println(day+ "days remainning");
            day--;
          }
       }
    }
    
}
