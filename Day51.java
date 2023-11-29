package ISC;
import java.util.Scanner;
public class Day51 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka_batas = input.nextInt();
        if (angka_batas == 1 || angka_batas == 2) {
            System.out.println("angka kosong");
        } else {
            for (int i = 1; i <= angka_batas; i++) {
                if (i % 3 == 0) {
                    System.out.println("angkah : " + i);
                }
            }
        }
    }
}
