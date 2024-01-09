package ISC;
import java.util.Arrays;
public class Day91 {
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 12, 15};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Array setelah dibalik: " + Arrays.toString(array));
    }
}

