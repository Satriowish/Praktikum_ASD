package P11.SingleLinkedList;

public class SingleLinkedList26 {
    Node26 head, tail;

    boolean isEmpty() { // kondisi headnya harus berisi null
        return head == null;
    }

    void print() { // pencetakan data ini tidak membolehkan LL dalam kodisi kosong
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.print("Isi Linked List:      ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addFirst
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addLast
        Node26 ndInput = new Node26(input, null);
        if (isEmpty()) {
            // jika kosong, maka peran head dan tail harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node26 ndInput = new Node26(input, null);
        Node26 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        Node26 ndInput = new Node26(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya!" + " Kalau indeksnya -1 bagaimana???");
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
