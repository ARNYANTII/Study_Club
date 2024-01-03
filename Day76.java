package ISC;
import java.util.ArrayList;
public class Day76 {
    
    public static void main(String[] args) {
        ArrayList<Double> nilaiUjian = new ArrayList<>();
        nilaiUjian.add(85.5);
        nilaiUjian.add(78.0);
        nilaiUjian.add(92.5);

        System.out.println("Nilai Ujian:");
        for (double nilai : nilaiUjian) {
            System.out.println(nilai);
        }
    }
}
