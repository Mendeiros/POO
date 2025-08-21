package Questao03;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("Tentativa recusada, insira um valor maior que zero!");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Tentativa recusada, insira um valor entre 0 (zero) e seu saldo!");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        if (valor > 0 && valor <= saldo){
            this.saldo -= valor;
            contaDestino.saldo += valor;
        } else {
            System.out.println("Tentativa recusada, insira um valor entre 0 (zero) e seu saldo!");
        }
    }
}
