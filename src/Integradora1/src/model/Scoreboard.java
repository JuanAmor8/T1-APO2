package model;

public class Scoreboard {

    private Node root;

    public Scoreboard() {
        this.root = null;
    }

    public void addNode(double number){
        addNode(root, number);
    }



    private void addNode(Node pointer, double number){

        Node node = new Node(number);
        if(pointer==null){
            root=node;
        } else if (node.getNumber() < (pointer.getNumber())) { // el valor del nuevo nodo es menor que el valor del puntero actual?
            if(pointer.getLeft()==null){
                pointer.setLeft(node);
            }else{
                addNode(pointer.getLeft(), number);
            }
        } else { // el valor del nuevo nodo es igual o mayor que el puntero actual
            if (pointer.getRight()==null){
                pointer.setRight(node);
            } else {
                addNode(pointer.getRight(), number);
            }
        }
    }

    public String print(){
        return print(root);
    }

    private String print(Node pointer){
        if (pointer == null){
            return "";
        }
        else {
            return print(pointer.getLeft()) +" "+pointer.getNumber()+" "+print(pointer.getRight());
        }
    }

    private double getMin(Node pointer){
        if(pointer.getLeft()==null){
            return pointer.getNumber();
        }
        else {
            return getMin(pointer.getLeft());
        }
    }

    private double getMax(Node pointer){
        if(pointer.getRight()==null){
            return pointer.getNumber();
        }
        else {
            return getMin(pointer.getLeft());
        }
    }

}
