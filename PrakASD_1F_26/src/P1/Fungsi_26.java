package P1;

public class Fungsi_26 {

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
}
