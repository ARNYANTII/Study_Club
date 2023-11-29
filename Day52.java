package ISC;
import java.util.Scanner;
public class Day52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("angka genap");
        } else {
            for (int i = 1; i <= angka; i++) {
                if (i % 2 == 0) {
                    System.out.println("angka genap : " + i);
                }
            }
        }
    }
}
