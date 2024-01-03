package ISC;
import java.util.Scanner;
public class Day86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas atas rentang: ");
        int batasAtas = scanner.nextInt();

        System.out.println("Bilangan prima dalam rentang 1 hingga " + batasAtas + ":");
        for (int i = 2; i <= batasAtas; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
