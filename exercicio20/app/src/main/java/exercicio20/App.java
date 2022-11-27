package exercicio20;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int anocarro,carrovelho = 2000,carronovo = 2001, valor;
    int porcem;
    char op;
    
    do{
    
    
    System.out.print("informe o valor do carro: ");
    valor = teclado.nextInt();
    
    System.out.print("informe o ano do carro: ");
    anocarro = teclado.nextInt();
    
    
    if(anocarro <= carrovelho){
    porcem = (valor*12)/100;
    
    System.out.println("o veiculo tem o ano de "+anocarro+ " e seu desconto de 12%");
    System.out.println("o valor final com desconto e de: "+(valor - porcem));
    }else{
    
    porcem = (valor*7)/100;
    
    System.out.println("o veiculo tem o ano de "+anocarro+ " e seu desconto de 7%");
    System.out.println("o valor final com desconto e de: "+(valor - porcem));
    }
    
    System.out.println("deseja continuar calculando? ");
    op = teclado.next().charAt(0);
    
    }while(op == 's' || op == 'S');
    
    }
    
}
