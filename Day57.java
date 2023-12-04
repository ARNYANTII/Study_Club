package ISC;
import java.util.Scanner;
public class Day57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 3 == 0) {
            System.out.println("Angka habis dibagi tiga");
        } else {
            System.out.println("Angka Ganjil yang habis dibagi tiga antara 1 dan " + angka + " :");

            for (int i = 1; i <= angka; i += 2) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
