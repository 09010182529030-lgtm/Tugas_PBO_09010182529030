package Tugas_BangunDatar;

public class Main {

    public static void main(String[] args) {

        // Membuat objek Segitiga Sama Kaki
        SegitigaSamaKaki segitiga =
                new SegitigaSamaKaki(10, 8, 10);

        // Membuat objek Persegi Panjang
        PersegiPanjang persegiPanjang =
                new PersegiPanjang(12, 6);

        // Membuat objek Lingkaran
        Lingkaran lingkaran =
                new Lingkaran(7);

        System.out.println("======================================");
        System.out.println("       PERHITUNGAN BANGUN DATAR");
        System.out.println("======================================");

        System.out.println("\n--- SEGITIGA SAMA KAKI ---");
        System.out.println("Alas        : 10");
        System.out.println("Tinggi      : 8");
        System.out.println("Sisi Miring : 10");
        segitiga.tampilkanHasil();

        System.out.println("\n--- PERSEGI PANJANG ---");
        System.out.println("Panjang : 12");
        System.out.println("Lebar   : 6");
        persegiPanjang.tampilkanHasil();

        System.out.println("\n--- LINGKARAN ---");
        System.out.println("Jari-jari : 7");
        lingkaran.tampilkanHasil();

        System.out.println("\n======================================");
    }
}