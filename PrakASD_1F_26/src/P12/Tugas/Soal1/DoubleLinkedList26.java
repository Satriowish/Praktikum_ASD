package P12.Tugas.Soal1;

public class DoubleLinkedList26 {
    Node26 head;
    int size;

    public DoubleLinkedList26() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(PasienVaksin26 item) {
        Node26 newNode = new Node26(null, item, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node26 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node26 tmp = head;
            System.out.println("=====================================");
            System.out.println("| Nomor       |       Nama          |");
            System.out.println("=====================================");
            while (tmp != null) {
                String nomor = String.format("%-11s", tmp.data.NomorAntri);
                String nama = String.format("%-19s", tmp.data.name);
                System.out.println("| " + nomor + " | " + nama + " |");
                tmp = tmp.next;
            }
            System.out.println("=====================================");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public PasienVaksin26 getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
}
