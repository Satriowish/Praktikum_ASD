package P7;

public class PencarianBuku26 {
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

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " Tidak ditemukan ");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul Buku\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t         : " + listBk[pos].stock);
        } else {
            System.out.println("data : " + x + " Tidak ditemukan! ");
        }
    }

    public Buku26 FindBuku26(int cari) {
        Buku26 temp = null;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                temp = listBk[j];
                break;
            }
        }
        return temp;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].kodeBuku == cari) {
                return mid;
            }
            if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            }
            return FindBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }

}
