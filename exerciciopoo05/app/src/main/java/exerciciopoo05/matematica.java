package exerciciopoo05;


public class matematica extends disciplinas {
    
    float nao = 1;
    
    public float media(float notaProva1,float notaProva2, float notaTrab){
    return (notaProva1+notaProva2+notaTrab)/3;
    }
    
    public float Final(float media){
        float Final = (7/3);
        if(media >= Final ){
        nao = 0;
        }
        return nao;
    }
    
    
}
