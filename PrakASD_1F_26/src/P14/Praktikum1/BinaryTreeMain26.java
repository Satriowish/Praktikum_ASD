package P14.Praktikum1;

public class BinaryTreeMain26 {
    public static void main(String[] args) {
        BinaryTree26 bt = new BinaryTree26();
        // bt.add(6);
        // bt.add(4);
        // bt.add(8);
        // bt.add(3);
        // bt.add(5);
        // bt.add(7);
        // bt.add(9);
        // bt.add(10);
        // bt.add(15);
        // ****************************************************
        // Tugas soal No 1
        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);
        System.out.print("PreOrder Traversal  : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder Traversal   : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal  : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        // Tugas Soal No 2
        System.out.println("Nilai Minimum : " + bt.findMin());
        System.out.println("Nilai Maximum : " + bt.findMax());

        // Tugas Soal No 3
        bt.tampilDataLeaf();

        // Tugas Soal No 4
        System.out.println("Jumlah Leaf   : " + bt.jumlahLeaf());
    }
}
