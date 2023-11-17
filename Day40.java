package ISC;
import java.util.Scanner;
public class Day40 {
   public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan angkah pertama :");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka ke dua :");
        int angka2 = input.nextInt();
        System.out.print("masukkan angka ketiga :");
        int angka3 = input.nextInt();
        int hasil = angka1+angka2+angka3;
        if (hasil % 2  ==0){
            hasil +=2;
            System.out.println("hasil penjumlahan genap maka di tambah 2 = "+hasil);
        }else if (hasil % 2 ==1){
            hasil +=1;
            System.out.println("hasil penjumlahan ganjil maka di tambah 1 = "+hasil);
        }
        
    }
}
