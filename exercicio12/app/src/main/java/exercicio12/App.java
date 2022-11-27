package exercicio12;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      float valorcusto,valordist,valorimpost,imposto = 0.45f,distribuidora = 0.28f;
      
      System.out.println("informe o valor do produto: ");
      valorcusto = teclado.nextFloat();
      
      valordist = valorcusto+(valorcusto*distribuidora);
      valorimpost = valordist+(valordist*imposto);
      
      System.out.println("o valor final do veiculo fica: "+ valorimpost);
      
        
    }
}
