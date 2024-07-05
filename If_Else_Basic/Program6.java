package If_Else_Basic;
 //Writw a java program to find a maximum between a three numbers
 //input = 1,2,3
//*******************************************************************************


 class Program6 {
    public static void main(String[] args){
    int x = 1;
    int y = 2;
    int z = 3;
    if(x>y&& x>z){
        System.out.println(x+"is a maximum between " +x+ " " +y +" "+z);
    } else if(y>x && y>z){
        System.out.println(y+"is maximum between "+ x +"  "+ y+" " + " "+z );
    } else{
        System.out.println(z+"is a maximum between "+  x +" "+ y+" " + " "+z);
    }
}
}
    
