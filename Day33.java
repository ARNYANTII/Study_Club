package ISC;
public class day33 {
    public static void main(String[] args) {
        int angka_pokok = 3;    
        int pangkat = 4;    
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= angka_pokok;
        }
        System.out.println("Hasil perpangkatan adalah: " + hasil);
    }
}
