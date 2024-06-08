package br.com.danielsilva.Generics;

public abstract class Carro {

   public void executar(){
      nome();
      ano();
   }

   protected abstract void type();

   private void nome(){
      System.out.println("Mazda");
   }
   private void ano(){
      System.out.println("2001");
   }









}
