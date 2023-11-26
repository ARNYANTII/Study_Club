package ISC;
import java.util.ArrayList;
public class day49 {
    public static void main(String[] args) {
       ArrayList <String> DaftarBuah = new ArrayList<>();
       DaftarBuah.add("manggis");
       DaftarBuah.add("jeruk");
       DaftarBuah.add("semangka");
       
       for( String NamaBuah : DaftarBuah)
        System.out.println("daftar nama buah : "+NamaBuah);
    }
}
