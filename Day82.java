package ISC;
import java.util.Arrays;
public class Day82 {
    public static void main(String[] args) {
        int[] angka = {35, 10, 50, 20, 15};   
        System.out.println("Array sebelum diurutkan: " + arrayToString(angka));
        Arrays.sort(angka);
        System.out.println("Array setelah diurutkan: " + arrayToString(angka));
    }
    private static String arrayToString(int[] array) {
        return Arrays.toString(array);
    }
}

