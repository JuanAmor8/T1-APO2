package model;

public class PipeNode {

    private PipelineType pipelineType;

    private PipeNode next;

    private PipeNode previous;

    public PipeNode(PipelineType pipeline) {
        this.pipelineType = pipeline;
    }

    public PipelineType getPipelineType() {
        return pipelineType;
    }

    public void setPipelineType(PipelineType pipelineType) {
        this.pipelineType = pipelineType;
    }

    public PipeNode getNext() {
        return next;
    }

    public void setNext(PipeNode next) {
        this.next = next;
    }

    public PipeNode getPrevious() {
        return previous;
    }

    public void setPrevious(PipeNode previous) {
        this.previous = previous;
    }

}
