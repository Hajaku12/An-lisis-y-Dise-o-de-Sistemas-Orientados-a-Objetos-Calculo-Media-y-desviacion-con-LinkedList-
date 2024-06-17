package edu.escuelaing.arsw.ASE.app.LinkedList;

public class NodeElement {
    double value;
    NodeElement next;
    NodeElement head;

    public NodeElement(double value) {
        this.value = value;
    }

    public void append(double value) {
        NodeElement current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new NodeElement(value);
    }

    public double getValue() {
        return value;
    }
}