package P1;

import java.util.Scanner;

public class Tugas1_26 {
    public static void main(String[] args) {
        // KODE
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        // KOTA [10][12]
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ' }, // BANTEN
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ' }, // JAKARTA
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ' }, // BANDUNG
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ' }, // CIREBON
                { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ' }, // BOGOR
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ' }, // PEKALONGAN
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ' }, // SEMARANG
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ' }, // SURABAYA
                { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ' }, // MALANG
                { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ' } // TEGAL
        };

        Scanner input26 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor : ");
        char kodePlat = input26.next().charAt(0);
        // Mencari indeks kode plat
        int indexKode = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat) {
                indexKode = i;
                break;
            }
        }

        if (indexKode != -1) {
            // Mengubah array nama kota menjadi string
            StringBuilder cityName = new StringBuilder();
            for (char character : KOTA[indexKode]) {
                if (character != ' ') {
                    cityName.append(character);
                } else {
                    break;
                }
            }
            System.out.println("Kota yang sesuai : " + cityName.toString());
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}
