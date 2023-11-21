package ISC;
import java.util.Scanner;
public class day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai awal : ");
        int awal = input.nextInt();
        System.out.print("masukkan nilai akhir : ");
        int akhir = input.nextInt();
        int totalganjil = 0;
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 1){
               totalganjil += i; 
            }
        }
        System.out.println("jumlah total bilangan ganjil adalah : "+totalganjil);
    }
}
