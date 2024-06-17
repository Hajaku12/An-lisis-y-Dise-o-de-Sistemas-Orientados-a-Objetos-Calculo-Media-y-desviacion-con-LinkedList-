package edu.escuelaing.arsw.ASE.app.LinkedList;

public class CustomLinkedList {
    private NodeElement head;
    private int size;

    public CustomLinkedList() {
        size = 0;
    }

    public void add(double element) {
        if (head != null) {
            NodeElement current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new NodeElement(element);
            current.next.head = current;
        } else {
            head = new NodeElement(element);
            head.head = null;
        }
        size++;
    }

    public void remove() {
        if (head != null) {
            NodeElement current = head;
            while (current.next != null) {
                current = current.next;
            }
            current = null;
        }
        size--;
    }

    public NodeElement getElement(int index) {
        if (index < size) {
            int count = 0;
            NodeElement aux = head;

            while (aux != null) {
                if (count == index) {
                    return aux;
                }
                aux = aux.next;
                count++;
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}