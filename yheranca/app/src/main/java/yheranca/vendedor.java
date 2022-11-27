package yheranca;

import java.util.Date;


public class vendedor extends funcionario{
    
    private int totalvendido;
    private int comissaoporitens;
    
    
   public vendedor(){
       
   super();
   }

    public int getTotalvendido() {
        return totalvendido;
    }

    public void setTotalvendido(int totalvendido) {
        this.totalvendido = totalvendido;
    }

    public int getComissaoporitens() {
        return comissaoporitens;
    }

    public void setComissaoporitens(int comissaoporitens) {
        this.comissaoporitens = comissaoporitens;
    }
    
    
    public float calcularsalario(){
    
    return totalvendido*comissaoporitens;
    }
   
   
 
}
