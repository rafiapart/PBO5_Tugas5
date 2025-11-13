package Tugas5PBO;

import java.util.Scanner;

public class PenjumlahanDanRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            total += input.nextInt();
        }

        double rata = (double) total / n;
        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-rata: " + rata);
    }
}
