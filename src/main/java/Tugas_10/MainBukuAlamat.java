package Tugas_10;

public class MainBukuAlamat {

    public static void main(String[] args) {

        BukuAlamat buku = new BukuAlamat();

        EntryBukuAlamat data1 = new EntryBukuAlamat(
                "Nanda",
                "Palembang",
                "081234567890",
                "nanda@gmail.com"
        );

        EntryBukuAlamat data2 = new EntryBukuAlamat(
                "Salsabilla",
                "Indralaya",
                "082345678901",
                "salsabilla@gmail.com"
        );

        // Menambahkan data
        buku.tambahData(data1);
        buku.tambahData(data2);

        System.out.println("\n=== DATA BUKU ALAMAT ===");
        buku.tampilkanData();

        // Update data pertama
        EntryBukuAlamat dataUpdate = new EntryBukuAlamat(
                "Nanda Salsabilla",
                "Palembang",
                "089876543210",
                "nandasalsabilla@gmail.com"
        );

        buku.updateData(0, dataUpdate);

        System.out.println("\n=== SETELAH UPDATE ===");
        buku.tampilkanData();

        // Hapus data kedua
        buku.hapusData(1);

        System.out.println("\n=== SETELAH HAPUS ===");
        buku.tampilkanData();
    }
}