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

    public boolean addPipe(int row, int column, int pipeType){

        PipeNode pointer = findNodeFromHead(row,column);

        if (pipeType>0 && pipeType<4){
            pointer.getPipeline().setPipelineType(pipeType);
            return true;
        }

        return false;

    }

    public PipeNode findNodeFromHead (int row, int column){
        return findNode(this.head,row,column);
    }

    private PipeNode findNode(PipeNode current, int column, int row) {

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

            msg += pointer.getPipeline().getPipelineType() + "  " + print(pointer.getNext(),counter+1);

        }
        return msg;
    }

    public String printRowColumn(){
        return printRowColumn(head,0);
    }

    private String printRowColumn(PipeNode pointer,int counter){

        String msg = "";

        if (counter%8 == 0 && counter != 0){
            msg+="\n";
            counter = 0;
        }

        if (head == null){
            msg += "There are no pipes";
        }

        else if(pointer.getNext() == null){

            if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.F || pointer.getPipeline().getEnumPipelineType() == EnumPipeline.D ){

                msg += "   "+pointer.getPipeline().getPipelineType()+" |";

            }
            else if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.HORIZONTAL){

                msg += "   "+pointer.getPipeline().getPipelineType()+" |";

            }
            else if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.VERTICAL){

                msg += "   "+pointer.getPipeline().getPipelineType()+" |";

            }
            else if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.CIRCULAR){

                msg += "   "+pointer.getPipeline().getPipelineType()+" |";

            }
            else {

                msg += "" + pointer.getPipeline().getRow() + ","+ pointer.getPipeline().getColumn()+" |";

            }



        }
        else{

            if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.F || pointer.getPipeline().getEnumPipelineType() == EnumPipeline.D ){

                msg += " "+pointer.getPipeline().getPipelineType() + "  | " + printRowColumn(pointer.getNext(),counter+1);

            }
            else if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.HORIZONTAL){

                msg += "   "+pointer.getPipeline().getPipelineType()+" |";

            }
            else if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.VERTICAL){

                msg += "   "+pointer.getPipeline().getPipelineType()+" |";

            }
            else if (pointer.getPipeline().getEnumPipelineType() == EnumPipeline.CIRCULAR){

                msg += "   "+pointer.getPipeline().getPipelineType()+" |";

            }
            else {

                msg += pointer.getPipeline().getRow() + ","+ pointer.getPipeline().getColumn() + " | " + printRowColumn(pointer.getNext(),counter+1);

            }



        }
        return msg;
    }

    public boolean simulate(){
        return simulate(searchFountain());
    }

    private boolean simulate(PipeNode pointer){
        if(pointer == null) return false;
        int rowPos = pointer.getPipeline().getRow();
        int columnPos = pointer.getPipeline().getColumn();
        //vertical
        if (!findNodeFromHead(rowPos+1, columnPos).getPipeline().getEnumPipelineType().equals(EnumPipeline.X) ){
            EnumPipeline type = findNodeFromHead(rowPos+1, columnPos).getPipeline().getEnumPipelineType();
            if(type.equals(EnumPipeline.VERTICAL)){
                return simulate(findNodeFromHead(rowPos+1,columnPos));
            }
        }

        if (!findNodeFromHead(rowPos-1, columnPos).getPipeline().getEnumPipelineType().equals(EnumPipeline.X) ){
            EnumPipeline type = findNodeFromHead(rowPos-1, columnPos).getPipeline().getEnumPipelineType();
            if(type.equals(EnumPipeline.VERTICAL)){
                return simulate(findNodeFromHead(rowPos-1,columnPos));
            }
        }
        //horizontal
        if (!findNodeFromHead(rowPos, columnPos+1).getPipeline().getEnumPipelineType().equals(EnumPipeline.X) ){
            EnumPipeline type = findNodeFromHead(rowPos, columnPos+1).getPipeline().getEnumPipelineType();
            if(type.equals(EnumPipeline.HORIZONTAL)){
                return simulate(findNodeFromHead(rowPos,columnPos+1));
            }
        }

        if (!findNodeFromHead(rowPos, columnPos-1).getPipeline().getEnumPipelineType().equals(EnumPipeline.X) ){
            EnumPipeline type = findNodeFromHead(rowPos, columnPos-1).getPipeline().getEnumPipelineType();
            if(type.equals(EnumPipeline.HORIZONTAL)){
                return simulate(findNodeFromHead(rowPos,columnPos-1));
            }
        }
        return false;
    }

    public PipeNode searchFountain(){
        return searchFountain(head);

    }


    private PipeNode searchFountain(PipeNode currentNode){
        if (currentNode == null) return  null;
        if(currentNode.getPipeline().getEnumPipelineType().equals(EnumPipeline.F)){
            return currentNode;
        }
        return searchFountain(currentNode.getNext());
    }


}
