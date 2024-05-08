package UTS_26_1F_SatrioWisnuAdiPratama;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        DaftarBarang26 listBarang26 = new DaftarBarang26();

        while (true) {
            System.out.println();
            System.out.println("|========================= TOKO Manasuka =============================|");
            System.out.println("|                                                                     |");
            System.out.println("| 1. Data Barang                                                      |");
            System.out.println("| 2. Data Transaksi                                                   |");
            System.out.println("| 3. Pencarian Data                                                   |");
            System.out.println("| 4. Pengurutan Data                                                  |");
            System.out.println("| 5. Tampilkan Kode terbalik                                          |");
            System.out.println("|                                                                     |");
            System.out.println("=======================================================================");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilihan = sc26.nextInt();
            sc26.nextLine();

            switch (pilihan) {
                case 1:

                    Barang26 m = new Barang26("Br001", "Leo Keripik", "Makanan ", 10, 1000);
                    Barang26 m1 = new Barang26("Br002", "Leo Keripik", "Minuman ", 10, 7000);
                    Barang26 m2 = new Barang26("Br003", "Leo Keripik", "Minuman ", 10, 4000);
                    Barang26 m3 = new Barang26("Br004", "Leo Keripik", "Sabun ", 10, 7000);
                    Barang26 m4 = new Barang26("Br005", "Leo Keripik", "Sabun ", 10, 1000);
                    listBarang26.tambah(m);
                    listBarang26.tambah(m1);
                    listBarang26.tambah(m2);
                    listBarang26.tambah(m3);
                    listBarang26.tambah(m4);
                    listBarang26.tampil();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak Valid. Silahkan coba lagi!");
            }
        }
    }
}
