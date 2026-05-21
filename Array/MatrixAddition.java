//Take arr1 and arr2 of 2*2 and perform matrix addition on it then store it in arr3


public class MatrixAddition {
	public static void main(String[] args) {
		int arr1[][] = {{10,20},{30,40}};
		int arr2[][] = {{1,2},{3,4}};
		int arr3[][] = new int[2][2];
		
		for(int i=0 ;i<arr1.length;i++) {
			for(int j=0 ;j<arr1[i].length;j++) {
				arr3[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		 System.out.println("Resultant Matrix:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(arr3[i][j] + " ");
	            }
	            System.out.println();
		
	}
	}
}
/*output
  Resultant Matrix:
11 22 
33 44 
*/
