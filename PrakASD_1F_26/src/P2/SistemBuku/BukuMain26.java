package P2.SistemBuku;

public class BukuMain26 {
    public static void main(String[] args) {

        Buku26 bk1 = new Buku26();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 17;
        bk1.harga = 71000;
        bk1.tampilkanInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilkanInformasi();

        Buku26 bk2 = new Buku26("Self Reward", "Maheera ayesha", 160, 29, 59000);
        int hargaTotal = bk2.hitungHargaTotal(2);
        bk2.tampilkanInformasi();
        System.out.println("Harga Total    : Rp." + hargaTotal);
        System.out.println("hargaDiskon    : Rp." + bk2.hitungDiskon(hargaTotal));
        System.out.println("Perhitungan    : Rp." + hargaTotal + " - Rp." + bk2.hitungDiskon(hargaTotal));
        System.out.println("hargaBayar     : Rp." + bk2.hitungHargaBayar(hargaTotal));

        Buku26 bukuSatrio = new Buku26("99 Untuk Tuhanku", "Emha Ainun Nadjib", 200, 50, 75000);
        bukuSatrio.tampilkanInformasi();
    }
}
