package model;

public class PipelineType {

    private EnumPipeline pipelineType;

    private int column, row;

    private GameBoard next,prev;

    public PipelineType(int column, int row, int pipelineType) {

        this.column = column;

        this.row = row;

        this.pipelineType = EnumPipeline.X;

    }

    public void setPipelineType(int pipelineType){

        switch (pipelineType){

            case 1:

                this.pipelineType = EnumPipeline.HORIZONTAL;

                break;

            case 2:

                this.pipelineType = EnumPipeline.VERTICAL;

                break;


            case 3:

                this.pipelineType = EnumPipeline.CIRCULAR;

                break;

            case 4:

                this.pipelineType = EnumPipeline.F;

                break;

            case 5:

                this.pipelineType = EnumPipeline.D;

                break;
        }

    }

    //Getters and Setters

    public EnumPipeline getPipelineType() {
        return pipelineType;
    }

    public void setPipelineType(EnumPipeline pipelineType) {
        this.pipelineType = pipelineType;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public GameBoard getNext() {
        return next;
    }

    public void setNext(GameBoard next) {
        this.next = next;
    }

    public GameBoard getPrev() {
        return prev;
    }

    public void setPrev(GameBoard prev) {
        this.prev = prev;
    }
}
