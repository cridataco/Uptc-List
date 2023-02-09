package test;

import co.edu.uptc.test.listupc.model.UptcList;

public class Test {
    public static void main(String[] args) {
        UptcList uptcList = new UptcList();

        uptcList.add("hola");
        uptcList.add(2);
        uptcList.add("hollalaklsjkdfjajlsfa");
        uptcList.add("tamayo");
        for (int i = 0; i < uptcList.size(); i++) {
            System.out.println(uptcList.get(i));
        }
    }
}
