package ISC;
import java.util.ArrayList;
public class Day66 {
    public static void main(String[] args) {
    ArrayList <String> namabuah = new ArrayList <>();
        namabuah.add("Apel");
        namabuah.add("nanas");
        namabuah.add("mangga");

        String cari_buah = "mangga";
        if (namabuah.contains(cari_buah)) {
            System.out.println(cari_buah + " ditemukan dalam ArrayList.");
        } else {
            System.out.println(cari_buah + " tidak ditemukan dalam ArrayList.");
        }
    }
}
