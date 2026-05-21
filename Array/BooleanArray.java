/* problem statement : revrse boolean array1 into array2*/

class BooleanArray {

	public static void main(String[] args) {


		boolean arr1[]= {true,false,true,false,false};
		boolean arr2[]= new boolean[arr1.length];
		
		int i ,j;
	
		
		for(i=0;i<arr1.length;i++) {
				arr2[i]=arr1[arr1.length -1-i];
				
				System.out.print(arr2[i]+" ");
		
				
		

		}
		

	}

}
/* output:- false false true false true */
