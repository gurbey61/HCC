package JavaIII.InClassExamples.BST;

public class NodeManager {

    Node root;

    public Node insert(Node node, int value) {
        if (node == null) {
            Node n = new Node(value);
            return n;
        } else if (value < node.data) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;

    }

    public void display(Node n) {
        if (n == null) {
            return;
        }
        display(n.left);
        display(n.right);
        System.out.println(n.data);
        return;

    }

    public static void main(String[] args) {
        NodeManager nm = new NodeManager();
        Node root = null;
        root = nm.insert(root, 8);
        root = nm.insert(root, 3);
        root = nm.insert(root, 10);
        root = nm.insert(root, 1);
        root = nm.insert(root, 14);
        root = nm.insert(root, 6);
        root = nm.insert(root, 13);
        nm.display(root);

    }

}