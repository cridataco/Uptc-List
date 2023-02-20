package test;

import co.edu.uptc.model.dinamic.UptcList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestUptcList {
    public static void main(String[] args) {
        List list = new UptcList();

        String a = "a";

        list.add(a);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(a);
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");

        System.out.println("last index of a = " + list.lastIndexOf(a));
        System.out.println("el tamaño de la lista es de:" +  list.size() + "\n");
        
        list.addAll(addCollection());
      //  list.addAll(2, addCollection());
        mostrarTodaLaLista(list);
    }
    
    public static void mostrarTodaLaLista(List uptcList) {
		for (int i = 0; i < uptcList.size(); i++) {
			System.out.println("Posicion " + i + " -- " + uptcList.get(i));
		}
		System.out.println("\nElementos: " + uptcList.size() + "\n");
	}
    
    public static Collection addCollection() {
    	List<Object> collections = new ArrayList<Object>();
    	collections.add("Desayuna con huevo");
    	collections.add("Ciervo");
    	collections.add("Cigarro");
    	collections.add("Deer Dance");
		return collections;
	}
}