package ISC;
public class Day83 {
    public static void main(String[] args) {
        int[] nilai = {85, 78, 92, 70, 88};
        double rataRata = hitungRataRata(nilai);
        System.out.println("Nilai: " + arrayToString(nilai));
        System.out.println("Rata-rata: " + rataRata);
    }
    private static double hitungRataRata(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return (double) total / array.length;
    }
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

