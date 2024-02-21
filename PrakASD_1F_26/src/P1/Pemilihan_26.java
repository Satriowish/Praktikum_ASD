package P1;

import java.util.Scanner;

// Praktikum Pemilihan
public class Pemilihan_26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan nilai tugas : ");
        double nilaiTugas = input26.nextDouble();
        System.out.print("Masukkan nilai kuis  : ");
        double nilaiKuis = input26.nextDouble();
        System.out.print("Masukkan nilai UTS   : ");
        double nilaiUTS = input26.nextDouble();
        System.out.print("Masukkan nilai UAS   : ");
        double nilaiUAS = input26.nextDouble();

        // Untuk mengecek apakah nilai yang saya masukan valid atau tidak
        if (!NilaiValid(nilaiTugas) || !NilaiValid(nilaiKuis) || !NilaiValid(nilaiUTS)
                || !NilaiValid(nilaiUAS)) {
            System.out.println("Nilai tidak valid");
        } else {
            // jika nilai valid maka akan lanjut menghitung nilai akhir
            double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);
            System.out.println("Nilai akhir          : " + nilaiAkhir);
            System.out.println();
            // Menambahkan predikat pada nilai yang sudah dihitung
            Predikat(nilaiAkhir);

        }
    }

    // Untuk mengecek apakah angka yang dimasukan valid
    public static boolean NilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    // Perhitungan nilai akhir
    public static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;
        return nilaiAkhir;
    }

    // Memberi predikat untuk nilai akhr yang sudah dihitung
    public static void Predikat(double total) {
        if (total > 80 && total <= 100) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : A ");
            System.out.println("Nilai Setara  : 4");
            System.out.println("Kualifikasi   : SANGAT BAIK ");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : B+ ");
            System.out.println("Nilai Setara  : 3.5 ");
            System.out.println("Kualifikasi   : LEBIH DARI BAIK ");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : B ");
            System.out.println("Nilai Setara  : 3 ");
            System.out.println("Kualifikasi   : BAIK ");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : C+ ");
            System.out.println("Nilai Setara  : 2.5 ");
            System.out.println("Kualifikasi   : LEBIH DARI CUKUP ");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : C ");
            System.out.println("Nilai Setara  : 2 ");
            System.out.println("Kualifikasi   : CUKUP ");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : D ");
            System.out.println("Nilai Setara  : 1 ");
            System.out.println("Kualifikasi   : KURANG ");
        } else if (total <= 39) {
            System.out.println("Nilai mutu anda adalah ");
            System.out.println("Nilai Huruf   : E ");
            System.out.println("Nilai Setara  : 0 ");
            System.out.println("Kualifikasi   : GAGAL ");
        }
    }

}