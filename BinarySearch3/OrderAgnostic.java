package first;
public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {102, 100, 96, 81, 62, 46, 24, 19, 10, 8, 4, 0, -1, -4, -6, -12, -24, -91};
        int answer = agnosticSearch(arr, 81);
        
        System.out.println("index: " + answer);
    }

    static int agnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in Asc or Desc

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            // find middle element
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target < arr[middle]) {
                end = middle - 1;
                }

                else if (target > arr[middle]) {
                start = middle + 1;
                }
            }
            else {
                if (target > arr[middle]) {
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
            }

            
        }
        return -1;
    }
        
}
