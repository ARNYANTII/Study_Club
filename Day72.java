package ISC;
import java.util.LinkedList;
public class Day72 {
    public static void main(String[] args) {
        LinkedList<String> tumpukan = new LinkedList<>();

        // Menambahkan elemen ke tumpukan
        tumpukan.push("Item 10");
        tumpukan.push("Item 20");
        tumpukan.push("Item 30");
        tumpukan.push("Item 40");
        tumpukan.push("Item 50");

        // Menghapus elemen dari puncak tumpukan
        String itemDihapus = tumpukan.pop();
        System.out.println("Item yang dihapus dari tumpukan: " + itemDihapus);

        // Menampilkan sisa tumpukan
        System.out.println("Sisa Tumpukan:");
        for (String item : tumpukan) {
            System.out.println(item);
        }
    }
}

