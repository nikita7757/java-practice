/*   print below pattern:-
			  				c2w 
			            	c2w c2w         
	            			c2w c2w c2w     
                            c2w c2w c2w c2w
 ****************************************************************************************/


public class Program1 {
    public static void main(String[]args){
   int rows = 4;
    for(int i = 1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print("c2w ");

        }
        System.out.println();
}
    }
}