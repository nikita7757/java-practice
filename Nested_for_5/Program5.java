package Nested_for_5;

public class Program5 {
        public static void main(String [] args){
          int row=4;
          int y=4;
          int num1=0;
          int num2=1;
          int sum=0;
            for(int i=1;i<=row;i++){
                for(int j=y;j<=4;j++){  
                    if(i==1){
                        System.out.print("0");
                    } 
                    else{
                System.out.print((num2)+" ");
               num2=num2+num1;
                num1++;
            
                }
                }  
               y--;
                System.out.println();
            }
        
                
    }
    
}
