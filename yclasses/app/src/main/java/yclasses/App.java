package yclasses;

import java.util.Scanner;

public class App { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        pessoa objetopessoa = new pessoa();
        
        
        System.out.print("informe seu peso: ");
        objetopessoa.setpeso(teclado.nextFloat());
        
        
        System.out.print("informe sua altura: ");
        objetopessoa.setaltura(teclado.nextFloat());
        
        
        System.out.print(objetopessoa.calcularIMC());
        
      
      
    }
}
