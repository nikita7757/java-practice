package nested_for_2;

public class Program2 {
    public static void main(String [] args){
        int a =4;
        for(int i = 1; i<=4; i++){
            
            for(int j = 1; j<=4;j++){
                System.out.print( a +"\t");       
            }
            System.out.println();
            a++;
        }
    } 
}

