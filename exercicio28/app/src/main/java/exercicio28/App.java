package exercicio28;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        float salario_minimo=1200.0f,salario,salario_final;
        float ate3;
        float entre3_10;
        float entre10_20;
        float acima20;
        float folhatotal=0.0f;
        
        for(int x=0;x<4;x++){
        
            System.out.println("informe seu nome: ");
                nome = teclado.next();
            
            System.out.println("informe seu salario");
                salario = teclado.nextFloat();
                
                ate3 = salario*0.50f;
                entre3_10 = salario*0.20f;
                entre10_20 = salario*0.15f;
                acima20 = salario*0.10f;
                
                
                
                if(salario < (3*salario_minimo)){
                
                 salario_final = salario+ate3;
                 System.out.println("Ola "+nome);
                 System.out.println("o reajuste é de: "+ate3+" e o salario final: "+salario_final);
                 folhatotal += ate3;
                
                }else{
                     if(salario >= (3*salario_minimo) & salario < (10*salario_minimo)){
                
                 salario_final = salario+entre3_10;
                 System.out.println("Ola "+nome);
                 System.out.println("o reajuste é de: "+entre3_10+" e o salario final: "+salario_final);
                 folhatotal += entre3_10;
                    
                }else{
                     if(salario >= (10*salario_minimo)){
                     
                 salario_final = salario+entre10_20;
                 System.out.println("Ola "+nome);
                 System.out.println("o reajuste é de: "+entre10_20+" e o salario final: "+salario_final);
                 folhatotal += entre10_20;
                     
                }else{
                         
                 salario_final = acima20;
                 System.out.println("Ola "+nome);
                 System.out.println("o reajuste é de: "+acima20+" e o salario final: "+salario_final);
                 folhatotal += acima20;
                     
                    }
                     
                }
                
            }
        
        }
        
        System.out.println("o aumento total da folha e: "+folhatotal);
        
        
    }
}
