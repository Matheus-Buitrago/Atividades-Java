package exerciciopoo04;


public class elevador {
    
    private int andarAtual;
    private int totalandares;
    private int capacidadeElevador;
    private int pessoasPresentes;
    
    
    public elevador(int andarAtual, int totalandares,int capacidadeElevador){
    this.andarAtual = andarAtual;
    this.totalandares = totalandares;
    this.capacidadeElevador = capacidadeElevador;
    }

    
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    
    public int getTotalandares() {
        return totalandares;
    }
    public void setTotalandares(int totalandares) {
        this.totalandares = totalandares;
    }
    

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }
    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    
    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
    
    
    
    public void entra(){
    if(capacidadeElevador >=0 && capacidadeElevador <=5){
    capacidadeElevador += 1;
    }else{}
    }
    public void sai(){
    if(capacidadeElevador >=1){
    capacidadeElevador -= 1;
    }
    }
    
    
    public void sobe(){
    if(andarAtual <= totalandares){
    andarAtual =+ 1;
    }
    }
    public void desce(){
    if(andarAtual >=0){
    andarAtual -= 1;
    }
    
    }
    
    
    
}
