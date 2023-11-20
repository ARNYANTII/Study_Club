package ISC;
import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai awal : ");
        int awal = input.nextInt();
        System.out.print("masukkan nilai akhir : ");
        int akhir = input.nextInt();
        for (int i = awal; i < akhir; i++) {
            if (i%2 == 1){
              awal++;  
            }  
        }
        System.out.println("nilai ganjil : "+awal);
    }  
}
