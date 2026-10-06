package Tugas_BangunDatar;

public abstract class BangunDatar {

    protected double luas;
    protected double keliling;

    public abstract double hitungLuas();

    public abstract double hitungKeliling();

    public void tampilkanHasil() {
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}