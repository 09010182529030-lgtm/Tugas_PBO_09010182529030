
package Tugas_10;

import java.util.Scanner;

public class MainBukuAlamatBaru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BukuAlamatBaru buku = new BukuAlamatBaru();
        int pilihan = 0;

        do {
            System.out.println("\n==========================");
            System.out.println("       BUKU ALAMAT");
            System.out.println("==========================");
            System.out.println("1. Memasukkan data");
            System.out.println("2. Menghapus data");
            System.out.println("3. Menampilkan seluruh data");
            System.out.println("4. Update data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            if (!input.hasNextInt()) {
                System.out.println("Masukkan angka yang benar!");
                input.nextLine();
                continue;
            }

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();

                    System.out.print("Nomor telepon: ");
                    String telepon = input.nextLine();

                    buku.tambah(nama, alamat, telepon);
                    break;

                case 2:
                    buku.tampilkan();
                    System.out.print("Nomor data yang dihapus: ");

                    if (input.hasNextInt()) {
                        buku.hapus(input.nextInt());
                        input.nextLine();
                    } else {
                        System.out.println("Nomor harus berupa angka.");
                        input.nextLine();
                    }
                    break;

                case 3:
                    buku.tampilkan();
                    break;

                case 4:
                    buku.tampilkan();
                    System.out.print("Nomor data yang di-update: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Nomor harus berupa angka.");
                        input.nextLine();
                        break;
                    }

                    int nomor = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama baru: ");
                    String namaBaru = input.nextLine();

                    System.out.print("Alamat baru: ");
                    String alamatBaru = input.nextLine();

                    System.out.print("Nomor telepon baru: ");
                    String teleponBaru = input.nextLine();

                    buku.update(
                        nomor, namaBaru, alamatBaru, teleponBaru
                    );
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 5);

        input.close();
    }
}
