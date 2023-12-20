package ISC;
import java.util.ArrayList;
public class Day73 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        System.out.println("ArrayList sebelum penjumlahan: " + numbers);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Jumlah elemen dalam ArrayList: " + sum);
    }
}

