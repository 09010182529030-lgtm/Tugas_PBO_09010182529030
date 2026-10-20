
package Tugas_10;

public class BukuAlamatBaru {
    private final EntryBukuAlamatBaru[] data =
            new EntryBukuAlamatBaru[100];
    private int jumlah = 0;

    // Menambahkan data
    public void tambah(String nama, String alamat, String telepon) {
        if (jumlah >= data.length) {
            System.out.println("Buku alamat sudah penuh!");
            return;
        }

        data[jumlah] =
                new EntryBukuAlamatBaru(nama, alamat, telepon);
        jumlah++;

        System.out.println("Data berhasil ditambahkan.");
    }

    // Menampilkan seluruh data
    public void tampilkan() {
        if (jumlah == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.println("\n=== DAFTAR BUKU ALAMAT ===");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nNomor: " + (i + 1));
            data[i].tampilkanData();
        }
    }

    // Menghapus data
    public void hapus(int nomor) {
        int index = nomor - 1;

        if (index < 0 || index >= jumlah) {
            System.out.println("Nomor tidak ditemukan.");
            return;
        }

        for (int i = index; i < jumlah - 1; i++) {
            data[i] = data[i + 1];
        }

        data[--jumlah] = null;
        System.out.println("Data berhasil dihapus.");
    }

    // Memperbarui data
    public void update(
            int nomor, String nama, String alamat, String telepon) {
        int index = nomor - 1;

        if (index < 0 || index >= jumlah) {
            System.out.println("Nomor tidak ditemukan.");
            return;
        }

        data[index].setNama(nama);
        data[index].setAlamat(alamat);
        data[index].setTelepon(telepon);

        System.out.println("Data berhasil diperbarui.");
    }
}
