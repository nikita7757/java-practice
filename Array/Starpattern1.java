      /* print star pattern using array  * * * * * 
                                         * * * * 
                                         * * * 
                                         * * 
                                         * 
                                    
  */
  

class Starpattern1.java {

	public static void main(String[] args) {
		char arr[][]= {{'*','*','*','*','*'},{'*','*','*','*'},{'*','*','*'},{'*','*'},{'*'}};
		
	
		int i,j;
			System.out.println();
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
	}
}
