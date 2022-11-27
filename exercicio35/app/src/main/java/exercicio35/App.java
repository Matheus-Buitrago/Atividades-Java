package exercicio35;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float kw;
        char tipo;
        
        
        System.out.print("iinforme a quantidade de KiloWatts: ");
        kw = teclado.nextFloat();
        
        System.out.print("informe o tipo do cliente: ");
        tipo = teclado.next().charAt(0);
        
        
        if(tipo == 'r' || tipo == 'R'){
        System.out.print(kw*0.60);
        
        }else{if(tipo == 'c' || tipo == 'C'){
        System.out.print(kw*0.48);
        
        }else{
        if(tipo == 'i' || tipo == 'I'){
        System.out.print(kw*1.29);
        
        }
        }
        }
        
        
    
    }
}
