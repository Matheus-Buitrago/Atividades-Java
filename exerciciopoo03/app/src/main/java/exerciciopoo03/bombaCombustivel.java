package exerciciopoo03;


public class bombaCombustivel {
    
    private String tipocombus;
    private double valorlitro;
    private double qtdreservatorio;
    
    
    public bombaCombustivel(double qtdreservatorio, double valorlitro, String tipocombus){
    this.qtdreservatorio = qtdreservatorio;
    this.valorlitro = valorlitro;
    this.tipocombus = tipocombus;
    }

    public String getTipocombus() {
        return tipocombus;
    }

    public void setTipocombus(String tipocombus) {
        this.tipocombus = tipocombus;
    }

    public double getValorlitro() {
        return valorlitro;
    }

    public void setValorlitro(double valorlitro) {
        this.valorlitro = valorlitro;
    }

    public double getQtdreservatorio() {
        return qtdreservatorio;
    }

    public void setQtdreservatorio(double qtdreservatorio) {
        this.qtdreservatorio = qtdreservatorio;
    }
    
  public double abastecerPorValor(double valorApagar){
  return valorApagar/valorlitro;
  }

    

    
    
    
    
    
}
