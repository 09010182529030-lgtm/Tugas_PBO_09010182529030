package Tugas_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_7_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int[] angka = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = Integer.parseInt(br.readLine());
        }

        int terbesar = angka[0];

        for (int i = 1; i < 10; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        System.out.println("Angka terbesar adalah = " + terbesar);
    }
}
