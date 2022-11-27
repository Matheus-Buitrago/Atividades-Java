package exercicio29;

import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        int mes;
        
        System.out.print("informe o numero do mes: ");
        mes  = teclado.nextInt();
        
        switch(mes){
        case 1:
              System.out.print("Janeiro");  
        break;
        
        case 2:
              System.out.print("Fevereiro");  
        break;
        
        case 3:
              System.out.print("Marco");  
        break;
        
        case 4:
              System.out.print("Abril");  
            break;
            
        case 5:
              System.out.print("Maio");  
        break;
            
        case 6:
              System.out.print("Junho");  
        break;
            
        case 7:
              System.out.print("Julho");  
        break;
            
        case 8:
              System.out.print("Agosto");  
        break;
            
        case 9:
              System.out.print("Setembro");  
        break;
            
        case 10:
              System.out.print("Outubro");  
        break;
            
        case 11:
              System.out.print("Novembro");  
        break;
            
        case 12:
              System.out.print("Dezembro");  
        break;
            
        default:
              System.out.print("Numero do mes invalido!");  
        break;
            
        
        
        
        }
        
        
        
        
        
        
    }
    
}
