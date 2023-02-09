package co.edu.uptc.test.listupc.model;

import co.edu.uptc.test.listupc.pojos.Node;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UptcList implements List {
    private Node head;
    private int size;

    public UptcList() {
        head = null;
        size = 0;
    }

    public boolean isHeadNull(){
        return (head == null);
    }

    @Override
    public void add(int index, Object element) {
            if(isHeadNull()){
                head = new Node(element);
            }else{
              getNode(index).setNext(new Node(element));
            }
              size ++;
    }

    @Override
    public Object get(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }

    public Node getNode(int index){
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object element) {
        if(isHeadNull()){
            head = new Node(element);
        }else{
            getNode(size-1).setNext(new Node(element));
        }
        size ++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
