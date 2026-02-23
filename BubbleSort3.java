package p1;

public class BubbleSort3 {
	static void print( int arr[]) {
		for(int ele : arr) {
			System.out.print(ele+ " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int arr [] = {8,5,2,0,-4};
		int n = arr.length;
		print(arr);
		for(int i = 0; i< n-1; i++ ) {
			boolean flag = true;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]  = arr[j+1];
				arr[j+1] = temp;
				flag = false;
			}
				
			}
			
			if(flag==true) break;
		}
		
		print(arr);
	}

}
