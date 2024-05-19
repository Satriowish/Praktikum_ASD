package P12.Tugas.Soal1;

import java.util.Scanner;

public class AntrianVaksinMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        AntrianVaksin26 AntriVaksinasi = new AntrianVaksin26();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data penerima vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            int pilih = sc26.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nomor antrian : ");
                    int nomorAntri = sc26.nextInt();
                    System.out.print("Masukkan nama pasien   : ");
                    String name = sc26.next();
                    AntriVaksinasi.addPasien(nomorAntri, name);
                    break;
                case 2:
                    AntriVaksinasi.removePasien();
                    break;
                case 3:
                    AntriVaksinasi.listPasien();
                    break;
                case 4:
                    AntriVaksinasi.exitProgram();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
