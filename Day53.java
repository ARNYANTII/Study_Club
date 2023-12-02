package ISC;
import java.util.Scanner;
public class Day53 {public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan nama : ");
       String nama = input.nextLine();
       System.out.print("masukkan nim : ");
       String nim = input.nextLine();
       System.out.print("masukkan agama : ");
       String agama = input.nextLine();
       System.out.print("masukkan tinggi  : ");
       double tinggi = input.nextDouble();
       System.out.print("masukkan ukuran baju : ");
       char ukuran_baju = input.next().charAt(0);
       System.out.print("masukkan status pernikahan : ");
       boolean status_pernikahan = input.nextBoolean();
       
        System.out.println("NAMA SAYA  : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("AGAMA : "+ agama);
        System.out.println("TINGGI : "+tinggi);
        System.out.println("UKURAN BAJU : " +ukuran_baju);
        System.out.println("STATUS PERNIKAHAN : "+status_pernikahan);
        
       
       
    }
}
