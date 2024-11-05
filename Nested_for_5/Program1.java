package Nested_for_5;

public class Program1 {
    public static void main(String[]args){
        int row=4;
        
        for(int i=1;i<=row;i++){
            int x=4;
            for(int j=1;j<=4;j++){
                char ch1='D';
               
                if(i%2==1){
                    System.out.print(ch1-- +"" +x +" ");
                   x--;
                }
                else{
                    char ch2='A';
                  
                    System.out.print(ch2+"" + j+" ");
                   ch2++;
                  
                }
           }
            System.out.println();
        }
    }
}
