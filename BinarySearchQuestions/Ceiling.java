import java.util.Scanner;

public class Ceiling {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number: ");
            array[i] = input.nextInt();
        }
    }
}
