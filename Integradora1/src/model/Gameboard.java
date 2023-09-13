package model;

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

    public PipeNode findNodeFromHead (int row, int column){
        return findNode(this.head,row,column);
    }


    private PipeNode findNode(PipeNode pointer, int row, int column){
        if(pointer!=null && pointer.getPipeline().getRow()!=row && pointer.getPipeline().getColumn()!=column){ // hace la recursion cuando no encuentra al nodo
            return findNode(pointer.getNext(),row,column);
        }
        return pointer; // null cuando no lo encuentra
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
