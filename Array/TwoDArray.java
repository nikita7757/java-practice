/*  2d array printing   */
class TwoDArray {

	public static void main(String[] args) {
		
		int arr[] []; // array declaration
		arr= new int[4][4];//memory allocation

    //array intializing 
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;

    //array printing
		System.out.print(arr[0][0]+" ");
		System.out.print(arr[0][1]+" ");
		System.out.println();
		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
	}

}
/* output:-
 10 20 
30 40
*/
