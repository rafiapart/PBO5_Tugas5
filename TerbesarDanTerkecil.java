package Tugas5PBO;

import java.util.Scanner;

public class TerbesarDanTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bil = new int[10];
        int terbesar, terkecil;

        System.out.println("Masukkan 10 bilangan:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            bil[i] = input.nextInt();
        }

        terbesar = bil[0];
        terkecil = bil[0];
        for (int i = 1; i < 10; i++) {
            if (bil[i] > terbesar) terbesar = bil[i];
            if (bil[i] < terkecil) terkecil = bil[i];
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}
