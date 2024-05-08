package P10.Tugas;

public class Queue26 {
    Pembeli26[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue26(int n) {
        max = n;
        antrian = new Pembeli26[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp + " ");
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("==================================");
            System.out.println("| Nama          | No HP       |");
            System.out.println("==================================");
            System.out.printf("| %-14s| %-12s|%n", antrian[front].nama, antrian[front].noHp);
            System.out.println("==================================");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        System.out.println("==================================");
        System.out.println("| Nama          | No HP       |");
        System.out.println("==================================");
        System.out.printf("| %-14s| %-12s|%n", antrian[rear].nama, antrian[rear].noHp);
        System.out.println("==================================");
    }

    public void peekPosition(String nama) {
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Nama : " + nama + " berada diantrian ke-" + (i + 1));
                    return;
                }
            }
            System.out.println("Pembeli dengan nama " + nama + " tidak ditemukan dalam antrian.");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void daftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("==================================");
            System.out.println("| Nama          | No HP         |");
            System.out.println("==================================");
            for (int i = front; i != rear; i = (i + 1) % max) {
                System.out.printf("| %-14s| %-14s|%n", antrian[i].nama, antrian[i].noHp);
            }
            System.out.printf("| %-14s| %-14s|%n", antrian[rear].nama, antrian[rear].noHp);
            System.out.println("==================================");
        }
    }

    public void Enqueue(Pembeli26 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli26 Dequeue() {
        Pembeli26 dt = new Pembeli26(null, front);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

}
