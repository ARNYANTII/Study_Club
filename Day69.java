package ISC;
import java.util.ArrayList;
import java.util.Collections;
public class Day69 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("ArrayList sebelum pengurutan:");
        System.out.println(numbers);
        // Mengurutkan ArrayList
        Collections.sort(numbers);
        System.out.println("ArrayList setelah pengurutan:");
        System.out.println(numbers);
    }
}
