package P3.ArrayBalok;

public class ArrayBalok26 {
    public static void main(String[] args) {
        Balok26[] blArray = new Balok26[3];

        blArray[0] = new Balok26(100, 30, 12);
        blArray[1] = new Balok26(120, 40, 15);
        blArray[2] = new Balok26(210, 50, 25);

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}
