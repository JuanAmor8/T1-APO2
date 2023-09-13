package model;

import java.util.Random;

public class Gameboard {

    private PipeNode head;

    private PipeNode tail;

    public void addNodeAtTail(int row, int column){

         Pipeline pipeline= new Pipeline(row,column);

        PipeNode pipeNode = new PipeNode(pipeline);

        if(head==null){ // lista vacia
            head= pipeNode;
        } else {
            tail.setNext(pipeNode);
            pipeNode.setPrevious(tail);
        }
        tail= pipeNode;
    }

    public void addDYF(){

        Random rand = new Random();
        int rowD = rand.nextInt(8);
        int columnD = rand.nextInt(8);

        int rowF = rand.nextInt(8);
        int columnF = rand.nextInt(8);

        while(rowD == rowF && columnF == columnD){

            rowF = rand.nextInt(8);
            columnF = rand.nextInt(8);

        }

        PipeNode pipeF = findNodeFromHead(rowF,columnF);
        pipeF.getPipeline().setPipelineType(4);

        PipeNode pipeD = findNodeFromHead(rowD,columnD);
        pipeD.getPipeline().setPipelineType(5);

    }


    public PipeNode findNodeFromHead (int row, int column){
        return findNode(this.head,row,column);
    }

    public PipeNode findNode(PipeNode current, int column, int row) {

        if (current == null) {
            return null;
        } else if (column == current.getPipeline().getColumn() && row == current.getPipeline().getRow()) {
            return current;
        } else {
            return findNode(current.getNext(), column, row);
        }

    }

    public String print(){
        return print(head,0);
    }

    private String print(PipeNode pointer,int counter){

        String msg = "";

        if (counter%8 == 0 && counter != 0){
            msg+="\n";
            counter = 0;
        }

        if (head == null){
            msg += "There are no pipes";
        }

        else if(pointer.getNext() == null){

            msg += "" + pointer.getPipeline().getPipelineType();

        }
        else{

            msg += pointer.getPipeline().getPipelineType() + " " + print(pointer.getNext(),counter+1);

        }
        return msg;
    }

    public String print1(){
        return print1(head,0);
    }

    private String print1(PipeNode pointer,int counter){

        String msg = "";

        if (counter%8 == 0 && counter != 0){
            msg+="\n";
            counter = 0;
        }

        if (head == null){
            msg += "There are no pipes";
        }

        else if(pointer.getNext() == null){

            msg += "" + pointer.getPipeline().getRow() + ","+ pointer.getPipeline().getColumn();

        }
        else{

            msg += pointer.getPipeline().getRow() + ","+ pointer.getPipeline().getColumn() + " " + print1(pointer.getNext(),counter+1);

        }
        return msg;
    }


}
