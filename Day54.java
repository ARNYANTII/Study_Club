package ISC;
import java.util.Scanner;
public class Day54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        if (angka % 3 == 0) {
            System.out.println("angka habis di bagi tiga");
        } else {
            for (int i = 1; i <= angka; i++) {
                if (i % 3 == 0) {
                    System.out.println("angka Ganjil : " + i);
                }
            }
        }
    }
}
