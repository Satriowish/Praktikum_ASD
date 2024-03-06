package P3.AOBpersegiPanjang;

import P3.ArrayBalok.Segitiga26;

public class BanguMain26 {
    public static void main(String[] args) {
        Segitiga26 sg1 = new Segitiga26(5, 10);
        Segitiga26 sg2 = new Segitiga26(10, 15);
        Segitiga26 sg3 = new Segitiga26(15, 20);
        PersegiPanjang26 pp1 = new PersegiPanjang26(5, 10);
        PersegiPanjang26 pp2 = new PersegiPanjang26(2, 8);
        PersegiPanjang26 pp3 = new PersegiPanjang26(10, 15);

        Segitiga26[] s = new Segitiga26[3];
        PersegiPanjang26[] p = new PersegiPanjang26[3];

        s[0] = sg1;
        s[1] = sg2;
        s[2] = sg3;
        p[0] = pp1;
        p[1] = pp2;
        p[2] = pp3;

        BangunDatar26 bd = new BangunDatar26();
        bd.tambahSgt(s);
        bd.tambahPp(p);
        bd.tampilBangunDatar();

    }
}
