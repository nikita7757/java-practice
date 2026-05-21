public class Program8 {
    public static void main(String[]args){
        int i,j,n=10,rows=4;
        char ch='J';
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++){
                if(i%2==0){
                System.out.print(ch+" ");
                }else{
                     System.out.print(n+ " ");
                }ch--;
                n--;
            }System.out.println();
        }
}
}