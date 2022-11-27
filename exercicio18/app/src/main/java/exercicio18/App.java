package exercicio18;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int idade,num=0;
       
       
       for(int x=0; x<75;x++){
       System.out.println("informe sua idade: ");
       idade = teclado.nextInt();
       
       if(idade>=18){
       System.out.println("voce e maior de idade");
       num ++;
       
       }else{System.out.println("voce e menor de idade");}
       
       
       }
       
        
        
        
        
        
        
        
        
    }
}
