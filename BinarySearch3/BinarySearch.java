package first;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-91, -24, -12, -6, -4, -1, 0, 4, 8, 10, 19, 24, 46, 62, 81, 96, 100, 102};
        int answer = binarySearch(arr, 81);
        
        System.out.println("index: " + answer);
    }

    // return index
    // return -1 if target does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find middle element
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            }

            else if (target > arr[middle]) {
                start = middle + 1;
            }

            else {
                return middle;
            }
        }
        return -1;
    }
}