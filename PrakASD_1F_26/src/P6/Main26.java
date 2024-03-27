package P6;

public class Main26 {
    public static void main(String[] args) {
        DaftarBuku26 listBuku = new DaftarBuku26();

        Buku26 m = new Buku26(20215, "Algoritma", 2019, "Wahyuni", 5);
        Buku26 m1 = new Buku26(20214, "Big Data", 2020, "Susilo", 3);
        Buku26 m2 = new Buku26(20212, "Desain UI", 2021, "Supriadi", 6);
        Buku26 m3 = new Buku26(20211, "Web Programming", 2022, "Pustaka Adi", 2);
        Buku26 m4 = new Buku26(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);
        listBuku.tambah(m);
        listBuku.tambah(m1);
        listBuku.tambah(m2);
        listBuku.tambah(m3);
        listBuku.tambah(m4);

        System.out.println("***************************");
        System.out.println("Data Sebelum Diurutkan ");
        listBuku.tampil();

        // System.out.println("***************************");
        // System.out.println("Data Seytelah diurutkan Secara Asc berdasarkan stock
        // Menggunakan Bubble sort");
        // listBuku.bubbleShort();
        // listBuku.tampil();

        System.out.println("***************************");
        System.out.println("Data Seytelah diurutkan Secara Desc berdasarkan stock Menggunakan Selection Sort");
        listBuku.selectionSort();
        listBuku.tampil();
    }
}
