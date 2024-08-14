package Nested_for_5;

public class Program3 {
    public static void main(String [] args){
        int row=5;
        int x=1;
       int y=5;
        for(int i=1;i<=row;i++){
         
            for(int j=y;j>=1;j--){
                System.out.print((x*j)+" ");
            }
            x++;
            y--;
            System.out.println();
        }
    }
            
}
