package loja;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int valordoveiculo,anodoveiculo,calculoporcem=0;
        char op='n';
        
        
        while(op == 'N' || op == 'n'){
        
        System.out.println("informe o valor do veiculo: ");
        valordoveiculo = teclado.nextInt();
        
        System.out.println("informe o ano do veiculo: ");
        anodoveiculo = teclado.nextInt();
        
        if(anodoveiculo >= 2001){
        calculoporcem = (valordoveiculo*12)/100;
        System.out.println("carro do ano "+anodoveiculo+" teve desconto de :"+calculoporcem+" eo valor final do veiculo ficou: "+ (valordoveiculo - calculoporcem));
        
        }else{System.out.println("carro do ano "+anodoveiculo+" teve desconto de :"+calculoporcem+" eo valor final do veiculo ficou: "+ (valordoveiculo - calculoporcem));}
        
        System.out.println("deseja parar o programa? ");
        op = teclado.next().charAt(0);
        
        }
        
       
    }
}
