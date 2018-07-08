public class Mergesort{


	 public void merge(int arr[], int l, int m, int r){

		int n1 = m - l + 1;
		int n2 = r - m;
	

		// copy over two arrays
		int arr1[] = new int [n1];
		int arr2[] = new int [n2];
 	
 		for(int i = 0; i < n1; i++){
 			arr1[i] = arr[l + i];
 		}
 		for(int j = 0; j < n2; j++){
 			arr2[j] = arr[m+1+j];
 		}

 		// compare and reorder
 		int i = 0;
 		int j = 0;
 		int k = l;

 		while(i < n1 && j < n2){

 			if(arr1[i] < arr2[j]) {
 				arr[k] = arr1[i];
 				i++;
 			} else {
 				arr[k] = arr2[j];
 				j++;
 			}
 			k++;
 		}
      
      	while(i < n1){
      		arr[k] = arr1[i];
      		i++;
      		k++;
      	}

      	while(j < n2){
      		arr[k] = arr2[j];
      		j++;
      		k++;
      	}

	}

	public void sort(int arr[], int ls, int rs) {

			if( ls == rs) return;

			int z = (ls + rs)/2;

			// sort two subarray
			sort(arr, ls, z);
			sort(arr, z + 1, rs);

			// merge two sorted arrays 
			merge(arr, ls, z, rs);
		

	}

	void print(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]){


		int arr[] = {12, 11, 13, 5, 6, 7};

		Mergesort ob = new Mergesort();
		ob.sort(arr, 0, 5);

		ob.print(arr);

		// int[] arraylike = new int[arr.length];
		// ob.print(arrays.sort(arr));

	}
}	

