//write a program to reverse the given number 
package While_loop_basic;


class Program9 {
    public static void main(String [] args){
        
        int a = 942111423;
        int rem =0;
        int rev = 0;
        int temp = a;
        while (temp != 0){
         rem = temp % 10;
         rev = rev *10 + rem;
         temp = temp/10;

         

        }{
            System.out.println(a+" after reverse is  "+rev ) ;

        }
    }
}
    
