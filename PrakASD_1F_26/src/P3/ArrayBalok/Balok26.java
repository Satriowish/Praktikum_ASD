package P3.ArrayBalok;

public class Balok26 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok26(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
