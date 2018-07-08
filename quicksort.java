public class quicksort{
	

	public void sort(int arr[], int l, int r){

		if(l < r){

			int pivot = position(arr, l, r);

			sort(arr, l, pivot-1);
			sort(arr, pivot+1, r);

		}

	}

	public int position(int arr[], int l, int r){

		int compare = arr[r];

		int index = l-1;

		for(int i = l; i < r; i++){

			if(arr[i] <= compare){

				index++;
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}

		index ++;
		int temp = arr[index];
		arr[index] = arr[r];
		arr[r] = temp;

		return index;

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
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
 
        quicksort ob = new quicksort();
        ob.sort(arr, 0, n-1);
 
        System.out.println("sorted array");
        printArray(arr);
    }


}