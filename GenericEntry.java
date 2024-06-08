package br.com.danielsilva.Generics;

import java.util.List;

public class GenericEntry<T> {

    private T modelo;
    private T type;


    public GenericEntry(T type , T modelo){
        this.type = type;
        this.modelo = modelo;

    }

    public T getModelo() {
        return modelo;
    }

    public T getType() {
        return type;
    }

    @Override
    public String toString() {
        return "GenericEntry{" +
                "modelo=" + modelo +
                ", type=" + type +
                '}';
    }


}
