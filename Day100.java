package ISC;
import java.util.Scanner;
public class Day100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = scanner.nextInt();

        double totalBerat = 0;

        for (int i = 1; i <= jumlahOrang; i++) {
            System.out.print("Masukkan berat badan orang ke-" + i + " (kg): ");
            double beratBadan = scanner.nextDouble();
            totalBerat += beratBadan;
        }

        double rataRata = hitungRataRata(totalBerat, jumlahOrang);

        System.out.println("Rata-rata berat badan: " + rataRata + " kg");
    }

    private static double hitungRataRata(double totalBerat, int jumlahOrang) {
        return totalBerat / jumlahOrang;
    }
}
