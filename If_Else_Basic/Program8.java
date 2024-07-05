package If_Else_Basic;
 //write a program to check day no. (1-7)and print corresponding day of week
 //input = 6
 //*******************************************************************************

 class Program8 {
    public static void main(String [] args){

        int day = 6;
        if(day==1){
            System.out.println("monday");

        }
         if(day==2){
            System.out.println("tuesday");

        }
         if(day==3){
            System.out.println("wednesday");

        }
         if(day==4){
            System.out.println("thursday");

        }
         if(day==5){
            System.out.println("friday");

        }
         if(day==6){
            System.out.println("saturday");

        }
         if(day==7){
            System.out.println("sunday");

        }
         if(day<1 && day>7){
            System.out.println("enter valid input");

        }

    }
    
}
