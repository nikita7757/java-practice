/*  Write a program in which the user to enter a number from 0 to 5 and print
 its speling it the number is greater than 5 print entered number is greater than 5.
 */

import java.io.*;
public class Program2 {
    public static void main(String[]args)throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
      int num;
      System.out.println("enter a number");
      num = Integer.parseInt(br.readLine());

    if(num>5){
         System.out.println("Number is greater than 5");
    }
    else{
        switch(num){
            case 1:
             System.out.println("one");
             break;
             case 2:
             System.out.println("Two");
             break;

             case 3:
             System.out.println("Three");
             break;

             case 4:
             System.out.println("Four");
             break;

             case 5:
             System.out.println("Five");
             break;
        }
        }
    }
} 
