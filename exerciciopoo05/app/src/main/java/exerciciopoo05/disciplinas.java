package exerciciopoo05;



public class disciplinas {
    
    private String matricula;
    private String nome;
    private float notaProva1;
    private float notaProva2;
    private float notaTrab;
    public int codErro = 0;
    
    
    public disciplinas(){
    
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        if(notaProva1 <= 2.5f){
        this.notaProva1 = notaProva1;
        }else{codErro = 1;}
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
       if(notaProva2 <= 2.5f){
        this.notaProva2 = notaProva2;
       }else{codErro = 2;}
    }

    public float getNotaTrab() {
        return notaTrab;
    }

    public void setNotaTrab(float notaTrab) {
        if(notaTrab <= 2.0f){
        this.notaTrab = notaTrab;
        }else{codErro = 3;}
    }
    
    
    
    
    
    
    
    
    
}
