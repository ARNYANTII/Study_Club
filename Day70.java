package ISC;
import java.util.LinkedList;
public class Day70 {
    public static void main(String[] args) {
        LinkedList<String> catatanHarian = new LinkedList<>();

        // Menambahkan catatan harian
        catatanHarian.add("Beli buah di pasar");
        catatanHarian.add("Rapat tim pukul 10:00");
        catatanHarian.add("Olahraga sore");
        
        // Menampilkan catatan harian
        System.out.println("Catatan Harian:");
        for (String catatan : catatanHarian) {
            System.out.println(catatan);
        }
    }
}

