package P5.SumArray;

import java.util.Scanner;

public class MainSum26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta. Misal 5.9) ");
        System.out.print("Masukan Jumlah Bulan : ");
        int elm = sc26.nextInt();

        sumArray26 sm = new sumArray26(elm);
        System.out.println("===========================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan Unrung Bulan Ke- " + (i + 1) + " : ");
            sm.keuntungan[i] = sc26.nextDouble();
        }
        System.out.println("===========================================================");
        System.out.println("ALGORITMA BRUTE-FORCE");
        System.out.println(
                "Total Keuntungan perusahaan selama " + sm.elemen + " Bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("===========================================================");
        System.out.println("ALGORITMA DIVIDE-CONQUER");
        System.out.printf("Total Keuntungan perusahaan selama %d Bulan adalah = %.2f\n", sm.elemen,
                sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
}
