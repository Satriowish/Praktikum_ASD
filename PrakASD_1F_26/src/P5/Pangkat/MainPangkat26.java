package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("====================================");
        System.out.print("Masukan Jumlah Elemen yang dihitung : ");
        int elemen = sc26.nextInt();

        Pangkat26[] png = new Pangkat26[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan Nilai yang hendak dipangkatkan : ");
            int nilai = sc26.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = sc26.nextInt();
            png[i] = new Pangkat26(nilai, pangkat);
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + "  "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DEVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
