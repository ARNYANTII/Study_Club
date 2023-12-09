package ISC;
import java.util.LinkedList;
public class Day62 {
    public static void main(String[] args) {
        LinkedList <String> AlatTulis = new LinkedList <>();
        AlatTulis.add("Buku");
        AlatTulis.add("Pulpen");
        AlatTulis.add("Pensil");
        AlatTulis.add("spidol");
        AlatTulis.addLast("benda di atas adalah Perlengkapan Alat Tulis");
        for (String Perlengkapan : AlatTulis){
            System.out.println(Perlengkapan);
        }
    }
}
