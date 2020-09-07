package JavaIII.Project_2;

/*
        Load the data provided below as text file using binary tree algorithm.
        Validate the price differences of each row while inserting/loading the data that it shouldn't be greater than $3000.00 .
        Disregard data that has salary difference greater than $3000.00.
        Create two methods, remove, and search, of a binary search tree.
        The search method shall allow a search by salary. It should display the matched salary and the associated name. Otherwise return not found message.
        The delete method shall delete the object that matched the search criteria, search by name.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BinarySearchTree {

    Node root;

    public Node findMin(Node root) {

        int minValue = root.salary;
        String name = root.name;
        Node temp = new Node(name, minValue);
        while (root.left != null) {
            root = root.left;
        }
        return temp;
    }


    public Node remove(Node root, int salary) {
        if (searchBST(root, salary) != null) {

            if (root == null) {
                System.out.println();
                System.out.println("Error! BST is empty");
                return null; //Base Case

            }
            if (salary < root.salary) {
                root.left = remove(root.left, salary);
            } else if (salary > root.salary) {
                root.right = remove(root.right, salary);
            } else {

                if (root.left == null) {

                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                root.salary = findMin(root.right).salary;
                root.name = findMin(root.right).name;
                root.right = remove(root.right, root.salary);

            }

            System.out.println("Delete operation is successful!");
        } else {
            System.out.println("Error! Delete operation is failed!");
        }
        return root;
    }

    public Node searchBST(Node newNode, int salary) {    // Method to search BST
        Node temp = null;

        if (newNode == null) {
            System.out.println();
            System.out.println("The item searched: " + salary + "' cannot be found!");
            return temp ;

        }
        if (salary == newNode.salary) {
            System.out.println();
            System.out.print("The item searched is found; ");
            System.out.println(newNode.name + ", has a salary of: " + newNode.salary);
            return newNode;
        }
        if (salary < newNode.salary) {
            return searchBST(newNode.left, salary);
        }
        else {
            return searchBST(newNode.right, salary);
        }

    }

    public void printInOrder(Node root) { //Print the nodes in order
        if (root != null) {
            printInOrder(root.left);
            System.out.printf("%-10s %10s %n", root.name, root.salary);
            printInOrder(root.right);
        }
    }

    public void display(Node root) { //displays BST data using printInOrder() method
        String title1 = "Name";
        String title2 = "Salary";
        System.out.println();
        System.out.printf("%-10s %10s %n", title1, title2);
        System.out.println("---------------------");
        printInOrder(root);
    }

    private Node insert(Node newNode, String name, int salary) { // Recursive Method to generate BST

        if (newNode == null) {
            return new Node(name,salary);
        }

        if (salary < newNode.salary) {
            newNode.left = insert(newNode.left, name, salary); // If the new data is smaller it goes to left leaves
        } else if (salary > newNode.salary) {
            newNode.right = insert(newNode.right, name, salary); // If the new data is bigger it goes to right leaves
        }
        return newNode;
    }

    public void fileRead(String filename) { //Reads Salary.txt and calls the insert method
        int PrevSalary = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            line = reader.readLine() ;//skip the titles
            while ((line = reader.readLine()) != null) { //continue reading until the end of file

                String[] split= line.split(" ");     //data is split by space
                String name = split[0];                   //Employee  name
                int salary = Integer.valueOf(split[1]);  //Employee salary

                if(Math.abs(PrevSalary  - salary) > 3000) { // Disregard any salary differences that is greater than $3000
                    root = insert(root, name, salary);
                }

                else{
                    System.out.println("*******************************************************************************************************************");
                    System.out.println("Employee " + name + " with " + "Salary " + salary + " does not meet the requirements to be inserted in the BST");

                }
                PrevSalary = salary;
            }
            reader.close();
        }catch (Exception e) {
            System.err.format("Exception occurred while reading '%s'.", filename);
            e.printStackTrace();
        }
    }

    public static void main (String[] args) throws IOException {

        String fileName = "C:\\Users\\gdemirturk\\OneDrive\\Shared\\Coding\\git\\javabyLiang\\src\\JavaIII\\Project_2\\Salary.txt";
        BinarySearchTree BST = new BinarySearchTree();

        BST.fileRead(fileName);

        BST.display(BST.root); // Prints the BST

        // Testing the methods
        BST.searchBST(BST.root, 4800);
        BST.searchBST(BST.root, 22300);
        BST.remove(BST.root, 22000);
        BST.remove(BST.root, 44000);      // Does not work properly, Prints the next row for some reason
        BST.display(BST.root);

    }
}