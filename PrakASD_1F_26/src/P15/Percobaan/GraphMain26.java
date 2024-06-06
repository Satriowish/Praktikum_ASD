package P15.Percobaan;

import java.util.Scanner;

public class GraphMain26 {
    public static void main(String[] args) throws Exception {
        // Graph26 gedung = new Graph26(6);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // ********* Percobaan 1 Soal No 5 **************
        // Scanner sc26 = new Scanner(System.in);
        // System.out.print("Masukkan gedung asal : ");
        // int asal = sc26.nextInt();
        // System.out.print("Masukkan gedung tujuan : ");
        // int tujuan = sc26.nextInt();
        // gedung.tetangga(asal, tujuan);
        // sc26.close();

        GraphMatriks26 gdg = new GraphMatriks26(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        gdg.degree(0);

    }
}