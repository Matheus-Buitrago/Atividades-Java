package yclasses;

public class pessoa extends App {
    
      private float peso;
      private float altura;
  
    
    //float resultado = calcularIMC(peso,altura);
 
    //metodos
     public float calcularIMC(){
    float imc  = peso/(altura*altura);
    return imc;
    }
    
    
    // metodos acessores
    
    public void setpeso(float peso){
    this.peso = peso;
    }
    
    public float getpeso(){
    return peso;
    }
    
    
    
    public void setaltura(float altura){
    this.altura = altura;
    }
    
    public float getaltura(){
    return altura;
    }
    
    
    
    
    
    

}
