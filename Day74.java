package ISC;
import java.util.LinkedList;
public class Day74 {
     public static void main(String[] args) {
        LinkedList<String> rutePerjalanan = new LinkedList<>();

        
        rutePerjalanan.add("Kota A");
        rutePerjalanan.add("Kota B");
        rutePerjalanan.add("Kota C");
        rutePerjalanan.add("Kota D");
       
        System.out.println("Rute Perjalanan:");
        for (String kota : rutePerjalanan) {
            System.out.println(kota);
        }
    }
}
