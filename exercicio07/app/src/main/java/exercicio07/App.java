package exercicio07;

import java.util.Scanner;

public class App {
 

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      float tempc,tempf;
      
      System.out.println("informe a temperatura em celsius: ");
      tempc = teclado.nextFloat();
      
      tempf = (9*tempc+160) / 5;
      
      System.out.println("a temperatura em fahrenheit �: "+ tempf);
    
    }
}
