package objeto;



public class TV {
    String fabricante = "sony";
    int polegadas = 32;
    int volume = 0;
    int canal = 1;
    boolean ligado = false;
    
    
    public void aumentarvolume(){
    if(volume <=100){
    
    volume++;
    }
    }
    
    
    public void diminuirvolume(){
    if(volume >=0){
    
     volume--;
    }    
    }
    
    
    public void ligartv(){
    if(ligado == false){
    
    ligado = true;
    }
    }
    
    
    public void desligartv(){
    if(ligado == true){
    
       ligado = false; 
    }
    }
    
    
    
    }
    
    

