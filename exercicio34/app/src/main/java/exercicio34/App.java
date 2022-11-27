package exercicio34;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner  teclado = new Scanner(System.in);
       
       int idade;
       
       
       System.out.print("informe a idade do nadador: ");
       idade = teclado.nextInt();
       
       
       if(idade >= 5 && idade <=7){
       System.out.print("Categoria: Infantil A");
       
       }else{
       if(idade >= 8 && idade <=10){
       System.out.print("Categoria: Infantil B");
       
       }else{
       if(idade >= 11 && idade <=13){
       System.out.print("Categoria: Infantil C");
       
       }else{
       if(idade >= 14 && idade <=17){
       System.out.print("Categoria: Infantil D");
       
       }else{
       if(idade >= 18 && idade <=25){
       System.out.print("Categoria: Senior");
       
       }else{System.out.print("idade invalida!");}
       
       }
       }
       }
       }
        
        
        
        
        
        
        
        
        
        
     
    }
}
