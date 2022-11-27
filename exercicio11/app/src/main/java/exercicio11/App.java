package exercicio11;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float valorProduto,desconto,valorfinal;
        
        System.out.println("Iforme o valor do produto: ");
        valorProduto = teclado.nextFloat();
        
        System.out.println("informe a porcentagem de desconto: ");
        desconto = teclado.nextFloat();
        
        valorfinal = valorProduto + (valorProduto*desconto)/100;
        //valorfinal = valorProduto - calculo;
        
        System.out.println("o valor final do produto ficou: "+ valorfinal);
        
      
    }
}
