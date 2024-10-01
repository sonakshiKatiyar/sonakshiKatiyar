package DataStructures.BinaryTree;

import java.util.Scanner;

public class BasicBinaryTree {
    public BasicBinaryTree() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private static Node root;

    public static void createBasicBinaryTree(Scanner scanner) {
        System.out.println("Enter the root node:");
        root = new Node(scanner.nextInt());
        populateNodeRecursively(root, scanner);
        displayBinaryTree();

    }

    private static void populateNodeRecursively(Node node, Scanner scanner) {
        System.out.println("Do you want to add left node of " + node.value);
        if (scanner.next().equalsIgnoreCase("y")) {
            System.out.println("Enter Left Node Value: ");
            node.left = new Node(scanner.nextInt());
            populateNodeRecursively(node.left, scanner);
        }

        System.out.println("Do you want to add right node of " + node.value);
        if (scanner.next().equalsIgnoreCase("y")) {
            System.out.println("Enter Right Node Value : ");
            node.right = new Node(scanner.nextInt());
            populateNodeRecursively(node.right, scanner);
        }
    }

    public static void displayBinaryTree() {
        display(root, 0);
    }

    private static void display(Node node, int level) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1);
        if (level == 0) {
            System.out.println(node.value);
        }else {
            for (int i=0;i<level;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----------->"+node.value);
        }
        display(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        createBasicBinaryTree(scanner);
    }
}
