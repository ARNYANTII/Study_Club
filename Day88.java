package ISC;
import java.util.Scanner;
public class Day88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka;
        int total = 0;

        do {
            System.out.print("Masukkan angka (0 untuk mengakhiri): ");
            angka = scanner.nextInt();
            total += angka;
        } while (angka != 0);

        System.out.println("Total angka: " + total);
    }
}
