package P15.Percobaan;

public class Graph26 {
    int vertex;
    DoubleLinkedList26 list[];

    public Graph26(int v) {
        vertex = v;
        list = new DoubleLinkedList26[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList26();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }
    // Apabila graph bertipe undirected graph, maka tambahkan kode berikut.
    // list[tujuan].addFirst(asal, jarak);

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + "  : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + "    : " + (totalIn + totalOut));
        // Apabila graph bertipe undirected maka cukup gunakan kode berikut.
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " +
        // list[asal].size());
    }

    // Percobaan 1 (Perbaikan)
    public void removeEdge(int asal, int tujuan) throws Exception {
        // for (int i = 0; i < vertex; i++) { //perbaikan pada bagian ini
        // if (i == tujuan) { // Karena tidak diperlukan
        list[asal].remove(tujuan);
        // }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf Berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}