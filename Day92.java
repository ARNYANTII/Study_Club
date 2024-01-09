package ISC;
public class Day92 {
    public static void main(String[] args) {
        int[][] matriks = {
            {5, 8, 2},
            {3, 12, 6},
            {9, 4, 7}
        };
        int nilaiTertinggi = matriks[0][0];
        for (int[] baris : matriks) {
            for (int nilai : baris) {
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }
            }
        }

        System.out.println("Nilai tertinggi dalam matriks: " + nilaiTertinggi);
    }
}

