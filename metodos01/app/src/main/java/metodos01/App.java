package metodos01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double peso;
        double altura;
        
        System.out.println("informe seu peso: ");
        peso = teclado.nextDouble();
        
        System.out.println("informe sua altura: ");
        altura = teclado.nextDouble();
        
        double resultado = calcularImc(peso,altura);
        
        System.out.println("seu imc é: "+resultado);
        
    }
    
    public static double calcularImc(double peso,double altura){
    
    
    return peso/(altura*altura);
    }
    
    
    
    
    
}
