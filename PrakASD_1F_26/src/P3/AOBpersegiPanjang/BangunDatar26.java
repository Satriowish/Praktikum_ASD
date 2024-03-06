package P3.AOBpersegiPanjang;

import P3.ArrayBalok.Segitiga26;

public class BangunDatar26 {
    Segitiga26[] segitiga26s;
    PersegiPanjang26[] persegiPanjang26s;

    void tambahSgt(Segitiga26[] segitiga26) {
        this.segitiga26s = segitiga26;
    }

    void tambahPp(PersegiPanjang26[] persegiPanjang) {
        this.persegiPanjang26s = persegiPanjang;
    }

    void tampilBangunDatar() {
        for (int i = 0; i < persegiPanjang26s.length; i++) {
            System.out.println("Persegi Panjang " + (i + 1));
            System.out.println("Panjang :" + persegiPanjang26s[i].lebar);
            System.out.println("panjang :" + persegiPanjang26s[i].panjang);
        }
        System.out.println("==========================================");
        for (int j = 0; j < segitiga26s.length; j++) {
            System.out.println("segitiga " + (j + 1));
            System.out.println("alas   : " + segitiga26s[j].alas);
            System.out.println("tinggi :" + segitiga26s[j].tinggi);
        }
    }

}
