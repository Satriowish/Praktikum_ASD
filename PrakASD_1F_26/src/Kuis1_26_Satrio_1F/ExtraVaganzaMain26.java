package Kuis1_26_Satrio_1F;

import Kuis1_26_Satrio_1F.ExtraVaganzaItem26;
import java.util.Scanner;

public class ExtraVaganzaMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        ExtraVaganzaItem26 arrTransaction[] = new ExtraVaganzaItem26[10];

        do {
            System.out.println();
            System.out.println("|========================= APT Pharmachy =============================|");
            System.out.println("|                                                                     |");
            System.out.println("| 1. Input Data                                                       |");
            System.out.println("| 2. Display Data                                                     |");
            System.out.println("| 3. Update Data                                                      |");
            System.out.println("| 4. Penjualan                                                        |");
            System.out.println("| 5. Exit                                                             |");
            System.out.println("|                                                                     |");
            System.out.println("=======================================================================");
            System.out.print(" Pilih Menu : ");
            byte Pilih = sc26.nextByte();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println();
            switch (Pilih) {
                case 1: // Input Data
                    sc26.nextLine();
                    for (int i = 0; i < 10; i++) {
                        arrTransaction[i] = new ExtraVaganzaItem26(null, null, i, i);
                        System.out.println("Silahkan Masukkan data ");
                        System.out.print("Masukkan Nama         : ");
                        arrTransaction[i].nama = sc26.nextLine();
                        System.out.print("Masukkan category     : ");
                        arrTransaction[i].category = sc26.nextLine();
                        System.out.print("Masukkan Jumlah Stock : ");
                        arrTransaction[i].stock = sc26.nextInt();
                        System.out.print("Masukkan Jumlah Harga : ");
                        arrTransaction[i].price = sc26.nextInt();
                        sc26.nextLine();
                        System.out.println("Data Obat Berhasil ditambahkan!");
                        System.out.println("Apakah ingin Kembali ke menu? (y/n) ");
                        System.out.print("Pilih Salah Satu          : ");
                        String lanjut = sc26.nextLine();
                        System.out.println("=====================================================================");
                        System.out.println();
                        if (lanjut.equalsIgnoreCase("y")) {
                            break;
                        }
                    }

                    break;
                case 2: // Display Data
                    for (int i = 0; i < 10; i++) {
                        System.out.println("===========================================");
                        System.out.println("Nama     :" + arrTransaction[i].nama);
                        System.out.println("Category :" + arrTransaction[i].category);
                        System.out.println("Stock    :" + arrTransaction[i].stock);
                        System.out.println("Price    :" + arrTransaction[i].price);
                        System.out.println("===========================================");
                    }
                case 3:
                    System.out.println("|========================= APT Pharmachy =============================|");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Input Nama             :" + arrTransaction[i].nama);
                        System.out.println("Harga Sebelum diupdate :" + arrTransaction[i].price);
                        System.out.println("===================================================================");
                        System.out.println("Input Harga Baru       : ");
                        arrTransaction[i].price = sc26.nextInt();
                        System.out.println("================== Data Setelah Diupdate ==========================");
                        System.out.println("Nama     :" + arrTransaction[i].nama);
                        System.out.println("Category :" + arrTransaction[i].category);
                        System.out.println("Stock    :" + arrTransaction[i].stock);
                        System.out.println("Price    :" + arrTransaction[i].price);
                        System.out.println("===================================================================");
                        System.out.println("Apakah ingin Kembali ke menu? (y/n) ");
                        sc26.nextLine();
                        System.out.print("Pilih Salah Satu          : ");
                        String lanjut = sc26.nextLine();
                        System.out.println("=====================================================================");
                        System.out.println();
                        if (lanjut.equalsIgnoreCase("y")) {
                            break;
                        }
                    }
                    break;
                case 4: // Belum Jadi :)
                    System.out.println("|========================= APT Pharmachy =============================|");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Input Nama             :" + arrTransaction[i].nama);
                        System.out.println("Harga Sebelum diupdate :" + arrTransaction[i].price);
                        System.out.println("===================================================================");
                        System.out.println("Jumlah Beli           : ");
                        arrTransaction[i].stock = sc26.nextInt();
                        System.out.println("================== Data Setelah Diupdate ==========================");
                        System.out.println("Nama     :" + arrTransaction[i].nama);
                        System.out.println("Category :" + arrTransaction[i].category);
                        System.out.println("Stock    :" + arrTransaction[i].stock);
                        System.out.println("Price    :" + arrTransaction[i].price);
                        System.out.println("===================================================================");
                        System.out.println("Apakah ingin Kembali ke menu? (y/n) ");
                        sc26.nextLine();
                        System.out.print("Pilih Salah Satu          : ");
                        String lanjut = sc26.nextLine();
                        System.out.println("=====================================================================");
                        System.out.println();
                        if (lanjut.equalsIgnoreCase("y")) {
                            break;
                        }
                    }

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("------------------------- Pilihan Tidak Valid! ------------------------");
            }
        } while (true);
    }
}
