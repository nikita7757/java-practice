package While_loop_basic;
//write a program to check whether given number is pallindrome or not
class Program100 {
    
public static void main(String [] args){
        
        int a = 2332;
        int rem =0;
        int rev = 0;
        int temp = a;
        while (temp != 0){
         rem = temp % 10;
         rev = rev *10 + rem;
         temp = temp/10;

         

        }
        if (a == rev){
            System.out.println(a+" is a palindrome number");
        } else{
            System.out.println("no. is not a palindrome number");
        }
        }
    }


    


        

    
