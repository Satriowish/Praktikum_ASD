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

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data : " + x + " Tidak ditemukan ");
        }
    }

    // Metode untuk menampilkan posisi dan detail buku berdasarkan kode buku
    public void TampilData(String kode, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan kode " + kode + " ditemukan pada indeks " + pos);
            listBk[pos].tampilDataBuku();
        } else {
            System.out.println("Data dengan kode " + kode + " tidak ditemukan!");
        }
    }

    // Method baru untuk mencari data bertipe String menggunakan Sequential search
    public int FindSeqSearchStringKode(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // Method baru untuk mencari data bertipe String menggunakan Binary search
    public int FindBinarySearchStringKode(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].kodeBuku.equals(cari)) {
                return mid;
            }
            int compareResult = listBk[mid].kodeBuku.compareTo(cari);
            if (compareResult > 0) {
                return FindBinarySearchStringKode(cari, left, mid - 1);
            }
            return FindBinarySearchStringKode(cari, mid + 1, right);
        }
        return -1;
    }

    // Method untuk mengurutkan data menggunakan bubble sort
    public void sortDataBubble() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].kodeBuku.compareTo(listBk[j + 1].kodeBuku) > 0) {
                    Buku26 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    // Method untuk mencari data judul buku menggunakan Sequential search
    public int FindSeqSearchStringJudul(String cari) {
        int cariJudul = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                cariJudul++;
                if (cariJudul >= 1) {
                    System.out.println("Data dengan judul " + cari + " ditemukan : ");
                }
                listBk[j].tampilDataBuku();
            }
        }
        return cariJudul;
    }

    // Method untuk mencari data judul buku menggunakan Binary search
    public int FindBinarySearchStringJudul(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                return mid;
            }
            int compareResult = listBk[mid].judulBuku.compareToIgnoreCase(cari);
            if (compareResult > 0) {
                return FindBinarySearchStringJudul(cari, left, mid - 1);
            }
            return FindBinarySearchStringJudul(cari, mid + 1, right);
        }
        return -1;
    }

}

// **** Pencarian Sequential Berdasarkan kode buku bertipe int
// public int FindSeqSearch(int cari) {
// int posisi = -1;
// for (int j = 0; j < listBk.length; j++) {
// if (listBk[j].kodeBuku == cari) {
// posisi = j;
// break;
// }
// }
// return posisi;
// }

// **** Method baru dengan konsep sequential search
// public Buku26 FindBuku26(int cari) {
// Buku26 temp = null;
// for (int j = 0; j < listBk.length; j++) {
// if (listBk[j].kodeBuku == cari) {
// temp = listBk[j];
// break;
// }
// }
// return temp;
// }

// **** Pencarian Binary search Berdasarkan kode buku bertipe int
// public int FindBinarySearch(int cari, int left, int right) {
// if (right >= left) {
// int mid = left + (right - left) / 2;
// if (listBk[mid].kodeBuku == cari) {
// return mid;
// }
// if (listBk[mid].kodeBuku > cari) {
// return FindBinarySearch(cari, left, mid - 1);
// }
// return FindBinarySearch(cari, mid + 1, right);
// }
// return -1;
// }

// **** Sorting data menggunakan insert sort bertipe int
// public void InsertionSort() {
// for (int i = 1; i < listBk.length; i++) {
// Buku26 key = listBk[i];
// int j = i - 1;
// while (j >= 0 && listBk[j].kodeBuku > key.kodeBuku) {
// listBk[j + 1] = listBk[j];
// j = j - 1;
// }
// listBk[j + 1] = key;
// }
// }