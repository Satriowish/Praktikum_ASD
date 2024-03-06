package P3.ArrayBalok;

public class Balok26 {
    public int panjang;
    public int lebar;
    public int tinggi;

    // Konstruktor pertama
    public Balok26(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    // Konstruktor kedua
    public Balok26() {
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
