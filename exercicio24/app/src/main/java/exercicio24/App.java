package exercicio24;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      int num;
      char op;
      
      do{
          
      System.out.print("informe um numero: ");
      num = teclado.nextInt();
      
      if(num >=1){
      System.out.print("o numero "+num+", informado é positivo");
      
      }else{
      if(num <= -1){
      System.out.print("o numero "+num+", informado é negativo");
      
      }else{System.out.print("o numero é zero!");}
      }
      
      System.out.print("deseja continuar: ");
      op = teclado.next().charAt(0);
      
      
      }while(op == 's' || op == 'S');
      
      
      
      
      
      
    }
}
