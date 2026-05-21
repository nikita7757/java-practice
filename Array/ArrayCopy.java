/* prblem statement -Take array1 of 5 integer elements and copy it into array2 then disaplay array1 */

class ArrayCopy {

	public static void main(String[] args) {

		int arr1[] = {10,20,30,40,50};
		int arr2[];
		arr2 =new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
		
			arr2[i] = arr1[i];
					System.out.print(arr2[i]+ " ");
		}

	}

}
