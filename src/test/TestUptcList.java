package test;

import co.edu.uptc.model.dinamic.UptcList;

import java.util.ArrayList;
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

        System.out.println("el tamaño de la lista es de:" +  list.size());
    }
}
