package exercicio05;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       String nome;
       float nota1;
       float nota2;
       float nota3;
       float media;
       
       System.out.print("informe seu nome: ");
       nome = teclado.next();
       
       System.out.print("insira a primeira nota:");
       nota1 = teclado.nextFloat();
       
       System.out.print("insira a segunda nota:");
       nota2 = teclado.nextFloat();
       
       System.out.print("insira a terceira nota:");
       nota3 = teclado.nextFloat();
       
       media = (nota1+nota2+nota3)/3;
       
       System.out.print(nome+", A media das notas é: "+media);
       
    }
}
