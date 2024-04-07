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
            String kodeBuku = s1.nextLine();
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
        data.sortDataBubble();
        data.tampil();
        s.nextLine();

        System.out.println("_________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari ");
        System.out.print("Kode Buku : ");
        String kodeBukuCari = s1.nextLine();

        int posisiKodeBuku = data.FindSeqSearchStringKode(kodeBukuCari);
        data.sortDataBubble();
        System.out.println("_________________________________________________");
        System.out.println("Menggunakan Sequential Search");
        System.out.println("_________________________________________________");
        if (posisiKodeBuku != -1) {
            System.out.println("Buku dengan kode " + kodeBukuCari + " ditemukan:");
            data.TampilData(kodeBukuCari, posisiKodeBuku);
        } else {
            System.out.println("Buku dengan kode " + kodeBukuCari + " tidak ditemukan!");
        }

        int posisiKodeBukuBinary = data.FindBinarySearchStringKode(kodeBukuCari, 0, jmlBuku - 1);
        data.sortDataBubble();
        System.out.println("_________________________________________________");
        System.out.println("Menggunakan Binary Search");
        if (posisiKodeBukuBinary != -1) {
            System.out.println("Buku dengan kode " + kodeBukuCari + " ditemukan:");
            data.TampilData(kodeBukuCari, posisiKodeBukuBinary);
        } else {
            System.out.println("Buku dengan kode " + kodeBukuCari + " tidak ditemukan!");
        }

        System.out.println();
        System.out.println("_________________________________________________");
        System.out.println("Pencarian data Berdasarkan Judul Buku");
        System.out.print("Masukkan Judul Buku : ");
        String judulBukuCari = s.nextLine();

        System.out.println("_________________________________________________");
        System.out.println("Pencarian Judul Buku Menggunakan Sequential Search");
        int cariJudul = data.FindSeqSearchStringJudul(judulBukuCari);
        if (cariJudul > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu buku dengan judul " + judulBukuCari);
        }
        System.out.println("_________________________________________________");

        int posisiJudulBukuBinary = data.FindBinarySearchStringJudul(judulBukuCari, 0, jmlBuku - 1);
        System.out.println("Pencarian Judul Buku Menggunakan Binary Search");
        if (posisiJudulBukuBinary != -1) {
            System.out.println("Buku dengan judul " + judulBukuCari + " ditemukan :");
            data.listBk[posisiJudulBukuBinary].tampilDataBuku();
        } else {
            System.out.println("Buku dengan judul " + judulBukuCari + " tidak ditemukan!");
        }

    }

}

// ===============================================================================
// String kodeBukuCari = s.nextLine();
// int posisiKodeBuku = data.FindSeqSearchStringKode(kodeBukuCari);
// if (posisiKodeBuku != -1) {
// System.out.println("Buku dengan kode " + kodeBukuCari + " ditemukan:");
// data.listBk[posisiKodeBuku].tampilDataBuku();
// } else {
// System.out.println("Buku dengan kode " + kodeBukuCari + " tidak ditemukan!");
// }
// ===============================================================================

// ===============================================================================
// System.out.println("_________________________________________________");
// System.out.println("Menggunakan Sequential Search");
// System.out.println("_________________________________________________");
// int posisi = data.FindSeqSearch(cari); ==> Menggunakan method bertipe int
// data.TampilData(cari, posisi); ==> Menggunakan method bertipe int
// ===============================================================================

// ===============================================================================
// *** PERCOBAAN 1 PERTANYAAN NO. 3
// Buku26 dataBuku = data.FindBuku26(cari); ==> Menggunakan method bertipe int
// // dataBuku.tampilDataBuku(); ==> Menggunakan method bertipe int
// ===============================================================================

// ===============================================================================
// System.out.println("_________________________________________________");
// System.out.println("Menggunakan Binary Search");
// System.out.println("_________________________________________________");
// data.InsertionSort(); ==> Menggunakan method bertipe int
// posisi = data.FindBinarySearch(cari, 0, jmlBuku - 1);
// data.TampilData(cari, posisi); ==> Menggunakan method bertipe int
// }
// ===============================================================================
