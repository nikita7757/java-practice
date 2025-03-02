/* 
 * Write a program to print the numbers divisible by i from 1 to 50 & the number is even also pret de count of even numbers.
    Input: Enter a lower fimit: 1 Enter upper limit: 50
    Output
 */

package Nested_for_6;

import java.util.Scanner;

public class Program1 {
    public static void main(String [] args){
    int count=0;
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter starting num");
    int startnum = Sc.nextInt();

    System.out.println("Enter ending num");
    int endnum = Sc.nextInt();

    for(int i=startnum;i<=endnum;i++){
        
        if(i%5==0 && i%2==0){
            System.out.print(i + " ");
            count++;
        }
      
    }
        
    System.out.println();
    System.out.println( "count =" +count);
    Sc.close();
}
}
