package model;

public class PipeNode {

    private Pipeline pipeline;

    private PipeNode next;

    private Boolean visited;

    private PipeNode previous;

    public PipeNode(Pipeline pipeline) {
        this.pipeline = pipeline;
        this.visited = false;
    }

    public Pipeline getPipeline() {
        return pipeline;
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

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }
}
