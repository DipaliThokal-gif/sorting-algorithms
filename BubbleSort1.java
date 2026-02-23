package p1;

public class BubbleSort1 {
	static void print(int arr []) {
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int arr [] = {5,4,3,2,1};
		print(arr);
		int n = arr.length;
		
		for(int j=1; j<=n-1; j++) {
			for(int i=0; i< n-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
				
			}
		}
		
		print(arr);
		
	}
	

}
