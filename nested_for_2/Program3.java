package nested_for_2;

public class Program3 {
    public static void main(String [] args){
        int a =14;
        for(int i = 1; i<=4; i++){
            int b= a;
            for(int j = 1; j<=4;j++){
                System.out.print( b +"\t");
                b++;
            }
            System.out.println();
            a++;
        }
    }   
}

