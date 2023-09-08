package model;

public class PipeNode {

    private double number;

    private PipeNode left;

    private PipeNode right;

    public PipeNode(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setList(double number) {
        this.number = number;
    }

    public PipeNode getLeft() {
        return left;
    }

    public void setLeft(PipeNode left) {
        this.left = left;
    }

    public PipeNode getRight() {
        return right;
    }

    public void setRight(PipeNode right) {
        this.right = right;
    }

}
