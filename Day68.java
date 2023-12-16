package ISC;
import java.util.ArrayList;
public class Day68 {
    public static void main(String[] args) {
        ArrayList<String> listwarna = new ArrayList<>();
        listwarna.add("merah");
        listwarna.add("biru");
        listwarna.add("kuning");

        System.out.println("ArrayList sebelum penggantian:");
        System.out.println(listwarna);
        
        listwarna.set(1, "hitam");

        System.out.println("ArrayList setelah penggantian:");
        System.out.println(listwarna);
    }
}
