package exerciciopoo01;

import java.util.Date;


public class pessoa {
    
    private String nome;
    private Date datanascimento;
    private float altura;
    
    public pessoa(){
    
    
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void exibirdados(){
    
    System.out.print("Nome: "+nome);
    System.out.print("Altura: "+altura);
        
    }
    
    
    
    
}
