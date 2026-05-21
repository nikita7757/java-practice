//package java-dailyflash.Daily_Ass.Control_Statement.nested_for_4;

public class Program2 {
    public static void main(String[]args){
        int b=1,rows=5;
        
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i;j++){
                 
                System.out.print(b +" ");
               b++;
            } b++;
            System.out.println();
        }
       
    }
}

