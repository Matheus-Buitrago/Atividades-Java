package exerciciopoo07;



public class App {
   public static void main(String[] args) {
       
       vendedor vendedor = new vendedor(2100);
       estoquista estoquista = new estoquista(1700);
      
       
      System.out.println("o salario anual do vendedor é:"+vendedor.salarioAnual());
       System.out.println("o salario do vendedor com o aumento anual fica: "+vendedor.aumentoanual());
       
    
        System.out.println("o salario anual do estoquista é:"+estoquista.salarioAnual());
       System.out.println("o salario do estoquista com o aumento anual fica: "+estoquista.aumentoanual());
       
       
       
       
       
       
       
       
    }
}
