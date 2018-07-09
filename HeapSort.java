public class HeapSort{

	public void heapify(int[] arr, int n, int i){

		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;


		if(l < n && arr[l] > arr[i]){

			int swap = arr[l];
			arr[l] = arr[i];
			arr[i] = swap;

			largest = l;


		} 
		
		if (r < n && arr[r] > arr[i]){

			int swap = arr[r];
			arr[r] = arr[i];
			arr[i] = swap;

			largest = r;
		
		} 

		if(i != largest) heapify(arr, n, largest);
		
	}

	public void sort(int[] arr){
		int n = arr.length;

		for(int i = n/2 - 1; i >= 0; i--){
			heapify(arr, n, i);
		}

		for(int i = n-1; i >= 0; i--){

			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;

			heapify(arr, i, 0);
		}


	}

	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
 
        HeapSort ob = new HeapSort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }




}