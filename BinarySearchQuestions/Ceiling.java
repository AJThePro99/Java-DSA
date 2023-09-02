import java.util.Scanner;

public class Ceiling {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number: ");
            array[i] = input.nextInt();
        }
        System.out.print("Your target Number: ");
        int target = input.nextInt();

        ceiling(array, target);
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return -1;
            }
        }
        return -1;
    }
}
