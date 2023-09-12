package model;

public class PlayerNode {

    private Player player;

    private PlayerNode left;

    private PlayerNode right;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public double getScore() {
        return player.getScore();
    }

    public void setPlayerScore(double score) {
        player.setScore(score);
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
