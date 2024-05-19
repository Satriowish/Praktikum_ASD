package P12.Tugas.Soal2;

import java.util.Scanner;

public class FilmMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        Scanner sc26p1 = new Scanner(System.in);
        FilmList26 filmList = new FilmList26();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data pada index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data pada index tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari film berdasarkan ID");
            System.out.println("9. Urut data rating film descending");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu : ");
            int pilih = sc26.nextInt();
            sc26.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID film     : ");
                    int idAwal = sc26.nextInt();
                    System.out.print("Judul film  : ");
                    String judulAwal = sc26p1.nextLine();
                    System.out.print("Rating film : ");
                    double ratingAwal = sc26.nextDouble();
                    filmList.addFirst(new Film26(idAwal, judulAwal, ratingAwal));
                    break;
                case 2:
                    System.out.print("ID film     : ");
                    int idAkhir = sc26.nextInt();
                    System.out.print("Judul film  : ");
                    String judulAkhir = sc26p1.nextLine();
                    System.out.print("Rating film : ");
                    double ratingAkhir = sc26.nextDouble();
                    filmList.addLast(new Film26(idAkhir, judulAkhir, ratingAkhir));
                    break;
                case 3:
                    System.out.print("Masukkan index : ");
                    int index = sc26.nextInt();
                    System.out.print("ID film     : ");
                    int idIndex = sc26.nextInt();
                    System.out.print("Judul film  : ");
                    String judulIndex = sc26p1.nextLine();
                    System.out.print("Rating film : ");
                    double ratingIndex = sc26.nextDouble();
                    filmList.addAtIndex(new Film26(idIndex, judulIndex, ratingIndex), index);
                    break;
                case 4:
                    filmList.removeFirst();
                    break;
                case 5:
                    filmList.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan index yang akan dihapus : ");
                    int removeIndex = sc26.nextInt();
                    filmList.removeAtIndex(removeIndex);
                    break;
                case 7:
                    filmList.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID film yang ingin dicari : ");
                    int searchId = sc26.nextInt();
                    filmList.searchById(searchId);
                    break;
                case 9:
                    filmList.sortByRatingDescending();
                    break;
                case 10:
                    System.out.println("Terima kasih telah menggunakan program daftar film.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
