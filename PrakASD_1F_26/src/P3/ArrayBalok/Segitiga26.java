package P3.ArrayBalok;

public class Segitiga26 {
    public int alas;
    public int tinggi;
    public int sisiMiring;

    public Segitiga26(int a, int t) {
        alas = a;
        tinggi = t;
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
            System.out.println();
        }
    }
}
