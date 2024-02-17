import java.util.Scanner;

class reversingNumbers {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
       System.out.print("Enter number: ");
       int number = input.nextInt();

       System.out.println(reverseUsingWhile(number));
       System.out.println(reverseUsingFor(number));
       System.out.println(reverseUsingRecursion(number, 0));
    }

    public static int reverseUsingWhile(int number) {
        int ans = 0;
        while (number > 0) {
            ans = (ans * 10) + (number % 10);
            number /= 10;
        }
        return ans;
    }

    public static int reverseUsingFor(int number) {
        int reversed = 0;
        for (; number > 0; number /= 10) {
            reversed = (reversed * 10) + (number % 10);
        }
        return reversed;
    }

    public static int reverseUsingRecursion(int number, int reversed) {

        if (number > 0) {
            reversed = (reversed * 10) + number % 10;
            number /= 10;
            return reverseUsingRecursion(number, reversed);            
        }
        else {
            return reversed;
        }
    }
}