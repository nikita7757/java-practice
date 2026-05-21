public class Program6 {
    public static void main(String[]args){
        int i,j,rows=4;
        for(i=1; i<=rows;i++){
            int temp=i;
            for(j=1; j<=i;j++){
                System.out.print(" "+ temp+" ");
                temp++;
            }
            System.out.println();

        }
    }
}
