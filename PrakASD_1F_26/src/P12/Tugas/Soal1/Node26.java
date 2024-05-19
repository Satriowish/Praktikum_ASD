package P12.Tugas.Soal1;

public class Node26 {
    PasienVaksin26 data;
    Node26 prev, next;

    Node26(Node26 prev, PasienVaksin26 data, Node26 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
