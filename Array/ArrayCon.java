/* problem statement - take array of 5 integer elements and array2 of 3 int elements then 
  concatenate both array into arr3*/

 class ArrayCon {

	public static void main(String[] args) {
		
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {70,80,90};
		int arr3[] =new int[arr1.length+arr2.length];
		
		for(int i =0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for(int i =0;i<arr2.length;i++) {
			arr3[arr1.length+i] = arr2[i];
			
		}
		for(int i =0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
			
		}

	}

}
