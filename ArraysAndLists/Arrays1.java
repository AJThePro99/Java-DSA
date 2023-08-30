import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] numberArray = new int[5];
        numberArray[0] = 1;

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i * i;
        }

        System.out.println(Arrays.toString(numberArray));
    }    
}
