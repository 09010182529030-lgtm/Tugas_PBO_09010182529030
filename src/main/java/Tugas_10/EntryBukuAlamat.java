package Tugas_10;

public class EntryBukuAlamat {

    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    // Constructor
    public EntryBukuAlamat(String nama, String alamat,
                           String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Setter Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter Alamat
    public String getAlamat() {
        return alamat;
    }

    // Setter Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter Nomor Telepon
    public String getNomorTelepon() {
        return nomorTelepon;
    }

    // Setter Nomor Telepon
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Getter Email
    public String getEmail() {
        return email;
    }

    // Setter Email
    public void setEmail(String email) {
        this.email = email;
    }
}