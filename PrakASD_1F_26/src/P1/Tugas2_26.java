package P1;

import java.util.Scanner;

public class Tugas2_26 {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        while (true) {// Menu memilih rumus yang akan dihitung (kecepatan/jarak/waktu)
            System.out.println();
            System.out.println("Pilih rumus yang akan dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            byte Pilih = input26.nextByte();
            double Hasil;

            switch (Pilih) {
                case 1:
                    Hasil = hitungKecepatan(input26);
                    System.out.println("Kecepatan: " + Hasil + " m/s");
                    break;
                case 2:
                    Hasil = hitungJarak(input26);
                    System.out.println("Jarak: " + Hasil + " meter");
                    break;
                case 3:
                    Hasil = hitungWaktu(input26);
                    System.out.println("Waktu: " + Hasil + " detik");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println();
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static double hitungKecepatan(Scanner scanner) {
        System.out.println();
        System.out.println("Silahkan masukan angka untuk Menghitung Kecepatan");
        System.out.print("Masukkan jarak (meter): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double t = scanner.nextDouble();
        return s / t;
    }

    public static double hitungJarak(Scanner scanner) {
        System.out.println();
        System.out.println("Silahkan masukan angka untuk Menghitung Jarak");
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = scanner.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double t = scanner.nextDouble();
        return v * t;
    }

    public static double hitungWaktu(Scanner scanner) {
        System.out.println();
        System.out.println("Silahkan masukan angka untuk Menghitung Waktu");
        System.out.print("Masukkan jarak (meter): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double v = scanner.nextDouble();
        return s / v;
    }
}
