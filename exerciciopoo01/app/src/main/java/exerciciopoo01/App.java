package exerciciopoo01;


import java.util.Scanner;


public class App {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    pessoa novapessoa = new pessoa();
    
   
    
    System.out.print("informe seu nome: ");
    novapessoa.setNome(teclado.next());
    
    System.out.print("informe sua altura: ");
    novapessoa.setAltura(teclado.nextFloat());
    
    
        novapessoa.exibirdados();
    
    }
    
}
