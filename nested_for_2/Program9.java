package nested_for_2;

public class Program9 {
    public static void main(String [] args){
        int rows=3;
        int a =1;
        for(int i = 1; i<=rows; i++){
            int num = rows;
            char ch = 'C';
            for(int j = 1; j<=rows; j++){
                System.out.print(a*a +"" +ch-- +num-- +" ");
                a++;
                
            }
            System.out.println();
        }
    } 
}

