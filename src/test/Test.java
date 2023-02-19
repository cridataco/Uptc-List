package test;

import co.edu.uptc.model.dinamic.UptcList;
import co.edu.uptc.model.vector.VectorList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List list = new VectorList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Iterator aaa = list.iterator();
        aaa.next();
        aaa.next();

        System.out.println("iterator = " + aaa.next() + aaa.next());

        System.out.println("el tamaño de la lista es de:" +  list.size());
    }
}
