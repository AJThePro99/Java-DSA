import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numberArray = new int[5];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i * i;
        }

        System.out.println(Arrays.toString(numberArray));

        // Enchnced for loop:

        for (int num: numberArray) {
            System.out.print(num + " "); // Here, num represents the element in the array

        }
    }    
}
