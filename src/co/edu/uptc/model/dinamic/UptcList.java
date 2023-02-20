package co.edu.uptc.model.dinamic;

import co.edu.uptc.pojos.Node;
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

	public boolean isHeadNull() {
		return (head == null);
	}

	@Override
	public void add(int index, Object element) {
		Node node = new Node(element);

		if (index == 0) {
			node.setNext(head);
			head = node;
		} else {
			Node tmp = getNode(index - 1);
			node.setNext(tmp.getNext());
			tmp.setNext(node);
		}
	}

	@Override
	public Object get(int index) {
		Node tmp = head;
		for (int i = 0; i < index; i++) {
			tmp = tmp.getNext();
		}
		return tmp.getValue();
	}

	public Node getNode(int index) {
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

	/*
	 * public int size() { int size = 0; Node tmp = head; while(tmp != null) {
	 * size++; tmp = tmp.getNext(); } return size; }
	 */

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public boolean contains(Object o) {
		return (indexOf(o) != -1);
	}

	// A un por ver
	@Override
	public Object[] toArray() {
		return new Object[0];
	}

	@Override
	public boolean add(Object element) {
		if(element == Node.class) {
			getNode(size - 1).setNext((Node)element);
		}
		if (isHeadNull()) {
			head = new Node(element);
		} else {
			getNode(size - 1).setNext(new Node(element));
		}
		size++;
		return false;
	}

	@Override
	public boolean remove(Object o) {
		if (indexOf(o) != -1) {
			remove(indexOf(o));
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		head = null;
	}

	@Override
	public Object set(int index, Object element) {
		if (index == 0) {
			head.setValue(element);
		} else {
			Node tmp = getNode(index - 1);
			tmp.getNext().setValue(element);
		}
		return null;
	}

	@Override
	public Object remove(int index) {
		Node aux = head;
		if (index == 0) {
			head = head.getNext();
		} else {
			Node tmp = getNode(index - 1);
			aux = tmp.getNext();
			if (aux.getNext() != null) {
				tmp.setNext(aux.getNext());
			} else {
				tmp.setNext(null);
			}
		}
		size--;
		return aux.getValue();
	}

	@Override
	public int indexOf(Object o) {
		int index = -1;
		Node tmp = head;
		for (int i = 0; i < size; i++) {
			if (tmp.getValue() == o) {
				index = i;
				break;
			}
			tmp = tmp.getNext();
		}
		return index;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		List list = new UptcList();
		for (int i = fromIndex; i < toIndex; i++) {
			list.add(get(i));
		}
		return list;
	}

	@Override
	public Object[] toArray(Object[] a) {
		return new Object[0];
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = -1;
		Node tmp = head;
		for (int i = 0; i < size; i++) {
			if (tmp.getValue() == o) {
				index = i;
			}
			tmp = tmp.getNext();
		}
		return index;
	}

	@Override
	public Iterator iterator() {

		return null;
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
	public boolean addAll(Collection c) {
		Object[] temp = c.toArray();
		for (int i = 0; i < temp.length; i++) {
			add(temp[i]);
		}
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		Object[] temp = c.toArray();
		Node aux = head;
		Node tempNode;
		if (index == 0) {
			tempNode = aux;
			size = 0;
			clear();
			addAll(c);
			add(tempNode);
		} else {
			aux = getNode(index);
			tempNode = aux.getNext();
			aux.setNext(null);
			size = index;
			addAll(c);
			add(tempNode);
		}
		return false;
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
}
