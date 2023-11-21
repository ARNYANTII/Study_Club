package ISC;
import java.util.Scanner;
public class day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nilai awal : ");
        int awal = input.nextInt();
        System.out.print("masukkan nilai akhir : ");
        int akhir = input.nextInt();
        int totalgenap = 0;
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0){
               totalgenap += i; 
            }
        }
        System.out.println("jumlah total bilangan Genap adalah : "+totalgenap);
    }
}

   
