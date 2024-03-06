package P3.AOBpersegiPanjang;

import java.util.Scanner;

public class ArrayObject26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        PersegiPanjang26[][] array2D = new PersegiPanjang26[1][3];

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = new PersegiPanjang26();
                System.out.println("Persegi panjang ke-" + j);
                System.out.print("Masukkan Panjang: ");
                array2D[i][j].panjang = sc26.nextInt();
                System.out.print("Masukkan Lebar: ");
                array2D[i][j].lebar = sc26.nextInt();
            }
        }

        // ========== Percobaan 1 ==============
        // ppArray[0] = new PersegiPanjang26();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new PersegiPanjang26();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new PersegiPanjang26();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        // System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang +
        // ", lebar: " + ppArray[0].lebar);
        // System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang +
        // ", lebar: " + ppArray[1].lebar);
        // System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang +
        // ", lebar: " + ppArray[2].lebar);

        // =========== Percobaan 2 =============
        // for (int i = 0; i < ppArray.length; i++) {
        // ppArray[i] = new PersegiPanjang26();
        // System.out.println("Persegi panjang ke-" + i);
        // System.out.print("Masukkan Panjang: ");
        // ppArray[i].panjang = sc26.nextInt();
        // System.out.print("Masukkan Lebar: ");
        // ppArray[i].lebar = sc26.nextInt();
        // }

        // for (int i = 0; i < ppArray.length; i++) {
        // System.out
        // .println("Persegi Panjang ke-" + i + ", panjang: " + ppArray[i].panjang + ",
        // lebar: "
        // + ppArray[i].lebar);
        // }
        // =========== Percobaan 2 Pertanyaan 1 & 2 ===========
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("Persegi Panjang ke-" + j + ", baris: " + i + ", kolom: " + j + ", panjang: "
                        + array2D[i][j].panjang + ", lebar: " + array2D[i][j].lebar);
            }
        }
    }
}
