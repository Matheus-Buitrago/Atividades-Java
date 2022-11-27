package exercicio21;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        char sexo;
        int idade;
        char saude;
        char op;
        int qtd_aptos = 0;
        int qtd_total = 0;
        int qtd_f= 0 ;
        int qtd_menores = 0;
        int saude_invalida = 0;
        
        
        do{
        
        System.out.print("Informe seu nome: ");
        nome  = teclado.next();
        
        System.out.print("Informe seu sexo: ");
        sexo = teclado.next().charAt(0);
        
        System.out.print("Informe sua idade: ");
        idade = teclado.nextInt();
        
        System.out.print("Informe seu estado de saude: ");
        saude  = teclado.next().charAt(0);
        
        
        
        if(idade >= 18 && (saude == 's' || saude == 'S') && (sexo == 'm' || sexo == 'M')){
        System.out.println(nome+", Apto para o servico militar obrigatorio!");
        qtd_aptos++;
        
        }else{
            System.out.println("Inapto para o servico militar obrigatorio!");
            }
        
        if(sexo == 'f' || sexo == 'F'){
        qtd_f++;
        }
        
        if(idade < 18){
        qtd_menores++;
        }
        
        if(saude != 's' || saude != 'S'){
        saude_invalida++;
        }
        
        
        System.out.print("Deseja continuar? ");
        op  = teclado.next().charAt(0);
        
        
        
        qtd_total++;
        }while(op == 's' || op == 'S');
        
        System.out.print("A quantidade total foi : "+qtd_total);
        System.out.print("A quantidade de aptos foi de: "+qtd_aptos);
        System.out.print("A quantidade de inaptos foi de: "+(qtd_total - qtd_aptos));
        System.out.print("A quantidade de pessoas do sexo feminino foi de: "+qtd_f);
        System.out.print("A quantidade de menores de idade foi de: "+qtd_menores);
        System.out.print("A quantidade de inaptos por razao de saude foi de: "+saude_invalida);
        
    }
}
