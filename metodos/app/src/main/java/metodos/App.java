package metodos;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double arearetangulo;
        double base,altura;
        
       System.out.println("informe a base do triangulo: ");
       base = teclado.nextDouble();
       
       System.out.println("informe a altura do triangulo: ");
       altura = teclado.nextDouble();
        
       arearetangulo = retangulo(base,altura);
       System.out.print(arearetangulo);
}
       
    
    public static double retangulo(double base, double altura){
     
      return base*altura;
    }
     
    
     
    
}
