package model;

public class Node {

    private double number;

    private Node left;

    private Node right;

    public Node(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setList(double number) {
        this.number = number;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
