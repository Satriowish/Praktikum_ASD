package P15.Praktikum;

public class Node26 {
    int data;
    Node26 prev, next;
    int jarak;

    Node26(Node26 prev, int data, int jarak, Node26 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
