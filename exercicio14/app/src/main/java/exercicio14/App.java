package exercicio14;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      int a;
      int b;
      
      System.out.print("informe o primeiro valor: ");
      a = teclado.nextInt();
      
      System.out.print("informe o primeiro valor: ");
      b = teclado.nextInt();
      
      
      if(a > b){
      System.out.print(a+" � maior que "+b);
      
      }else{
      System.out.print(b+" � maior que "+a);
      
      }
      
      
      
      
    }
}
