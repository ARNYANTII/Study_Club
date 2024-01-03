package ISC;
import java.util.ArrayList;
public class Day77 {
    public static void main(String[] args) {
        ArrayList<Integer> angkaGanjil = new ArrayList<>();

        for (int i = 1; i <= 10; i += 2) {
            angkaGanjil.add(i);
        }

        System.out.println("Angka Ganjil:");
        for (int angka : angkaGanjil) {
            System.out.println(angka);
        }
    }
}
