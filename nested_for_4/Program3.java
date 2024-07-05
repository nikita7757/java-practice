public class Program3 {
    public static void main(String[]args){
        int a=10,i,j,rows=4;
        for(i=1;i<=rows;i++){
            for(j=1; j<=i;j++){
                System.out.print(a-- +" ") ;
            }a++;
            System.out.println();
        }
    }
}
