package exercicio03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int media;
    
    
    System.out.println("informe a distancia em km percorrida: ");
    int distancia = teclado.nextInt();
    
    System.out.println("informe a quantidade de litros consumida: ");
    int combustivel = teclado.nextInt();
 
        
    media = distancia/combustivel;
        
    System.out.println("o consumo medio do veiculo � "+ media+" KM por litro de combustivel");
        
        
        
      
    }
}
