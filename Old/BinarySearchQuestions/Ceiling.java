import java.util.Scanner;

public class Ceiling {
    public  static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("---Ceiling Function---");
        System.out.println("Input your own array, and the ceiling of target number will be shown");
        System.out.print("Input Length of your Array: ");

        int length = input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number: ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter your target number: ");
        int target = input.nextInt();

        System.out.println("Finding Ceiling ...");

        int index = ceiling(array, target);

        System.out.println("The ceiling is in position " + (index + 1));
        System.out.println("And the ceiling is " + array[index]);
        
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
