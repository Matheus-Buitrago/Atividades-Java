package exercicio31;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        float a=2,b=0;
        char c,op;
        
        
        do{
            
             System.out.print("informe um carcter: ");
                 c = teclado.next().charAt(0);
            
            
        switch(c){
            case '+':
             System.out.println(a+b);
             break;
             
            case'-':
             System.out.println(a-b); 
             break;
             
            case '*':
              System.out.println(a*b);
              break;
              
            case'/':
            if(b >= 1){
             System.out.println(a/b);
            
            }else{ 
                System.out.println("divisor igual a zero ou menor é incorreto");
            }
            break;
            
            default:
                System.out.println("caracter de operacao invalido!");
            }
        
        
        
       System.out.println("deseja continuar: ");
                op = teclado.next().charAt(0);
        
        }while(op == 's' || op == 'S');
        
       
        
    }
}
