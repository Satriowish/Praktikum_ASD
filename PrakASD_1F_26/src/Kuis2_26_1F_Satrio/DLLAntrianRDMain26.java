package Kuis2_26_1F_Satrio;

import java.util.Scanner;

public class DLLAntrianRDMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        Scanner sc26p1 = new Scanner(System.in);

        // Data Antrian
        PembeliList26 AntrianPembeli = new PembeliList26();
        AntrianPembeli.addLast(new Pembeli26(1, "Mamluatul", "08224500000"));
        AntrianPembeli.addLast(new Pembeli26(2, "Abyaz A.M", "08224511111"));
        AntrianPembeli.addLast(new Pembeli26(3, "Yoshinoya", "08224522222"));
        AntrianPembeli.addLast(new Pembeli26(4, "Susi Susanti", "08123456"));

        // Data Pesanan
        PesananList26 AntriPesanan = new PesananList26();
        AntriPesanan.addLast(new Pesanan26(1, "Nasi Rendang", 25000));
        AntriPesanan.addLast(new Pesanan26(2, "Nasi Pecel", 15000));
        AntriPesanan.addLast(new Pesanan26(3, "Nasi Babat", 20000));
        AntriPesanan.addLast(new Pesanan26(4, "Nasi Goreng", 30000));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Antrian"); // add last
            System.out.println("2. Cetak Antrian"); // print data antrian
            System.out.println("3. Hapus Antrian"); // remove first
            System.out.println("4. Laporan Pengurutan pesanan by Nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar ");
            System.out.println("Pilih (1-5) : ");
            System.out.println("-----------------------------------------");
            int pilih = sc26.nextInt();
            sc26.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.println("Tambahkan Data Antrian Pembeli");
                    System.out.println("-----------------------------------------");
                    System.out.print("NO Antrian   : ");
                    int noAntri = sc26.nextInt();
                    System.out.print("Nama Pembeli : ");
                    String namaPemb = sc26p1.nextLine();
                    System.out.print("No Hp        : ");
                    String noPemb = sc26p1.nextLine();
                    AntrianPembeli.addLast(new Pembeli26(noAntri, namaPemb, noPemb));
                    break;
                case 2:
                    AntrianPembeli.print();
                    break;
                case 3:
                    AntrianPembeli.removeFirst();
                    System.out.println("============================================");
                    System.out.println("|         Transaksi input Pesanan          |");
                    System.out.println("============================================");
                    System.out.print("No Pesanan    : ");
                    int NoPesan = sc26.nextInt();
                    System.out.print("Pesanan       : ");
                    String namaPesanan = sc26p1.nextLine();
                    System.out.print("Harga Pesanan : ");
                    int hargaPesanan = sc26p1.nextInt();
                    AntriPesanan.addLast(new Pesanan26(hargaPesanan, namaPesanan, hargaPesanan));
                    System.out.println("********************************************");
                    System.out.println("|           Daftar Pesanan Masuk           |");
                    System.out.println("********************************************");
                    System.out.printf("%-11s %-23s %-8s", "No ", "Nama Pesanan", "Harga");
                    System.out.println();
                    String kode = String.format("%-8s", NoPesan);
                    String nama = String.format("%-22s", namaPesanan);
                    String harga = String.format("%-15s", hargaPesanan);
                    System.out.println("|" + kode + " | " + nama + " |" + harga + "|");
                    break;
                case 4:
                    AntriPesanan.print();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Terima kasih Sampai Jumpa !.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
