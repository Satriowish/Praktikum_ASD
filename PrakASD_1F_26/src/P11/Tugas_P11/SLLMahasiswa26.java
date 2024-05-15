package P11.Tugas_P11;

public class SLLMahasiswa26 {
    Node26 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.print("Isi Linked List :   ");
            while (tmp != null) {
                System.out.print("Nim: " + tmp.data.nim + " Nama: " + tmp.data.nama + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String nim, Mahasiswa26 input) {
        Node26 ndInput = new Node26(input, null);
        Node26 temp = head;
        do {
            if (temp.data.nim.equals(nim)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, Mahasiswa26 input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node26(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
