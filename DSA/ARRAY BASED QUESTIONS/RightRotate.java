/******************************************************************************
roatate array right by one
            input = 1,2,3
            output= 3,1,2

*******************************************************************************/
import java.util.*;
public class Main
{
    
    static void rightRotate(int arr[],int n){
        
        int temp = arr[n-1];
        for(int i = n-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	 
	int arr[] = new int[n];
	
	for(int i= 0; i<n;i++){
	    arr[i] =  sc.nextInt();
	}
    rightRotate(arr,n);
    for(int i= 0; i<n;i++){
	    System.out.println(arr[i]);
	}
	
	}
}
