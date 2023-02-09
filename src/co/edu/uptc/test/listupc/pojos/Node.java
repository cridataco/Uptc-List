package co.edu.uptc.test.listupc.pojos;

public class Node {
    private Object value;
    private Node next;

    public Node(Object value){
        this.value = value;
    }

    public Node(Object value, Node next){
        this.value = value;
        this.next = next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }

    public Object getValue(){
        return value;
    }
}
