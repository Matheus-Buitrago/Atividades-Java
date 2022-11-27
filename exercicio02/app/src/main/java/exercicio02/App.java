package exercicio02;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      
      int a;
      int b;
      int soma;
      int sub;
      int multi;
      int div;
      
      
      System.out.print("informe o valor de A: ");
        a = teclado.nextInt();

       System.out.print("informe o valor de A: ");
          b = teclado.nextInt();
          
         soma = a+b;
         sub = a-b;
         multi = a*b;
         div = a/b;

            System.out.println("a soma dos numeros é igual a: "+soma);
            System.out.println("a subtracao dos numeros é igual a: "+sub);
            System.out.println("a multiplicao dos numeros é igual a: "+multi);
            System.out.println("a divisao dos numeros é igual a: "+div);

      
    }
}

