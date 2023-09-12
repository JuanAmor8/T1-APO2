package model;

public class Scoreboard {

    private PlayerNode root;

    public Scoreboard() {
        this.root = null;
    }

    public void addNode(double number){
        addNode(root);
    }

    private void addNode(PlayerNode pointer, String nickname){

        Player player = new Player(nickname);

        PlayerNode playerNode = new PlayerNode(player);
        if(pointer==null){
            root= playerNode;
        } else if (playerNode.getScore() < (pointer.getScore())) { // el valor del nuevo nodo es menor que el valor del puntero actual?
            if(pointer.getLeft()==null){
                pointer.setLeft(playerNode);
            }else{
                addNode(pointer.getLeft(), nickname);
            }
        } else { // el valor del nuevo nodo es igual o mayor que el puntero actual
            if (pointer.getRight()==null){
                pointer.setRight(playerNode);
            } else {
                addNode(pointer.getRight(), nickname);
            }
        }
    }

    public String print(){
        return print(root);
    }

    private String print(PlayerNode pointer){
        if (pointer == null){
            return "";
        }
        else {
            return print(pointer.getLeft()) +" "+pointer.getScore()+" "+print(pointer.getRight());
        }
    }

    private double getMin(PlayerNode pointer){
        if(pointer.getLeft()==null){
            return pointer.getScore();
        }
        else {
            return getMin(pointer.getLeft());
        }
    }

    private double getMax(PlayerNode pointer){
        if(pointer.getRight()==null){
            return pointer.getScore();
        }
        else {
            return getMin(pointer.getLeft());
        }
    }

}
