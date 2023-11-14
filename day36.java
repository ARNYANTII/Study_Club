package ISC;
import java.util.Scanner;public class day36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Masukkan tunjangan: ");
        double tunjangan = scanner.nextDouble();
        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + totalGaji);
    }
}
