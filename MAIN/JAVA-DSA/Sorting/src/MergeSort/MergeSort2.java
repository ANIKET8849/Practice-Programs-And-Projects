package MergeSort;
import java.util.Arrays;

public class MergeSort2 {

    public static void main(String[] args) {
        int[] arr = {9,2,1,6,5,8,3,1,7,4};
        MergeSort2 mSort2=new MergeSort2();
        mSort2.iterativeMergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void iterativeMergeSort(int[] arr, int n) {
        int len = 1; 
        while (len < n) {
            int i = 0;
            while (i < n) {
                int L1 = i;              
                int R1 = Math.min(i + len - 1, n - 1); 
                int L2 = i + len;
                int R2 = Math.min(i + 2 * len - 1, n - 1);
                if (L2 >= n) {
                    break;
                }
                int[] temp = merge(arr, L1, R1, L2, R2);
                for (int j = 0; j < temp.length; j++) {
                    arr[i + j] = temp[j];
                }
                i =i+ 2 * len;
            }
            len =len* 2;
        }
    }
    public static int[] merge(int[] arr, int L1, int R1, int L2, int R2) {
    	int l=R1 - L1 + 1;
    	int r=R2 - L2 + 1;
        int[] temp = new int[l+r];
        int k = 0, i = L1, j = L2;
        while (i <= R1 && j <= R2) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= R1) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= R2) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        return temp;
    }
}

