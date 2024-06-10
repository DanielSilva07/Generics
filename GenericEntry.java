package br.com.danielsilva.Generics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GenericEntry<T> {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();
        carros.add(new Mazda());
        carros.add(new Toyota());
        carros.add(new Byd());

        System.out.println(carros);
        System.out.println(carros.isEmpty());
        System.out.println(carros.size());

//        Mazda mazda = new Mazda();
//        Byd byd = new Byd();
//
//        byd.type();
//        mazda.type();

















    }






}
