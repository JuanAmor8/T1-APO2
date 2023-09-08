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

}
