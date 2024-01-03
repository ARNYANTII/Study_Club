package ISC;
import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        double total = 0;
        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            double angka = scanner.nextDouble();
            total += angka;
        }

        double rataRata = total / jumlahAngka;
        System.out.println("Rata-rata: " + rataRata);
    }
}
