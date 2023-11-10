package ISC;
import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan alas segitiga: ");
        int alas = sc.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = sc.nextInt();
        double luas = alas * tinggi / 2;
        System.out.println("Luas segitiga adalah: " + luas);
    }
}
