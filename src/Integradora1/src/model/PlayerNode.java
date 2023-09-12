package model;

public class PlayerNode {

    private double number;

    private PlayerNode left;

    private PlayerNode right;

    public PlayerNode(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setList(double number) {
        this.number = number;
    }

    public PlayerNode getLeft() {
        return left;
    }

    public void setLeft(PlayerNode left) {
        this.left = left;
    }

    public PlayerNode getRight() {
        return right;
    }

    public void setRight(PlayerNode right) {
        this.right = right;
    }


}
