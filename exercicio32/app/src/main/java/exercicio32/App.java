package exercicio32;

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
      
      System.out.print("informe o valor de C: ");
      c = teclado.nextInt();
        
      
      if(a < (b+c) && b < (a+c) && c < (a+b)){
      
      if((a == b && a == c) && (b == a && b == c) && (c == a && c == b)){
        System.out.print(" resultado: Trinagulo equilatero;");
      
        
      }else{
      if((a == b || a == c ) || (b == a || b == c) || (c == a || c == b)){
      System.out.print(" resultado: Trinagulo isoceles;");
      
      
      }else{
      if((a != b && a != c) && (b != a && b != c) && (c != a && c != b)){
           System.out.print(" resultado: Trinagulo escaleno;");
            }
       
      }
           
}
      
      }else{System.out.print("os valores informados nao formam um tringulo");}
        
      
      
      
      
      
    }
}
