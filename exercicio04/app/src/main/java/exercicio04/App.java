package exercicio04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    String nome;
    int salario_fixo= 1500, vendas, salario_final;
    
    System.out.println("informe o nome do funcionario: ");
    nome = teclado.nextLine();
    
    System.out.println("informe o saldo total em vendas nesse mes: ");
    vendas = teclado.nextInt();
    
    salario_final = salario_fixo +((vendas*15)/100);
    
    System.out.println("ola "+ nome);
    System.out.println("seu salario fixo e de: "+salario_fixo);
    System.out.println("o salario do mes com o acrescimo da porcentagem de vendas e: "+salario_final);
}
}