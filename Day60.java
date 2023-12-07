package ISC;
import java.util.ArrayList;
public class Day60 {
    public static void main(String[] args) {
        ArrayList<String> ListWarna = new ArrayList<>();
        ListWarna.add("hijau");
        ListWarna.add("merah");
        ListWarna.add("kuning");
        ListWarna.add("abu-abu");
        ListWarna.add("biru");
        ListWarna.add("ungu");
        ListWarna.add("hitam");
        for (String DaftarWarna : ListWarna) {
            System.out.println("Daftar Warna : " + DaftarWarna);
        }
    }
}
