package JavaIII.InClassExamples.BinaryTree;

public class NodeManager {
    Node root;
    public Node add(int x, Node tree) {
        Node node = new Node(x);
        if(tree == null){
            if(root == null) {
                root = node;
            }

        }else {
            if (x < tree.data) {
                tree.left = add(x, tree.left);
            } else
                tree.right = node;
        }
        System.out.println();
        return node;
    }

    public static void main(String[] args) {
        NodeManager newNode = new NodeManager();
        newNode.add(11, newNode.root);
        newNode.add(6, newNode.root);
        newNode.add(19, newNode.root);
        newNode.add(4, newNode.root);
        System.out.println();

    }
}
