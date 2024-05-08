package UTS_26_1F_SatrioWisnuAdiPratama;

public class Barang26 {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;

    public Barang26(String kodeBarang, String nama, String kategori, int stok, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilDataBarang26() {
        System.out.println("Kode Buku    : " + kodeBarang);
        System.out.println("Judul Buku   : " + nama);
        System.out.println("Tahun Terbit : " + kategori);
        System.out.println("Pengarang    : " + stok);
        System.out.println("Stock        : " + harga);
        System.out.println();

    }

}
