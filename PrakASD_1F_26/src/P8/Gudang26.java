package P8;

public class Gudang26 {
    Barang26[] tumpukan;
    int size;
    int top;

    public Gudang26(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang26[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang26 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " Berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sidah penuh");
        }
    }

    public Barang26 ambilBarang() {
        if (!cekKosong()) {
            Barang26 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam Biner : " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang Kosong!");
            return null;
        }
    }

    public Barang26 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang26 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang Kosong!");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian Tumpukan Barang di Gudang : ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang Kosong!");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi26 stack = new StackKonversi26();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang26 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang26 barangTerbawah = tumpukan[0];
            System.out.println("Barang Terbawah : " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang Kosong!");
            return null;
        }
    }

    public int cariBarangbyNama(String cari) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].nama.equalsIgnoreCase(cari)) {
                System.out.println("Barang dengan nama '" + cari + "' ditemukan pada indeks " + i);
                return i;
            }
        }
        System.out.println("Barang dengan nama '" + cari + "' tidak ditemukan.");
        return -1;
    }

}
