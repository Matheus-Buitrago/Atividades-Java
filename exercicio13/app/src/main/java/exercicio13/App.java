package exercicio13;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        
        System.out.print("informe um numero: ");
        num = teclado.nextInt();
        
        
        if(num > 10){
        
        System.out.print("o numero "+num+" é maior que 10");
        
        
        }else{
        System.out.print("o numero "+num+" é menor que 10");
        }
        
 
    }
}
