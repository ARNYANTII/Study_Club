package ISC;
import java.util.ArrayList;
public class Day59 {
    public static void main(String[] args) {
        ArrayList<String> ListNamaHewan = new ArrayList<>();
        ListNamaHewan.add("jerapa");
        ListNamaHewan.add("ayam");
        ListNamaHewan.add("kucing");
        ListNamaHewan.add("kelinci");
        ListNamaHewan.add("sapi");
        ListNamaHewan.add("Harimau");
       
        for (String DaftarHewan : ListNamaHewan) {
            System.out.println("Daftar Hewan : " + DaftarHewan);
        }
    }
}
