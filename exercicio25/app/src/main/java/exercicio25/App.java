package exercicio25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.print("informe o primeiro valor: ");
        a = teclado.nextInt();
        
        System.out.print("informe o segundo valor: ");
        b = teclado.nextInt();
        
        
        if(a == b){
        System.out.print("Os valores sao iguais!");
        
        }else{
        System.out.print("Os valores sao diferentes!");
        
        if(a > b){
        System.out.print(a+" è maior que "+b);
        
        }else{
            System.out.print(b+" è maior que "+a);
        }
        }
        
        
        
        
        
       
    }
}
