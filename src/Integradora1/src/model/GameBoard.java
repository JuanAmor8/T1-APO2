package model;

public class GameBoard {

    private PipeNode head;

    private PipeNode tail;

    private int key;

    public void addNodeAtTail(String nickname){

        Player player = new Player(nickname);

        PipeNode pipeNode = new PipeNode(player);

        if(head==null){ // lista vacia
            head= pipeNode;
            key = 0;
        } else {
            tail.setNext(pipeNode);
            pipeNode.setPrevious(tail);
        }
        tail= pipeNode;
        key++;
    }

}
