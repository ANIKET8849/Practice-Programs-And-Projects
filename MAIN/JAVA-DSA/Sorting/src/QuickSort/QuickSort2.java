package QuickSort;

public class QuickSort2 {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort the subarrays
            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Pivot is the first element (leftmost)
        int pivot = arr[low];

        // Initialize two pointers
        int i = low - 1; // Smaller element index
        int j = high + 1; // Greater element index

        while (true) {
            // Find an element greater than or equal to the pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // Find an element smaller than or equal to the pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // If the pointers have crossed, the partition is complete
            if (i >= j) {
                return j;
            }

            // Swap the elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 1, 0, 9, 6};
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
