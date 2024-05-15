package P11.Tugas_P11.Soal2;

public class SLLAntrianMain26 {
    public static void main(String[] args) {
        SLLAntrian26 Mhs = new SLLAntrian26();

        Mhs26 m1 = new Mhs26("111", "Anton");
        Mhs26 m2 = new Mhs26("112", "Prita");
        Mhs26 m3 = new Mhs26("113", "Yusuf");
        Mhs26 m4 = new Mhs26("114", "Doni");
        Mhs26 m5 = new Mhs26("115", "Sari");

        Mhs.print();
        Mhs.Enqueue(m1);// Menambahkan data mahasiswa ke 1
        Mhs.print();
        Mhs.Enqueue(m2);// Menambahkan data mahasiswa ke 2
        Mhs.print();
        Mhs.Enqueue(m3);// Menambahkan data mahasiswa ke 3
        Mhs.print();
        Mhs.Enqueue(m4);// Menambahkan data mahasiswa ke 4
        Mhs.print();
        Mhs.Enqueue(m5);// Menambahkan data mahasiswa ke 5
        Mhs.print();
        Mhs.Dequeue();
        // Menghapus data mahasiswa yang paling depan atau pertama
        // atau Remove First
        Mhs.print();
        Mhs.Dequeue();
        // Menghapus data mahasiswa yang paling depan atau pertama
        // atau Remove First
        Mhs.print();
    }
}
