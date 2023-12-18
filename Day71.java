package ISC;
import java.util.LinkedList;
public class Day71 {
    public static void main(String[] args) {
        LinkedList<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke antrian
        antrian.add("Pengguna 1");
        antrian.add("Pengguna 2");
        antrian.add("Pengguna 3");

        // Menghapus elemen dari depan antrian
        String penggunaDihapus = antrian.poll();
        System.out.println("Pengguna yang dihapus dari antrian: " + penggunaDihapus);

        // Menampilkan sisa antrian
        System.out.println("Sisa Antrian:");
        for (String pengguna : antrian) {
            System.out.println(pengguna);
        }
    }
}

