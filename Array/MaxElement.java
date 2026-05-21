/* WAP to display max element of a array*/

class MaxElement {

	public static void main(String[] args) {
		
		int arr[]= {10,20,90,40,50};
		int max = 0;
		for(int i=0;i<5;i++) {
			if(arr[i]>max) {
				max= arr[i];
			
				}
			
		}
		System.out.println("max element is:"+max);
		
	}

}
