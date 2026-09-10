package Tugas_6;

import javax.swing.JOptionPane;

public class Tugas_6_2 {
    public static void main(String[] args) {

        double nilai1 = Double.parseDouble(
                JOptionPane.showInputDialog("Masukkan nilai ujian 1:")
        );

        double nilai2 = Double.parseDouble(
                JOptionPane.showInputDialog("Masukkan nilai ujian 2:")
        );

        double nilai3 = Double.parseDouble(
                JOptionPane.showInputDialog("Masukkan nilai ujian 3:")
        );

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        if (rataRata >= 60) {
            JOptionPane.showMessageDialog(
                    null,
                    "Nilai rata-rata = " + rataRata + "\n:)"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Nilai rata-rata = " + rataRata + "\n:-("
            );
        }
    }
}