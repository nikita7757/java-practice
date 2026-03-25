// A large helium balloon can carry people up in the air, but it has a maximum weight capacity C.
// There are N people who want to ride the balloon. Each person has a certain weight.
// The balloon can only fly if the total weight of the selected people does not exceed the capacity C.
// Your task is to determine the maximum number of people that can ride the balloon without exceeding the weight capacity.
  
import java.util.*;
class BalloonCapacity {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int capacity = sc.nextInt();
                   
       int arr[] = new int[n];
       
         for(int j = 0; j <n ; j++) {
                arr[j]=sc.nextInt();
            }

            
        Arrays.sort(arr);
        int count=0;
        int sum=0;
         for(int j = 0; j <n ; j++) {
             if(sum+arr[j]<=capacity){
                 count++;
                 sum +=arr[j];
             }
             
        }
        System.out.println(count);
    }
}


       
        
    
