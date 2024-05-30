package P14.Praktikum1;

public class BinaryTree26 {
    Node26 root;

    public BinaryTree26() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node26(data);
        } else {
            Node26 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node26(data);
                        break;
                    }
                } else {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node26(data);
                        break;
                    }
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node26 current = root;
        while (current != null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node26 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node26 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node26 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node26 getSuccessor(Node26 del) {
        Node26 successor = del.right;
        Node26 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        successor.left = null; //
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node(current) that will be deleted
        Node26 parent = root;
        Node26 current = root;
        boolean isLeftChild = false;
        while (current.data != data) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if (current == null) {
            System.out.println("Couldn't finda data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;

                    }
                }
            } else if (current.left == null) {// if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {// if ther is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {// if there is 2 childs
                Node26 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;

                    }
                    successor.left = current.left;
                }
            }
        }
    }

    // Tugas soal No 1
    void addRecursive(int data) {
        root = addDataRecursive(root, data);
    }

    public Node26 addDataRecursive(Node26 current, int data) {
        if (current == null) {
            return new Node26(data);
        }
        if (data < current.data) {
            current.left = addDataRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addDataRecursive(current.right, data);
        }
        return current;
    }

    // Tugas soal No 2
    int findMin() {// Method untuk menampilkan Nilai Minimum
        if (isEmpty()) {
            throw new RuntimeException("Tree is empty!");
        }
        Node26 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int findMax() {
        if (isEmpty()) { // Method untuk menampilkan Nilai Maximum
            throw new RuntimeException("Tree is empty!");
        }
        Node26 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // Tugas soal No 3
    void tampilDataLeaf() {
        System.out.print("Data Leaf     : ");
        tampilLeaf(root);
        System.out.println();
    }

    public void tampilLeaf(Node26 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            tampilLeaf(node.left);
            tampilLeaf(node.right);
        }
    }

    // Tugas soal No 4
    int jumlahLeaf() {
        return jumlahDataLeaf(root);
    }

    public int jumlahDataLeaf(Node26 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return jumlahDataLeaf(node.left) + jumlahDataLeaf(node.right);
    }

}
