/* WAP to take size of array and also take integer element from user and print
  sum of odd elements only.
 */

package Array;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int size;
        System.out.println("Please enter size of array:");
        size = obj.nextInt();
        int arr[]=new int[size];

        System.out.println("Please elements of array of size"+size+":");
        for(int i=0;i<arr.length;i++){
            arr[i] =obj.nextInt();
        }

        int sum = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2!=0){
            sum= sum+arr[i];
           }
        }
        System.out.println(sum);
        

    }
    
}
