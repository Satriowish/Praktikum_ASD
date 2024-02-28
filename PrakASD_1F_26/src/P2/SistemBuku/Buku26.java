package P2.SistemBuku;

public class Buku26 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    public Buku26() {

    }

    public Buku26(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilkanInformasi() {
        System.out.println();
        System.out.println("Judul          : " + judul);
        System.out.println("Pengarang      : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa Stok      : " + stok);
        System.out.println("Harga          : Rp." + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("               : Stock buku habis");
        }
    }

    void restock(int jml) {
        stok = jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public int hitungHargaTotal(int jmlJual) {
        return harga * jmlJual;
    }

    public int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) { // diskon 12%
            return (int) (hargaTotal * 0.12);
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return (int) (hargaTotal * 0.05);
        } else {
            return 0;
        }
    }

    public int hitungHargaBayar(int hargaTotal) {
        return hargaTotal -= hitungDiskon(hargaTotal);
    }
}
