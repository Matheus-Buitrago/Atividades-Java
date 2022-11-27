package exercicio10;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      float valor,prestacao;
      
      System.out.println("informe o valor do produto: ");
      valor = teclado.nextFloat();
      
      prestacao = valor/5;
      
      System.out.println("o valor de cada prestacao fica: "+prestacao);
      
      
      
      
      
       
    }
}
