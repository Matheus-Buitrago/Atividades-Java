package exerciciopoo03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        bombaCombustivel bomba01 = new bombaCombustivel(650.0 , 5.3, "gasolina");
        
    
        double rec;
      
      
        System.out.print("informe o valor a ser colocado: ");
      bomba01.abastecerPorValor(teclado.nextDouble());
        
        
       
        
        
        
        
        
        
        
        
        
    }
}
