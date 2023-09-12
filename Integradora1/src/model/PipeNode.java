package model;

public class PipeNode {

    private Pipeline pipeline;

    private PipeNode next;

    private PipeNode previous;

    public PipeNode(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    public Pipeline getPipeline() {
        return pipeline;
    }

    public void setPipelineType(Pipeline pipeline) {
        this.pipeline = pipeline;
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
