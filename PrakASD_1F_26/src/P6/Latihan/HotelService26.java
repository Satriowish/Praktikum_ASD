package P6.Latihan;

public class HotelService26 {
    Hotel26[] rooms;
    int size;

    public HotelService26() {
        this.rooms = new Hotel26[100];
        this.size = 0;
    }

    public void tambah(Hotel26 H) {
        rooms[size++] = H;
    }

    public void tampilAll() {
        System.out.println("======================================================================");
        System.out.printf("| %-20s | %-20s | %-10s | %-7s |\n", "Nama Hotel", "Kota", "Harga", "Bintang");
        System.out.println("======================================================================");
        for (int i = 0; i < size; i++) {
            System.out.printf("| %-20s | %-20s | %-10d | %-7d |\n", rooms[i].nama, rooms[i].kota, rooms[i].harga,
                    rooms[i].bintang);
        }
        System.out.println("======================================================================");
    }

    public void bubbleSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel26 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortHarga() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].harga < rooms[minIndex].harga) {
                    minIndex = j;
                }
            }
            Hotel26 temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    public void bubbleSortBintang() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].bintang < rooms[j + 1].bintang) {
                    Hotel26 temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortBintang() {
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].bintang > rooms[maxIndex].bintang) {
                    maxIndex = j;
                }
            }
            Hotel26 temp = rooms[maxIndex];
            rooms[maxIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
