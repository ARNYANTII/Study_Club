package ISC;
import java.util.Scanner;
public class Day99 {
    public static void main(String[] args) {
        Scanner teks = new Scanner(System.in);
        
        System.out.print("Masukkan teks : ");
        String inputteks = teks.nextLine();
        StringBuffer teks_Terbalik = new StringBuffer(inputteks);

        System.out.println("Sebelum teks dibalik: " + teks_Terbalik);
        System.out.println("Setelah teks dibalik: " + teks_Terbalik.reverse());
    }
}
