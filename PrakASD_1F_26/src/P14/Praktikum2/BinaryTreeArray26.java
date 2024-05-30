package P14.Praktikum2;

public class BinaryTreeArray26 {
    int[] data;
    int idxLast;

    public BinaryTreeArray26() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // Tugas soal No 5
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }

    void add(int newData) {
        if (idxLast == data.length - 1) {
            System.out.println("Tree is full!");
            return;
        }

        if (idxLast == -1) {
            data[0] = newData;
            idxLast = 0;
        } else {
            idxLast++;
            data[idxLast] = newData;
            int current = idxLast;

            while (current > 0) {
                int parent = (current - 1) / 2;
                if (data[current] < data[parent]) {
                    int temp = data[current];
                    data[current] = data[parent];
                    data[parent] = temp;
                }
                current = parent;
            }
        }
    }
}
