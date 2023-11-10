package ISC;
import java.util.Scanner;
public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah " + luas);
    }
}
    
