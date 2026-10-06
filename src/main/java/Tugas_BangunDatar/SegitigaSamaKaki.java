package Tugas_BangunDatar;

public class SegitigaSamaKaki extends BangunDatar {

    private double alas;
    private double tinggi;
    private double sisiMiring;

    public SegitigaSamaKaki(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = alas + (2 * sisiMiring);
        return keliling;
    }
}