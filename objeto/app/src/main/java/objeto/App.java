package objeto;



public class App {
   public static void main(String[] args) {
      
       TV televisao1 = new TV();
       
       
       System.out.println("esta televisao � da marca: "+televisao1.fabricante +". a televisao esta: "+
             (televisao1.ligado == true ? "ligada" : "desligada")+ ". o volume �: "+ televisao1.volume);
       
       televisao1.ligartv();
       televisao1.aumentarvolume();
       televisao1.aumentarvolume();
       
        System.out.print("esta televisao � da marca: "+televisao1.fabricante +". a televisao esta: "+
             (televisao1.ligado == true ? "ligada" : "desligada")+ ". o volume �: "+ televisao1.volume);
       
    }
}
