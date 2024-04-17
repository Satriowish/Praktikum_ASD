package P8.Gudang;

import java.util.Scanner;

public class Utama26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang : ");
        int kapasitas = sc26.nextInt();
        Gudang26 gudang = new Gudang26(kapasitas);

        while (true) {
            System.out.println("\nMenu :");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Barang Terbawah");
            System.out.println("6. Cari Barang berdasarkan Nama");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi : ");
            int pilihan = sc26.nextInt();
            sc26.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang     : ");
                    int kode = sc26.nextInt();
                    sc26.nextLine();
                    System.out.print("Masukkan Nama Barang     : ");
                    String nama = sc26.nextLine();
                    System.out.print("Masukkan Kategori Barang : ");
                    String kategori = sc26.nextLine();
                    Barang26 barangBaru = new Barang26(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan Nama Barang yang ingin dicari : ");
                    String namaBarangCari = sc26.nextLine();
                    gudang.cariBarangbyNama(namaBarangCari);
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak Valid. Silahkan coba lagi!");
            }
        }
    }
}
