/*   print below pattern:-
			    1 
				2 3
				4 5 6
                7 8 9 10
 ****************************************************************************************/


public class Program2 {
    public static void main(String[]args){
        int rows = 4;
        int a= 1;
        for(int i=1; i<=rows;i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
              
            } 
            System.out.println();
        }
    }
    
}
