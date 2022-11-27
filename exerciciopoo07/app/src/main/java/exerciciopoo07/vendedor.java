package exerciciopoo07;



public class vendedor extends funcionario{
    
    public vendedor(float salariomensal){
    super();
    
    if(salariomensal < 1){
    super.setSalariomensal(0.0f);
    
    }else{super.setSalariomensal(salariomensal);}
}
    
    public float salarioAnual(){
    return super.getSalariomensal()*12;
    }
    
    public float aumentoanual(){
    return (salarioAnual()*.10f)+salarioAnual();
    }
    
 
    }
