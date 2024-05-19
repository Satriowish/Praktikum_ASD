package P12.Tugas.Soal1;

public class AntrianVaksin26 {
    DoubleLinkedList26 listAntrian;

    public AntrianVaksin26() {
        listAntrian = new DoubleLinkedList26();
    }

    public void addPasien(int nomorAntrian, String name) {
        listAntrian.addLast(new PasienVaksin26(nomorAntrian, name));
    }

    public void removePasien() {
        try {
            PasienVaksin26 removedRecipient = listAntrian.getFirst();
            listAntrian.removeFirst();
            System.out.println(removedRecipient.name + " telah selesai divaksinasi.");
        } catch (Exception e) {
            System.out.println("Antrian kosong, tidak ada penerima vaksin yang tersedia.");
        }
    }

    public void listPasien() {
        System.out.println("Daftar penerima vaksin yang masih dalam antrian:");
        listAntrian.print();
        System.out.println("Sisa antrian = " + listAntrian.size());
    }

    public void exitProgram() {
        System.out.println("Terima kasih telah menggunakan layanan vaksinasi. Sampai jumpa!");
        System.exit(0);
    }
}
