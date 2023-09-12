package model;

public class GameBoard {

    private PipeNode head;

    private PipeNode tail;

    private int key;


    public void createBoard() {

    }



    public void addNodeAtTail(int column, int row,int pipe){

         PipelineType pipeline= new PipelineType(column,row,pipe);

        PipeNode pipeNode = new PipeNode(pipeline);

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

    public PipeNode findNodeFromHead (int row, int column){
        return findNode(this.head,row,column);
    }


    private PipeNode findNode(PipeNode pointer, int row, int column){
        if(pointer!=null && pointer.getPipelineType().getRow()!=row && pointer.getPipelineType().getColumn()!=column){ // hace la recursion cuando no encuentra al nodo
            return findNode(pointer.getNext(),row,column);
        }
        return pointer; // null cuando no lo encuentra
    }




}
