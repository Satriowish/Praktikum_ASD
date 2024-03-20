package P5.Faktorial;

import java.util.Scanner;

public class MainFaktorial26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("===============================");
        System.out.print("Masukan Jumlah Elemen : ");
        int ijml = sc26.nextInt();

        Faktorial26[] fk = new Faktorial26[ijml];
        for (int i = 0; i < ijml; i++) {
            fk[i] = new Faktorial26();
            System.out.print("Masukkan Nilai Data Ke-" + (i + 1) + ": ");
            fk[i].nilai = sc26.nextInt();
            System.out.println("HASIL - BRUTE FORCE ");
        }
        for (int i = 0; i < ijml; i++) {
            System.out.println(
                    "Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i = 0; i < ijml; i++) {
            System.out.println(
                    "Hasil penghitungan faktorial menggunakan Devide Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
