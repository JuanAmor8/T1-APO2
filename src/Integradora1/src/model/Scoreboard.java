package model;

public class Scoreboard {

    private PipeNode root;

    public Scoreboard() {
        this.root = null;
    }

    public void addNode(double number){
        addNode(root, number);
    }



    private void addNode(PipeNode pointer, double number){

        PipeNode pipeNode = new PipeNode(number);
        if(pointer==null){
            root= pipeNode;
        } else if (pipeNode.getNumber() < (pointer.getNumber())) { // el valor del nuevo nodo es menor que el valor del puntero actual?
            if(pointer.getLeft()==null){
                pointer.setLeft(pipeNode);
            }else{
                addNode(pointer.getLeft(), number);
            }
        } else { // el valor del nuevo nodo es igual o mayor que el puntero actual
            if (pointer.getRight()==null){
                pointer.setRight(pipeNode);
            } else {
                addNode(pointer.getRight(), number);
            }
        }
    }

    public String print(){
        return print(root);
    }

    private String print(PipeNode pointer){
        if (pointer == null){
            return "";
        }
        else {
            return print(pointer.getLeft()) +" "+pointer.getNumber()+" "+print(pointer.getRight());
        }
    }

    private double getMin(PipeNode pointer){
        if(pointer.getLeft()==null){
            return pointer.getNumber();
        }
        else {
            return getMin(pointer.getLeft());
        }
    }

    private double getMax(PipeNode pointer){
        if(pointer.getRight()==null){
            return pointer.getNumber();
        }
        else {
            return getMin(pointer.getLeft());
        }
    }

}
