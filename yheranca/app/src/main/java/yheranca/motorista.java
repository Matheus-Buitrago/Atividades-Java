package yheranca;

import java.util.Date;


public class motorista extends funcionario{
    
    private String categoriaCNH;
    private String placaveiculo;
    
    
    public motorista(){
    
        super();
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }
   
    
    
    
    
    
}
