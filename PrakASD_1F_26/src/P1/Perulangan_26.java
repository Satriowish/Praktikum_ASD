package P1;

import java.util.Scanner;

public class Perulangan_26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = input26.nextLine();
        // untuk mengambil 2 digit angka terakhir dari NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }
        System.out.print("OUTPUT : ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) { // Angka 6 dan 10 tidak dicetak
                continue;
            }
            if (i % 2 == 0) { // Angka genap dicetak sesuai bilangan aslinya
                System.out.print(i + " ");
            } else { // Angka ganjil akan tercetak dengan *
                System.out.print("* ");
            }
        }
    }
}
