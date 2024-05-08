package P11.Praktikum1;

import java.util.Scanner;

public class QueueMain26 {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Print");
        System.out.println("4.Peek");
        System.out.println("5.Clear");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        Queue26 Q = new Queue26(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang keluar : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
