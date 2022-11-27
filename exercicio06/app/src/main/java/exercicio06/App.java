package exercicio06;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
       
       int a;
       int b;
       int c;
       
       
       System.out.print("informe o valor de A: ");
         a = teclado.nextInt();
         
       System.out.print("informe o valor de B: ");
        b = teclado.nextInt();
       
       
       c = a;
       a = b;
       b = c;
       
       
       System.out.print("a = "+a+" e b ="+b);
       
    }
}
