package JavaIII.InClassExamples.BST;

public class NodeManager2 {
    Node root;
    public Node add(int x, Node tree) {
        if(tree == null) {
            return new Node(x);
        }else {
            if(x < tree.data)
                tree.left = add(x, tree.left);
            else
                tree.right = add(x, tree.right);
        }
        System.out.println();
        return tree;
    }

    public void display(Node tree) {
        if(tree == null) {
            return;
        }
        display(tree.left);
        display(tree.right);
        System.out.println(tree.data);
        return;
    }

    public static void main(String[] args) {
        NodeManager2 nodeManager2 = new NodeManager2();
        nodeManager2.root = nodeManager2.add(9,nodeManager2.root);
        nodeManager2.root = nodeManager2.add(4,nodeManager2.root);
        nodeManager2.root = nodeManager2.add(15,nodeManager2.root);
        nodeManager2.root = nodeManager2.add(2,nodeManager2.root);

        nodeManager2.display(nodeManager2.root);
    }
}
