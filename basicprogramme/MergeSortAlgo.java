package basicprogramme;

public class MergeSortAlgo {
    public static void main(String[] args) {
        String input = "arjunkaushik";
        String sorted = sortString(input);
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sorted);
    }

    private static String sortString(String input) {
        char[] chars = input.toCharArray();
        mergeSort(chars, 0, chars.length-1);

        return new String(chars);
    }

    private static void mergeSort(char[] arr, int low, int high) {
        while (low <  high) {
            int mid = (high+low)/2; 

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(char[] arr, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;

        char[] leftArray = new char[n1];
        char[] rightArray = new char[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[low+i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=low;

        while (i<n1 && j<n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }else{
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
             arr[k] = leftArray[i];
                i++;
                k++;
        }

        while (j<n2) {
             arr[k] = rightArray[j];
                j++;
                k++;
        }
    }
}
