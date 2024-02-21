package P1;

public class Fungsi26 {
    public static int[][] stokBunga = {
            { 10, 5, 15, 7 }, // RoyalGarden 1
            { 6, 11, 9, 12 }, // RoyalGarden 2
            { 2, 10, 10, 5 }, // RoyalGarden 3
            { 5, 7, 12, 9 } // RoyalGarden 4
    };
    public static int[] HargaBunga = { 75000, 50000, 60000, 10000 }; // {Aglonema, Keladi, Alocasia, Mawar}

    public static void main(String[] args) {
        // tabel penjualan setiap cabang
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| RoyalGarden   | Aglonema   | Keladi     | Alocasia   | Mawar      |");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.printf("| RoyalGarden %s |", i + 1);
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.printf("     %-7s|", stokBunga[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");
        tampilkanPendapatanPerCabang();
        StokPerCabang4();
    }

    // Fungsi untuk menampilkan pendapatan setiap cabang jika semua bunga terjual
    public static void tampilkanPendapatanPerCabang() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| RoyalGarden   | Pendapatan   |");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            System.out.printf("| RoyalGarden %s |", i + 1);
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * HargaBunga[j];
            }
            System.out.printf("   %-11s|", pendapatan);
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");
    }

    // Fungsi untuk menampilkan jumlah stok bunga pada Cabang 4
    public static void StokPerCabang4() {
        int[] stokBungaRoyalGarden4 = stokBunga[3];
        // Pengurangan stok karena bunga mati
        stokBungaRoyalGarden4[0] -= 1; // Aglonema
        stokBungaRoyalGarden4[1] -= 2; // Keladi
        stokBungaRoyalGarden4[3] -= 5; // Mawar
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" jumlah Stock setiap jenis bunga pada cabang royalgarden 4.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| Jenis Bunga | Jumlah Stok |");
        System.out.println("---------------------------------------------------------------------");
        String[] jenisBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        for (int i = 0; i < stokBungaRoyalGarden4.length; i++) {
            System.out.printf("| %-11s|     %-8s|", jenisBunga[i], stokBungaRoyalGarden4[i]);
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");
    }
}
