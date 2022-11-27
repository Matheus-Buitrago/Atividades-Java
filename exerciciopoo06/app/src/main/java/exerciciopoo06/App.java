package exerciciopoo06;

public class App {
    public static void main(String[] args) {
        

        inVoice voice = new inVoice("ap23","som3d",34,110.0f);
        System.out.print("o codigo do item:"+ voice.getCodigoItem()+
           "a descricao do item é: "+voice.getDescricaoItem());
        
        
       
    }
}
