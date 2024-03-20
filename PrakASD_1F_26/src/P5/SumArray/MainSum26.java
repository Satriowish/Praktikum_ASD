package P5.SumArray;

import java.util.Scanner;

public class MainSum26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta. Misal 5.9) ");
        System.out.print("Masukan Jumlah Perusahaan : ");
        int noPerusahaan = sc26.nextInt();

        Perusahaan26[] perusahaan = new Perusahaan26[noPerusahaan];

        for (int i = 0; i < noPerusahaan; i++) {
            System.out.println("===========================================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.print("Masukan Jumlah Bulan: ");
            int bulan = sc26.nextInt();

            double[] keuntungan = new double[bulan];

            for (int j = 0; j < bulan; j++) {
                System.out.print("Masukkan Keuntungan Bulan Ke-" + (j + 1) + ": ");
                keuntungan[j] = sc26.nextDouble();
            }

            perusahaan[i] = new Perusahaan26(bulan, keuntungan);
        }

        System.out.println("===========================================================");
        for (int i = 0; i < noPerusahaan; i++) {
            Perusahaan26 perusahaanSkrng = perusahaan[i];
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("ALGORITMA BRUTE-FORCE");
            System.out.println("Total Keuntungan perusahaan selama " + perusahaanSkrng.bulan + " Bulan adalah = " +
                    perusahaanSkrng.totalBF());
            System.out.println("===========================================================");
            System.out.println("ALGORITMA DIVIDE-CONQUER");
            System.out.printf("Total Keuntungan perusahaan selama %d Bulan adalah = %.2f\n", perusahaanSkrng.bulan,
                    perusahaanSkrng.totalDC());
        }
    }
}
