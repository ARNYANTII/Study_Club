package ISC;
import java.util.LinkedList;
public class Day75 {
     public static void main(String[] args) {
        LinkedList<String> antrianPengunjung = new LinkedList<>();
        
        antrianPengunjung.add("Pengunjung 1");
        antrianPengunjung.add("Pengunjung 2");
        antrianPengunjung.add("Pengunjung 3");

        System.out.println("Antrian Pengunjung:");
        for (String pengunjung : antrianPengunjung) {
            System.out.println(pengunjung);
        }
    }
}
