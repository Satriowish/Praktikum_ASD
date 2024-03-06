package P3.LatihanP3;

import java.util.Scanner;

public class MahasiswaMain26 {
    public static void main(String[] args) {
        Mahasiswa26[] mhsArray = new Mahasiswa26[3];

        Scanner sc26 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            mhsArray[i] = new Mahasiswa26();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan Nama : ");
            mhsArray[i].nama = sc26.nextLine();
            System.out.print("Masukkan Nim : ");
            mhsArray[i].nim = sc26.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P) : ");
            mhsArray[i].jenisKelamin = sc26.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            mhsArray[i].ipk = sc26.nextDouble();
            sc26.nextLine();
        }

        System.out.println(" ");

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mhsArray[i].nama);
            System.out.println("Nim : " + mhsArray[i].nim);
            System.out.println("Jenis Kelamin : " + mhsArray[i].jenisKelamin);
            System.out.println("Nilai IPK : " + mhsArray[i].ipk);
            System.out.println();
        }
        System.out.println("======================");
        mhsArray[0].hitungRataIpk(mhsArray);
        System.out.println("=======================");
        mhsArray[0].tampilDataIpkTerbesar(mhsArray);
        ;
    }
}
