/*      pattern:- print below pattern
            10 
            9 8
            7 6 5
            4 3 2 1 
  *******************************************************************************   */


public class Program3 {
    public static void main(String []args){
        int x=10;
        int a=4;
        for(int i=1;i<=4;i++){
            for(int j=a;j<=4;j++){
                System.out.print(x+" ");
                x--;
            }
            a--;
            System.out.println();
        }
      
    }
    
}
