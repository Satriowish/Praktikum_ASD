package P11.Tugas_P11.Soal1;

public class SLLMahasiswaMain26 {
    SLLMahasiswa26 mhs;

    public SLLMahasiswaMain26() {
        mhs = new SLLMahasiswa26();

        Mahasiswa26 m1 = new Mahasiswa26("111", "Anton");
        Mahasiswa26 m2 = new Mahasiswa26("112", "Prita");
        Mahasiswa26 m3 = new Mahasiswa26("113", "Yusuf");
        Mahasiswa26 m4 = new Mahasiswa26("114", "Doni");
        Mahasiswa26 m5 = new Mahasiswa26("115", "Sari");

        mhs.print();// Dta masih kosong
        mhs.addFirst(m2);// Menambah data pertama merupakan mhs ke 2
        mhs.print();
        mhs.addLast(m5);// Menambah data terakhir merupakan mhs ke 5
        mhs.print();
        mhs.addFirst(m1);// Menambahkan data mhs ke 1 didepan mhs ke 2
        mhs.print();
        mhs.insertAfter("112", m3);// Menambahkan data mhs ke 3 setelah mhs ke 2
        mhs.print();
        mhs.insertAt(3, m4);// Menambahkan mhs ke 4 di indeks ke 3
        mhs.print();
    }

    public static void main(String[] args) {
        new SLLMahasiswaMain26();
    }

}
