package P1;

import java.util.Scanner;

public class Array_26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("========================================");
        String[] namaMataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
                "Praktikum dasar Pemrograman", "Keselamatan dan Kesehatan Kerja" };
        int[] bobotSKS = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double[] nilaiMataKuliah = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] nilaiSetara = new double[8];
        double nilaiAkhir = 0.0;
        int totalSKS = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + namaMataKuliah[i] + ": ");
            double nilai = input26.nextDouble();
            // Memeriksa apakah nilai valid atau tidak
            if (!ValidasiNilai(nilai)) {
                System.out.println("Nilai tidak valid");
                return;
            }
            nilaiMataKuliah[i] = nilai;
            // hitung nilai huruf
            nilaiHuruf[i] = NilaiHuruf(nilai);
            // hitung nilai setara
            nilaiSetara[i] = NilaiSetara(nilai);
            // hitung total SKS
            totalSKS += bobotSKS[i];
            nilaiAkhir += (nilaiSetara[i] * bobotSKS[i]);
        }
        // nilai akhir (IP)
        nilaiAkhir /= totalSKS;
        // Tabel nilai
        System.out.println(
                "=====================================================================================================");
        System.out.println("| Mata Kuliah                           | SKS   | Nilai | Nilai Huruf | Nilai Setara |");
        System.out.println(
                "=====================================================================================================");
        for (int i = 0; i < 8; i++) {
            System.out.printf("| %-37s | %-5s | %-5s | %-11s | %-12s |\n", namaMataKuliah[i], bobotSKS[i],
                    nilaiMataKuliah[i],
                    nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println(
                "=====================================================================================================");

        System.out.println("Nilai Akhir   " + nilaiAkhir);
        System.out.println(
                "=====================================================================================================");

    }

    public static boolean ValidasiNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public static String NilaiHuruf(double nilai) {
        if (nilai > 80) {
            return "A";
        } else if (nilai > 73) {
            return "B+";
        } else if (nilai > 65) {
            return "B";
        } else if (nilai > 60) {
            return "C+";
        } else if (nilai > 50) {
            return "C";
        } else if (nilai > 39) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double NilaiSetara(double nilai) {
        if (nilai > 80) {
            return 4.0;
        } else if (nilai > 73) {
            return 3.5;
        } else if (nilai > 65) {
            return 3.0;
        } else if (nilai > 60) {
            return 2.5;
        } else if (nilai > 50) {
            return 2.0;
        } else if (nilai > 39) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
