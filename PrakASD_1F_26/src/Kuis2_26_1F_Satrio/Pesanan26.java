package Kuis2_26_1F_Satrio;

public class Pesanan26 {
    int kodePesanan;
    String namaPesanan;
    int hargaPesanan;
    Pesanan26 next, prev;

    public Pesanan26(int kodePesanan, String namaPesanan, int hargaPesanan) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.hargaPesanan = hargaPesanan;
    }

    public void printPesanan() {
        String kode = String.format("%-8s", kodePesanan);
        String nama = String.format("%-23s", namaPesanan);
        String harga = String.format("%-15s", hargaPesanan);
        System.out.println("|" + kode + " | " + nama + " |" + harga + "|");

    }
}
