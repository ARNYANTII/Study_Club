package ISC;
import java.util.LinkedList;
public class Day64 {
    public static void main(String[] args) {
        LinkedList<String> namaList = new LinkedList<>();
        namaList.add("arni");
        namaList.add("ani");
        namaList.add("yanti");
        namaList.add("nia");
        namaList.add("anti");
        //menampilkan nilai 
        System.out.println("MENAMPILKAN NILAI : ");
        for (String nama : namaList) {
            System.out.println("isi arraylist : " + nama);
        }
        System.out.println("NILAI SETELAH DI HAPUS : ");
        namaList.remove(2);
        for (String nama : namaList)
        System.out.println("array setelah di hapus : "+nama);
        
    }
}


