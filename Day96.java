package ISC;
import java.util.Scanner;
public class Day96 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int desimal = angka.nextInt();
        String biner = Integer.toBinaryString(desimal);
        System.out.println("Biner: " + biner);
    }
}
