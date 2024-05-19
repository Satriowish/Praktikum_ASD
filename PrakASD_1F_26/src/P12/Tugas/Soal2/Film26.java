package P12.Tugas.Soal2;

public class Film26 {
    int id;
    String judul;
    double rating;
    Film26 next, prev;

    public Film26(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public void printData() {
        System.out.println("ID Judul   : " + id);
        System.out.println("Judul Film : " + judul);
        System.out.println("Rating     : " + rating);
        System.out.println();
    }
}
