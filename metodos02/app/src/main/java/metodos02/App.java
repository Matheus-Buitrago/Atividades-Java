package metodos02;



public class App {
  public static void main(String[] args) {
       
  //int vet[] = new int[5];
  int[] vet = {5,10,15,20,25};
  int xyz =10;
      
      vetor(vet);
      vPrimitiva(xyz);
      
      System.out.println(vet [0]);
      System.out.print(xyz);
      
    }
  
  public static void vetor(int[] x){
  x[0] = 200;
  
  }
  
  public static void vPrimitiva(int x){
  x =200;
 
  }
  
  
}
