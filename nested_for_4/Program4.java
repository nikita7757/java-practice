/*1 2 3 4 
  2 3 4 
  3 4
  4*/
public class Program4 {
    public static void main(String[]args){
        int rows=4,i,j,temp;
        for(i=1;i<=rows;i++)
        {   temp=i;
            for(j=1;j<=(rows-i+1);j++){
                System.out.print(temp+"  ");
                temp++;
            }
            System.out.println();
        }
} 
}
