package JavaIII.InClassExamples.BST;

public class BinaryTree {

    Node root;

    public void add(int value) {
        Node NewNode = new Node(value);
        if (root == null) {
            root = NewNode;
        } else {
            searchAdd(NewNode, root);

        }

    }

    public void searchAdd(Node node, Node headNode) {
        if (node.data < headNode.data) {
            if (headNode.left == null) {
                headNode.left = node;
            }
            searchAdd(node, headNode.left);
        } else {
            if (headNode.right == null) {
                headNode.right = node;
            }
            searchAdd(node, headNode.right);
        }

    }
//    private void search(Node node, int key) {
//
//
//        if (node == null || node.key == key) {
//            return node;
//        } else if (node.key > key) {
//            return search(node.left, key);
//        } else return search(node.right, key);
//
//    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5);
        binaryTree.add(7);

    }
}


