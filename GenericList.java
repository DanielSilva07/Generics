package br.com.danielsilva.Generics;

import java.util.ArrayList;

public class GenericList <T>{
    public static void main(String[] args) {

        ArrayList<Object> entry3 = new ArrayList<>();
        entry3.add("Mazda");
        entry3.add(1997);
        entry3.add("Wankel engine");

        System.out.println(entry3);
    }



}
