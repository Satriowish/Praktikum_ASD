package P7;

import java.util.Scanner;

public class BukuMain26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku26 data = new PencarianBuku26();
        int jmlBuku = 5;

        System.out.println("=================================================");
        System.out.println("Masukkan Data Buku secara Urut dari Kode Buku Terkecil : ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("=================================================");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stok Buku \t: ");
            int stok = s.nextInt();

            Buku26 m = new Buku26(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("data Keseluruhan Buku : ");
        data.tampil();
        System.out.println("_________________________________________________");
        System.out.println("_________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        // int posisi = data.FindSeqSearch(cari);
        // data.TampilData(cari, posisi);

        Buku26 dataBuku = data.FindBuku26(cari);
        dataBuku.tampilDataBuku();
    }
}
