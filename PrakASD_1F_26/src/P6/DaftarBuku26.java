package P6;

public class DaftarBuku26 {
    Buku26 listBk[] = new Buku26[5];
    int idx;

    void tambah(Buku26 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh !");
        }
    }

    void tampil() {
        for (Buku26 m : listBk) {
            m.tampilDataBuku();
        }
    }

    void bubbleShort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].stock > listBk[j + 1].stock) {
                    Buku26 tempBk = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = tempBk;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < listBk.length; j++) {
                if (listBk[j].stock > listBk[idxMax].stock) {
                    idxMax = j;
                }
            }
            Buku26 tempBuku26 = listBk[idxMax];
            listBk[idxMax] = listBk[i];
            listBk[i] = tempBuku26;
        }
    }
}
