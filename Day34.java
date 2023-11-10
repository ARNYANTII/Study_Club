package ISC;
import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan pokok: ");
        int pokok = sc.nextInt();
        System.out.print("Masukkan bilangan pangkat: ");
        int pangkat = sc.nextInt();
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= pokok;
        }
        System.out.println("Hasil perpangkatan adalah: " + hasil);
    }
}
