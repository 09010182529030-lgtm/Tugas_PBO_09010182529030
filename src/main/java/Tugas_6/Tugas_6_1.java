package Tugas_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_6_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Masukkan nilai ujian 1: ");
        double nilai1 = Double.parseDouble(br.readLine());

        System.out.print("Masukkan nilai ujian 2: ");
        double nilai2 = Double.parseDouble(br.readLine());

        System.out.print("Masukkan nilai ujian 3: ");
        double nilai3 = Double.parseDouble(br.readLine());

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.println("Nilai rata-rata = " + rataRata);

        if (rataRata >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":-(");
        }
    }
}