package P10.Tugas;

import java.util.Scanner;

public class pembeliMain26 {
    public static void menu() {
        System.out.println("Pilih Menu");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terbelakang");
        System.out.println("5. Cek posisi pembeli");
        System.out.println("6. Daftar Pembeli");
        System.out.println("--------------------------------");
        System.out.print("Pilih: ");
    }

    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.print("Masukkan kapasistas queue : ");
        int jumlah = sc26.nextInt();
        Queue26 antri = new Queue26(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc26.nextInt();
            sc26.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc26.nextLine();
                    System.out.print("Nomor HP     : ");
                    int noHp = sc26.nextInt();
                    Pembeli26 pembeli = new Pembeli26(nama, noHp);
                    antri.Enqueue(pembeli);
                    break;
                case 2:
                    Pembeli26 data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar");
                        System.out.println("Atas Nama : " + data.nama + " ");
                        System.out.println("No HP     : " + data.noHp + " ");
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.print("Nama Pembeli: ");
                    String namaPembeli = sc26.nextLine();
                    antri.peekPosition(namaPembeli);
                    break;
                case 6:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
