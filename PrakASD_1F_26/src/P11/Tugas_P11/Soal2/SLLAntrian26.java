package P11.Tugas_P11.Soal2;

public class SLLAntrian26 {
    Node26 head, tail;

    boolean isEmpty() {
        return head == null && tail == null;
    }

    void Enqueue(Mhs26 input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            // jika kosong, maka peran head dan tail harus dimiliki node yang sama
            tail = ndInput;
            head = ndInput;
        } else {
            // head = ndInput;
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.println("Isi Linked List : \t");
            while (tmp != null) {
                System.out.println("Nama mahasiswa  : " + tmp.data.nama + "  NIM Mahasiswa : " + tmp.data.nim + "\t");
                tmp = tmp.next;
            }
            System.out.println("");

        } else {
            System.out.println("Linked List kosong !");
        }
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong," + "tidak dapat dihapus");
        } else if (head == tail) {
            head = null;
        } else {
            head = head.next;
        }
    }
}
