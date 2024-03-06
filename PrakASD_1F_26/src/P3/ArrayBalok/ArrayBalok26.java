package P3.ArrayBalok;

public class ArrayBalok26 {
    public static void main(String[] args) {
        Balok26[] blArray = new Balok26[4];

        // Konstruktor pertama
        blArray[0] = new Balok26(100, 30, 12);
        blArray[1] = new Balok26(120, 40, 15);
        blArray[2] = new Balok26(210, 50, 25);

        // Konstruktor kedua
        blArray[3] = new Balok26();
        blArray[3].panjang = 100;
        blArray[3].lebar = 30;
        blArray[3].tinggi = 12;

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}
