package P14.Praktikum2;

public class BinaryTreeArrayMain26 {
    public static void main(String[] args) {
        BinaryTreeArray26 bta = new BinaryTreeArray26();
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);

        System.out.print("\nInOrder Traversal   : ");
        bta.traverseInOrder(0);
        System.out.print("\nPreOrder Traversal  : ");
        bta.traversePreOrder(0);
        System.out.print("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");
        bta.add(10);
        System.out.print("\nContoh Setelah Penambahan Data 10 ");
        System.out.print("\nInOrder Traversal   : ");
        bta.traverseInOrder(0);
        System.out.print("\nPreOrder Traversal  : ");
        bta.traversePreOrder(0);
        System.out.print("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");

    }
}
