
package exerciciopoo02;


public class contaCorrente {
    
    private int numeroconta;
    private String nometitular;
    private double saldo;
    
    
    public contaCorrente(double saldo, int numeroconta, String nometitular){
    this.saldo = saldo;
    this.numeroconta = numeroconta;
    this.nometitular = nometitular;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public void alterarnome(String novonome){
    nometitular = novonome;
    }
  
    public void deposito(double valordeposito){
    saldo += valordeposito;
    }
    
    public void saque(double valorsaque){
    saldo -= valorsaque;
    }
    

}
