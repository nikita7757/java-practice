//package java-dailyflash.Daily_Ass.Control_Statement.nested_for_4;
// print pattern:-

// c2w10 
// c2w9 c2w8 
// c2w7 c2w6 c2w5 
// c2w4 c2w3 c2w2 c2w1 

public class C2W {
    public static void main(String[]args){
        int i,j,rows=4;
        int a=10;
        int b=1;
        for(i=1; i<=rows; i++){
            b++;
            for(j=1; j<b;j++){
                System.out.print("c2w"+a+" " );
                a--;
               
                
            } System.out.println();
        }
       
    }
}
