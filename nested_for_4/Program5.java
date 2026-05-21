/*A B C D 
  B C D 
  C D
  D*/
public class Program5 {
    public static void main(String[]args){
        int i,j,rows=4;
        char ch='A';
        for(i=1;i<=rows;i++){
            char temp =ch;
            for(j=1;j<=(rows-i+1);j++){
                System.out.print(temp+" ");
                temp++;
            }
            ch++;
            System.out.println();
        }
    }
}
