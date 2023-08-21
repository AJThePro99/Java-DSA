package BinarySearch3;
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {-91, -24, -12, -6, -4, -1, 0, 4, 8, 10, 19, 24, 46, 62, 81, 96, 100, 102};
        int[] reversed = new int[array.length];
        reversed = reverse(array);

        for (int i : reversed) {
            System.out.print(i + ", ");
        }
    }

    static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        int length = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[length];
            length --;
        }
        return reversed;
    }
}
