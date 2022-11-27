package exercicio08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       float real,dolar,convert = 5.30f;
       
       System.out.println("informe o valor em reais: ");
        real = teclado.nextFloat();
        
        
        dolar = real/convert;
        
        System.out.println("voce tem: "+dolar+" dolares");
        
        
        
        
    }
}
