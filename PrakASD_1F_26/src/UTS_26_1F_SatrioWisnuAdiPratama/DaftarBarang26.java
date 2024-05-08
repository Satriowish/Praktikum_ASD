package UTS_26_1F_SatrioWisnuAdiPratama;

public class DaftarBarang26 {
    Barang26 listBarang[] = new Barang26[5];
    int idx;

    void tambah(Barang26 m) {
        if (idx < listBarang.length) {
            listBarang[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh !");
        }
    }

    void tampil() {
        for (Barang26 m : listBarang) {
            m.tampilDataBarang26();
        }
    }

}
