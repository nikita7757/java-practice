/******************************************************************************
move all zeros from array to end
ex arr =[1,0,2,0,2,3] ======[1,2,2,3,0,0]
with taking inputs from user 
*******************************************************************************/
import java.util.*;
class MoveAllZeros {
  static  void moveZero(int arr[],int n) {
        
      int temp ;;
      int z = 0;
      for(int i =0; i<n; i++){
            if(arr[i]!=0){
                temp = arr[i];
                arr[i]= arr[z];
                arr[z] = temp;
                z++; 
            }
        } 
       
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        moveZero(arr,size);
        for(int i =0; i<size; i++){
             System.out.println(arr[i]);
        }
       
    }
  
}
