package Tugas5PBO;

public class SegitigaBintang {
    public static void main(String[] args) {
        int baris = 5;

        System.out.println("Half Triangle:");
        for (int i = 1; i <= baris; i++) {
            for (int j = i; j < baris; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle:");
        for (int i = baris; i >= 1; i--) {
            for (int j = baris; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
             
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
