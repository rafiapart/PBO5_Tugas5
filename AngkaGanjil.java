package Tugas5PBO;

import java.util.Scanner;

public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka: ");
        int ganjil = input.nextInt();

        int total = 0;
        int angka = 1;
        for (int i = 1; i <= ganjil; i++) {
            System.out.print(angka + " ");
            total += angka;
            angka += 2;
        }
        System.out.println("\nTotal penjumlahan: " + total);
    }
}
