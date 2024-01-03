package ISC;
public class Day81 {
    public static void main(String[] args) {
        int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriks:");
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
}

