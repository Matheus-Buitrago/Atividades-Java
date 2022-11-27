package exercicio33;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int nivel;
       float horas_trabalhadas;
       
       System.out.print("informe o nivel do professor: ");
       nivel = teclado.nextInt();
       
       System.out.print("informe a quantidade de horas trabalhadas");
       horas_trabalhadas = teclado.nextFloat();
       
       if(nivel == 1){
       System.out.print(horas_trabalhadas * 12.0f);
       
       }else{
       if(nivel == 2){
       System.out.print(horas_trabalhadas * 17.0f);
       
       }else{
       if(nivel == 3){
       System.out.print(horas_trabalhadas * 25.0f);
       
       }else{
           System.out.print("opcao de nivel invalida!");
       }
       }
       
       }
       
       
       
       
       
       
}

}