package P6.Latihan;

public class HotelMain26 {
    public static void main(String[] args) {

        HotelService26 hotelService = new HotelService26();
        Hotel26[] rooms = {
                new Hotel26("HardRock", "Kota Denpasar", 500, (byte) 5),
                new Hotel26("The Heritage", "Kota Bandung", 350, (byte) 3),
                new Hotel26("GreenForest", "Kota Bogor", 100, (byte) 2),
                new Hotel26("Cassablanca", "Kota Jakarta", 400, (byte) 4),
                new Hotel26("Paradise Resort", "Kota Banyuwangi", 300, (byte) 3)
        };
        for (Hotel26 room : rooms) {
            hotelService.tambah(room);
        }

        System.out.println("===================== DATA SEBELUM DISORTING =========================");
        hotelService.tampilAll();
        System.out.println();

        hotelService.bubbleSortHarga();
        System.out.println("======== DATA HARGA SETELAH DISORTING MENGGUNAKAN BUBBLE SORT ========");
        hotelService.tampilAll();
        System.out.println();

        hotelService.selectionSortHarga();
        System.out.println("====== DATA HARGA SETELAH DISORTING MENGGUNAKAN SELECTION SORT =======");
        hotelService.tampilAll();

    }
}
