package basicprogramme;

public class MergeSort {
    public static void main(String[] args) {
        String input = "hello";
        String sorted = sortString(input);
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sorted);
    }

    private static String sortString(String input) {
        char[] chars = input.toCharArray();
        mergeSort(chars, 0, chars.length - 1);
        return new String(chars);
    }

    private static void mergeSort(char[] chars, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(chars, left, mid);
            mergeSort(chars, mid + 1, right);
            merge(chars, left, mid, right);
        }
    }

    private static void merge(char[] chars, int left, int mid, int right) {
        int n1 = mid - left + 1; // 2-0=2+1=3
        int n2 = right - mid; // 4-4 = 2

        char[] leftArray = new char[n1]; 
        char[] rightArray = new char[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = chars[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = chars[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {  // 0 1 2 3 4 size = 5 mid = 4+0/2 = 2
                    chars[k] = leftArray[i];          // h e l      l o
                    i++;                              // 0 1 2   // 0 1
                } else {                             // 0 1 2 3 4
                                                    // h e l l o
                    chars[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                chars[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < n2) {
                chars[k] = rightArray[j];
                j++;
                k++;
            }
        

    }
}
