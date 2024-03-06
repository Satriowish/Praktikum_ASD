package P3.ArrayBalok;

public class Segitiga26 {
    public int alas;
    public int tinggi;
    public double sisiMiring;

    public Segitiga26(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas * tinggi * 1 / 2;
    }

    public int hitungKeliling() {
        sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + (int) sisiMiring;
    }

    public static void main(String[] args) {
        Segitiga26[] sgArray = new Segitiga26[4];

        sgArray[0] = new Segitiga26(15, 5);
        sgArray[1] = new Segitiga26(20, 10);
        sgArray[2] = new Segitiga26(15, 10);
        sgArray[3] = new Segitiga26(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + (i + 1) + ":");
            System.out.println("Alas: " + sgArray[i].alas);
            System.out.println("Tinggi: " + sgArray[i].tinggi);
            System.out.println("Luas : " + sgArray[i].hitungLuas());
            System.out.println("Keliling : " + sgArray[i].hitungKeliling());
            System.out.println();
        }
    }
}
