class InfiniteArray {
    public static void main(String[] args) {
        // start with the box of size 2 :
        int[] arr =  {3, 4, 6, 7, 10, 12, 14, 16, 18, 19, 22, 26, 28, 30, 46, 58, 61 /*16*/, 68, 72,
        75, 89, 90, 92, 99, 100, 121, 158, 161};
        int target = 61;
        System.out.println(ans(arr, target));
        
    }

    static int ans(int[] arr, int target) {
        // find the range first
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for target to lie in end
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the search area
            end = end + (end - start + 1) * 2;
            start = newStart;

        } 
        return infiniteSearch(arr, target, start, end);
    }

    static int infiniteSearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < target) {
                start = mid + 1;
            }
            else if (mid > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}