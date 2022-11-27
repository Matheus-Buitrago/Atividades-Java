package exercicio19;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       String nome;
       char sexo;
       int contM=0,contF=0;
       
       for(int x =0; x<4;x++){
       System.out.println("digite seu nome: ");
       nome = teclado.nextLine();
       
       
       System.out.println("informe seu sexo: ");
       sexo = teclado.next().charAt(1);
       
       if(sexo == 'm' || sexo == 'M'){
       System.out.println(nome+" seu sexo é mesculino");
       contM++;
       
       }else{System.out.println(nome+" seu sexo é feminino");
       contF++;
       }
       
       System.out.println("ao todo "+contM+" pessoas sao do sexo masculino ");
       System.out.println("e "+contF+"sao do sexo feminino");
       
       }
       
       
        
    }
}
