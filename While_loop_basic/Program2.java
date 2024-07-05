package While_loop_basic;
//write a pogram to print factorial of given number
//input = 6
//*******************************************************************************

public class Program2 {
    public static void main( String [] args){
        int num = 6;
        int i = 1;
        int  fact = 1;
        while (i <= num){
            fact = fact*i;
            i++;
            
        }
        System.out.println("factorial is "+fact);
    }
    
}
