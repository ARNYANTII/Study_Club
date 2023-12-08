package ISC;
import java.util.LinkedList;
public class Day61 {
    public static void main(String[] args) {
        LinkedList <String> AlatTulis = new LinkedList <>();
        AlatTulis.add("Buku");
        AlatTulis.add("Pulpen");
        AlatTulis.add("Pensil");
        AlatTulis.add("spidol");
        AlatTulis.addFirst("Perlengkapan:");
        for (String Perlengkapan : AlatTulis){
            System.out.println("Alat tulis : "+Perlengkapan);
        }
    }
}
