package ISC;
import java.util.Scanner;
public class Day97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        tentukanPositifNegatifNol(angka);
    }
    private static void tentukanPositifNegatifNol(int angka) {
        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif.");
        } else {
            System.out.println(angka + " adalah nol.");
        }
    }
}
