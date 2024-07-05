package nested_for_2;

public class Program4 {
    public static void main(String [] args){
        
        for(int i = 1; i<=3; i++){
            char ch='A';
            for(int j = 1; j<=3;j++){
                System.out.print(j+ "" +ch++ +"   ");
                
            }
            System.out.println();
        }
    } 
}

