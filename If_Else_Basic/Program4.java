package If_Else_Basic;
////Writw a java programthat checks a number from 0 to 5 & prints its spelling . if the number is greater than 5 .
//input = 4.
//*******************************************************************************
 
class Program4 {
	public static void main (String[] args){
             int var =4;
	     if(var<0){
		    System.out.println(var+"is less than 0");
	     }else if(var==0){
		    System.out.println(var+"is equal to zero");
	     }else if (var==1){
		    System.out.println("one");
	     }else if (var==2){
		    System.out.println("two");
	     }else if(var==3){
		    System.out.println("three");
	     }else if(var==4) {
		    System.out.println("four");
	    } else if (var==5){
		    System.out.println("five");
	    }else {
		    System.out.println(var+"is greater than five");
	    }
	}
}
					 
				   
