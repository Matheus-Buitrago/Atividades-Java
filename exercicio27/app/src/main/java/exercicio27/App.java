package exercicio27;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       float valor_veiculo;
       float valor_final;
       float total_final;
       float desconto_final = 0.0f;
       char op;
       char tipo_combustivel;
       
       System.out.print("informe o valor do veiculo: ");
       valor_veiculo = teclado.nextInt();
       
       System.out.print("informe o tipo de combustivel do veiculo: ");
       tipo_combustivel = teclado.next().charAt(0);
       
       do{
           total_final =+ valor_veiculo;
           
       
       if(tipo_combustivel == 'a' || tipo_combustivel == 'A'){
       valor_final = valor_veiculo-(valor_veiculo*0.25f);
       desconto_final =+ valor_final;
       System.out.print("o valor inicial do veiculo era de: "+valor_veiculo+" com o desconto de: "+(valor_veiculo - valor_final)+" fica: "+ desconto_final);
       
       }else{
       if(tipo_combustivel == 'g' || tipo_combustivel == 'G'){
       valor_final = valor_veiculo-(valor_veiculo*0.21f);
       desconto_final =+ valor_final;
       System.out.print("o valor inicial do veiculo era de: "+valor_veiculo+" com o desconto de: "+(valor_veiculo - valor_final)+" fica: "+ desconto_final);
       
       }else{
       if(tipo_combustivel == 'd' || tipo_combustivel == 'D'){
       valor_final = valor_veiculo-(valor_veiculo*0.17f);
       desconto_final =+ valor_final;
       System.out.print("o valor inicial do veiculo era de: "+valor_veiculo+" com o desconto de: "+(valor_veiculo - valor_final)+" fica: "+ desconto_final);
       
           }
       
            }
       
             }
       
       
       total_final =+ valor_veiculo;
       
       System.out.print("deseja continuar? ");
       op = teclado.next().charAt(0);
       
     
       }while(op == 's' || op == 'S');
       
       System.out.print("o total das vendas foi de "+total_final+" e o total de desconto foi de: "+(total_final - desconto_final));
       
       
        
    }
}
