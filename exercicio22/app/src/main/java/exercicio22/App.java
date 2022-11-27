package exercicio22;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        String nomeproduto;
        float precodecusto;
        float totalcusto=0.0f;
        float totalvendas=0.0f;
        float precovenda;
        
        for(int x=0; x<=40; x++){
        
        System.out.print("informe o nome do produto: ");
             nomeproduto = teclado.next();
            
        System.out.print("informe o preco de custo do produto: ");  
             precodecusto = teclado.nextFloat();
             
        System.out.print("informe o preco de venda do produto: ");
             precovenda = teclado.nextFloat();
            
          totalcusto += precodecusto;
         totalvendas += precovenda;
             
             
        if(precovenda > precodecusto){
        System.out.println("obteve lucro de "+(precovenda - precodecusto));
        
        }else{
        if(precovenda < precodecusto){
        System.out.print("obteve prejuizo de "+(precodecusto - precovenda));
        
        }else{System.out.println("o preco de custo "+ precodecusto +"e igual ao preco de venda"+ precovenda );}
        
        }
       
      
        }
        
        System.out.println(totalcusto+" e "+totalvendas);
        
        
    }
    
}
