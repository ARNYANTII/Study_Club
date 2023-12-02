package ISC;
import java.util.Scanner;
public class Day55 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka_batas = input.nextInt();
        if (angka_batas == 0 || angka_batas == 1) {
            System.out.println("angka kosong");
        } else {
            for (int i = 1; i <= angka_batas; i++) {
                if (i % 2 == 0) {
                    System.out.println("angkah : " + i);
                }
            }
        }
    }
}
