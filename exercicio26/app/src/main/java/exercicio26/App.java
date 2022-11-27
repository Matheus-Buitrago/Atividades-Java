package exercicio26;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    
    int num;
    
    System.out.print("informe um valor entre um e cinco: ");
    num = teclado.nextInt();
    
    switch(num){
        case 1:
            System.out.print("Um");
        break;
    
     case 2:
            System.out.print("Dois");
        break;
        
     case 3:
            System.out.print("Tres");
        break;   
        
     case 4:
            System.out.print("Quatro");
         break;
      
      case 5:
            System.out.print("Cinco");
         break;
        
      default:
          System.out.print("numero invalido");
          break;
    
    }
    
    
    
    
    
       
    }
}
