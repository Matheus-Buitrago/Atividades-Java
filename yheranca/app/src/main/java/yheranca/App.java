package yheranca;

import java.util.Scanner;
import java.util.Date;

public class App {
   public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       vendedor v = new vendedor();
       motorista m = new motorista();
      
       
       System.out.print("informe o nome do vendedor: ");
             v.setNome(teclado.next());
       
       System.out.print("informe o cpf do vendedor: ");
             v.setCpf(teclado.next());
       
       System.out.print("informe o salario do vendedor: ");
           v.setSalario(teclado.nextFloat());
       
        System.out.print("informe a quantidade de itens vendidos do vendedor: ");
           v.setTotalvendido(teclado.nextInt());
          
        System.out.print("informe a comissao por iten vendido: ");
           v.setComissaoporitens(teclado.nextInt());
           
           System.out.print(v.calcularsalario());
       
       
    }
}
