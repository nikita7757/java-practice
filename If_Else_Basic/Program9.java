package If_Else_Basic;
 //write a program in the java to accept three no. and check whether they are pythagorous triplts or not 
 // input = 3,4,5,
 //*******************************************************************************

 class Program9 {
  public static void main(String [] args)  {
    int a = 3;
    int b = 4;
    int c = 5;
    if(((a*a)+(b*b)==(c*c))||(b*b + c*c == a*a)||(a*a + c*c == b*b)){
        System.out.println("it is a pythagorean triplet");
    }else
        System.out.println("it is not pythagorean triplet");
    }
  }

