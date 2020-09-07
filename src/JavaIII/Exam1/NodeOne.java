package JavaIII.Exam1;

public class NodeOne {
    String name;
    NodeOne next;

    public NodeOne(String name) {
        this.name = name;
    }

    public void  display(NodeOne node){
        if ( node == null)
            return;
        System.out.println(node.name);
        display(node.next);

    }


    public static void main(String[] args) {
        NodeOne node = new NodeOne("Ali");

        node.display(node);
    }
}

