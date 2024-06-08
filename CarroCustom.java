package br.com.danielsilva.Generics;

public class CarroCustom extends Carro {
    protected String nome = "Toyota";

    public  void teste(){
        type();
    }

    public String getNome() {
        return nome;
    }

    public void type() {
        System.out.println("Combustao");


    }
}
