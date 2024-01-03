package ISC;
import java.util.Scanner;
public class Day84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = scanner.nextInt();

        long hasil = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }

    private static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }
}
