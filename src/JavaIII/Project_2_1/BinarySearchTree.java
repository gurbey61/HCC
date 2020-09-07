package JavaIII.Project_2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Java program to demonstrate delete operation in binary search tree
class BinarySearchTree
{
    /* Class containing left and right child of current node and key value*/
    class Node
    {
        int salary;
        String name;
        Node left, right;

        public Node(int item, String name)
        {
            this.salary = item;
            this.name = name;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree()
    {
        root = null;
    }

    // This method mainly calls deleteRec()
    void deleteSalary(String name)
    {
        root = deleteRec(root, name);
    }

    /* A recursive function to insert a new key in BST */
    Node deleteRec(Node root, String name)
    {
        /* Base Case: If the tree is empty */
        if (root == null) return root;

        /* Otherwise, recur down the tree */
        if (name.compareTo(root.name)< 0)
            root.left = deleteRec(root.left, name);
        else if (name.compareTo(root.name) > 0)
            root.right = deleteRec(root.right, name);

            // if salary is same as root's salary, then This is the node
            // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.name = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.name);
        }

        return root;
    }

    String minValue(Node root)
    {
        String minv = root.name;
        while (root.left != null)
        {
            minv = root.left.name;
            root = root.left;
        }
        return minv;
    }

    // This method mainly calls insertRec()
    void insert(int salary, String name)
    {
        root = insertRec(root, salary, name);
    }

    /* A recursive function to insert a new salary in BST */
    Node insertRec(Node root, int salary, String name)
    {

        /* If the tree is empty, return a new node */
        if (root == null)
        {
            root = new Node(salary, name);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (name.compareTo(root.name) < 0)
            root.left = insertRec(root.left, salary, name);
        else if (name.compareTo(root.name) > 0)
            root.right = insertRec(root.right, salary, name);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.println(root.name + " " + root.salary);
            inorderRec(root.right);
        }
    }

    // Driver Program to test above functions
    public static void main(String[] args) throws FileNotFoundException
    {
        BinarySearchTree tree = new BinarySearchTree();

        Scanner scan = new Scanner(new File("C:\\Users\\gdemirturk\\OneDrive\\Shared\\Coding\\git\\HCC\\src\\JavaIII\\Project_2\\Salary"));
        scan.nextLine(); // Leaving the first row
        while(scan.hasNext())
        {
            String line = scan.nextLine();
            String split[] = line.split(" ");
            int salary = Integer.parseInt(split[1]);
            if(salary > 3000)
                tree.insert(salary, split[0]);
        }
        tree.inorder();
        System.out.println("**Deleting Node**");
        tree.deleteSalary("Bob");
        tree.inorder();
    }
}
