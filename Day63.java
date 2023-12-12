package ISC;
import java.util.LinkedList;
public class Day63 {
    public static void main(String[] args) {
    LinkedList <String> namaList = new LinkedList <>();
    namaList.add("arni");
    namaList.add("ani");
    namaList.add("yanti");
    namaList.add("nia");
    namaList.add("anti");
        System.out.println("menampilkan nilai");
        for (String nama : namaList){
            System.out.println("isi arraylist : "+nama);
        }
        //menampilkan nilai berdasarkan indeks
        System.out.println("menampilkan nilai berdasarkan indeks");
        System.out.println("array pada indeks ke-3 : "+namaList.get(3));
    }
}


