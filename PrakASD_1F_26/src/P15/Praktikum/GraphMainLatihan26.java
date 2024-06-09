package P15.Praktikum;

import java.util.Scanner;

public class GraphMainLatihan26 {
    public static void main(String[] args) throws Exception {
        Scanner sc26 = new Scanner(System.in);
        GraphMatriks26 graph = new GraphMatriks26(5);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int choice = sc26.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nomor gedung asal   : ");
                    int asal = sc26.nextInt();
                    System.out.print("Masukkan Nomor gedung tujuan : ");
                    int tujuan = sc26.nextInt();
                    System.out.print("Masukkan jarak               : ");
                    int jarak = sc26.nextInt();
                    graph.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan Nomor gedung asal   : ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Nomor gedung tujuan : ");
                    tujuan = sc26.nextInt();
                    graph.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan Nomor gedung : ");
                    asal = sc26.nextInt();
                    graph.degree(asal);
                    break;
                case 4:
                    graph.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan Nomor gedung asal   : ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan Nomor gedung tujuan : ");
                    tujuan = sc26.nextInt();
                    if (graph.matriks[asal][tujuan] != 0) {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan)
                                + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan)
                                + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    sc26.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
