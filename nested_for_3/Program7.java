public class Program7 {
    
    public static void main(String[] args) {
        int a=6;
        char ch='f';
        for(int i=1;i<=6;i++){
            char ch1=ch;
            for(int j=a;j<=6;j++){
                System.out.print(ch1+" ");
                ch1++;
            }
            ch--;
           
           a--;
            System.out.println();
        }
    }
}
