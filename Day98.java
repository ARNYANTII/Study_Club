package ISC;
import java.util.Scanner;
public class Day98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang dalam meter: ");
        double panjangMeter = scanner.nextDouble();

        double panjangKilometer = panjangMeter / 1000;

        System.out.println("Panjang dalam kilometer: " + panjangKilometer + " km");

        scanner.close();
    }
}
