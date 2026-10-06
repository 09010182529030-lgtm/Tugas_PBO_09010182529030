package Tugas_BangunDatar;

public class Lingkaran extends BangunDatar {

    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}