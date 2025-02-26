package QuickSort;

public class QuickSort {
	int partition(int arr[],int low,int high) {
		int mid =(low+high)/2;
		int pivot=arr[mid];
		while(low<high) {
			while (arr[low] < pivot) {
			    low++;
			}
			 while (arr[high] > pivot) {
	                high--;
	            }
			if (low<=high) {
				int temp =arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		
		return low;
	}
	
	void sort(int arr[],int l,int h) {
		if (l<h) {
			int pi=partition(arr, l, h);
			sort(arr, l, pi-1);
			sort(arr, pi, h);
		}
	}

	void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,7,44,3,8,5,4,55};
		QuickSort qSort =new QuickSort();
		qSort.sort(arr, 0, arr.length-1);
		qSort.printarr(arr);
	}

}

