package ISC;
import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka: ");
        int angka_batas = input.nextInt();

        if (angka_batas <= 1) {
            System.out.println("Tidak ada angka yang valid untuk ditampilkan.");
        } else {
            System.out.println("Angka genap antara 1 dan " + angka_batas + " adalah:");

            for (int i = 2; i <= angka_batas; i += 2) {
                System.out.println(i);
            }
        }
    }
}
