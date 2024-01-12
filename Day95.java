package ISC;
import java.util.Scanner;
public class Day95 {
    public static void main(String[] args) {
        while (true) {
            Scanner teks = new Scanner(System.in);
            System.out.print("masukkan Teks : ");
            String nama = teks.nextLine();
            if (nama.equals("informatika")) {
                System.out.println(" teks Sudah sesuai");
                break;
            } else {
                System.out.println("masukkan teks yang sesuai");

            }
        }

    }
}

