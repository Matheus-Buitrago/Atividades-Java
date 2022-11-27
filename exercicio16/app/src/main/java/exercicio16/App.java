package exercicio16;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       float nota1;
       float nota2;
       float nota3;
       float media;
       
        System.out.print("Informe a primeira nota: ");
        nota1 = teclado.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        nota2 = teclado.nextFloat();
        
        System.out.print("Informe a terceira nota: ");
        nota3 = teclado.nextFloat();
       
       media = (nota1+nota2+nota3)/3;
       
       if(media >=7){
       System.out.print("Aprovado!");
       
       }else{
       if(media >= 5.1 && media <= 6.9){
       System.out.print("Aluno em recuperacão!");
       
       }else{
           System.out.print("Reprovado!");
       
       }
       }
       
       
       
    }
}
