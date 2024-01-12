package ISC;
import java.util.Scanner;
public class Day94 {
    public static void main(String[] args) {
        Scanner teks = new Scanner(System.in);
        System.out.print("masukkan username : ");
        String username = teks.nextLine();
        System.out.print("masukkan password : ");
        String password = teks.nextLine();
        if (username.equals("arni") && password.equals("1234")) {
            System.out.println("login anda berhasil");

        } else {
            System.out.println("login anda gagal");

        }
    }
}
