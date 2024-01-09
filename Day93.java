package ISC;
import java.util.HashSet;
import java.util.Set;
public class Day93 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 2, 6, 8, 10, 12};
        Set<Integer> elemenUnik = new HashSet<>();

        for (int nilai : array) {
            elemenUnik.add(nilai);
        }

        System.out.println("Elemen unik dalam array: " + elemenUnik);
    }
}
