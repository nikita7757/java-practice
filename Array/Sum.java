class Sum {
	
		public static void main(String[] args) {
			int sum =0;

			int arr[];
			arr = new int[5];
			
			//initialization of elements of arrays
			arr[0]= 10;
			arr[1]= 20;
			arr[2]= 30;
			arr[3]= 40;
			arr[4] = 50;
	
			//printing elements of array
			for(int i =0;i<arr.length;i++) {
				System.out.println(arr[i]);
				sum = sum+arr[i];

			}	
			System.out.println("sum="+sum);
		}
}
