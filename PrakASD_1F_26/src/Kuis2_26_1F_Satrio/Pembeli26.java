package Kuis2_26_1F_Satrio;

public class Pembeli26 {
    int no;
    String namaPembeli;
    String NoHp;
    Pembeli26 next, prev;

    public Pembeli26(int no, String namaPembeli, String NoHp) {
        this.no = no;
        this.namaPembeli = namaPembeli;
        this.NoHp = NoHp;
    }

    public void printData() {
        String nomor = String.format("%-8s", no);
        String nama = String.format("%-23s", namaPembeli);
        String noHp = String.format("%-15s", NoHp);
        System.out.println("|" + nomor + " | " + nama + " |" + noHp + "|");

    }
}

