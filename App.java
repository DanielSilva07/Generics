package br.com.danielsilva.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Tiguam");
        print1(lista);

        List<Long> chassi = new ArrayList<>();
        chassi.add(33l);
        print1(chassi);


        GenericEntry <String> entry2 = new GenericEntry<>("Combustao" ,"Mazda");
        print(entry2);

        CarroCustom custom = new CarroCustom();
        custom.teste();
        custom.executar();
        System.out.println(custom.getNome());




    }

    public static  <T>  void print1(List<T> lista){
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static  <T> void print(GenericEntry<T> entry){
        System.out.println(entry);
    }



}
