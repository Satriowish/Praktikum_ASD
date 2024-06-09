package P15.Praktikum;

public class GraphMatriks26 {
    int vertex;
    int[][] matriks;

    public GraphMatriks26(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() throws Exception {
        System.out.print("\t");
        for (int i = 0; i < vertex; i++) {
            System.out.print((char) ('A' + i) + "\t");
        }
        System.out.println();
        for (int i = 0; i < vertex; i++) {
            System.out.print((char) ('A' + i) + "\t");
            for (int j = 0; j < vertex; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;
        // inDegree
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                totalIn++;
            }
        }
        // outDegree
        for (int j = 0; j < vertex; j++) {
            if (matriks[asal][j] != 0) {
                totalOut++;
            }
        }
        // Hasil Akhir
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + "  : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + "    : " + (totalIn + totalOut));
    }

}
