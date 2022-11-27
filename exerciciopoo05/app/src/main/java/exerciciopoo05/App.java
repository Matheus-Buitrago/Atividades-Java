package exerciciopoo05;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       matematica objetomatematica = new matematica();
       
       float media;
       float Final;
       
       
       System.out.print("informe sua matricula: ");
       objetomatematica.setMatricula(teclado.next());
       
       System.out.print("informe seu nome: ");
       objetomatematica.setNome(teclado.next());
       
       System.out.println("informe a nota da 1° prova: ");
       objetomatematica.setNotaProva1(teclado.nextFloat());
       if(objetomatematica.codErro == 1){
       System.out.print("nota incorreta!");
       }
       
       System.out.println("informe a nota da 2° prova: ");
       objetomatematica.setNotaProva2(teclado.nextFloat());
       if(objetomatematica.codErro == 2){
       System.out.print("nota incorreta!");
       }
       
       System.out.println("informe a nota do trabalho: ");
       objetomatematica.setNotaTrab(teclado.nextFloat());
       if(objetomatematica.codErro == 3){
       System.out.print("nota incorreta!");
       }
       
       media = objetomatematica.media(objetomatematica.getNotaProva1(),
           objetomatematica.getNotaProva1(), objetomatematica.getNotaTrab());
       
       System.out.println("sua media é: "+media);
       
       Final = objetomatematica.Final(media);
       
       if(Final == 0){
       System.out.print("voce nao vai para a final: ");
       }
        
    }
   }