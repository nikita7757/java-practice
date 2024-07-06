public class Program10 {
   
    public static void main(String[] args){
        int a=1;
        int x=1;
        for(int i=1;i<=4;i++){
           
            
            for(int j=a;j<=4;j++){
                System.out.print(x+ " ");
                x++;
            }
             x=--x;
            a++;
            System.out.println();
        }
    }
}
