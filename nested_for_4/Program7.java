public class Program7 {
    public static void main(String[]args){
        int i,j,n=1,rows=6;
        char ch='F';
        for(i=1;i<=rows;i++){
            char temp=ch;
            for(j=1;j<=i;j++){
                if(j%2!=0){
                     System.out.print(temp+" ");
                temp++;
                }else{
                System.out.print(n+" ");
                n++;
            }
            }
            ch--;
            System.out.println();
        }
    }
}
