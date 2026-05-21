package Nested_for_5;

public class Program2 {
    public static void main(String [] args){
        int row=6;
        int x=1;
      
        for(int i=1;i<=row;i++){
         
            for(int j=1;j<=6;j++){
                if(x==j){
                    System.out.print("# ");
                }
                else{
                    System.out.print("= ");
                }
            }
         
            x++;
            System.out.println();
        }
    }
    
}
