package model;

public class Pipeline {

    private EnumPipeline pipelineType;

    private int column, row;

public Pipeline(int row, int column) {

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

    public String getPipelineType() {

        String msg = "";

         switch (pipelineType){
             case HORIZONTAL:

                 msg += "=";

                 break;

             case VERTICAL:

                 msg += "||";

                 break;

             case CIRCULAR:

                 msg += "o";

                 break;

             case F:

                 msg += "F";

                 break;

             case D:

                 msg += "D";

                 break;

             case X:

                 msg += "X";

                 break;

         }

         return msg;

    }

    public EnumPipeline getEnumPipelineType(){
        return this.pipelineType;
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

    public String getPosition(){
        return "" + row + column;
    }

}
