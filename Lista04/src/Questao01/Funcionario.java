package Questao01;
public class Funcionario {
    private String nome;
    private double salario;

    // ==aliquotas
    private double aliquota02 = 0.075;
    private double aliquota03 = 0.150;
    private double aliquota04 = 0.225;
    private double aliquota05 = 0.275;

    // ==faixas
    private double faixa02 = 1903.98;
    private double faixa03 = 2826.65;
    private double faixa04 = 3751.05;
    private double faixa05 = 4664.68;

    // ==imposto limite por faixa
    // a faixa 01 é isenta de impostos
    private double limiteIr02 = ((faixa03-faixa02)*aliquota02);
    private double limiteIr03 = ((faixa04-faixa03)*aliquota03);
    private double limiteIr04 = ((faixa05-faixa04)*aliquota04);
    // a faixa 05 não tem limite do valor afetado pela porcentagem

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSalario(double salario){
        if (salario < 0){
            System.out.println("Valor inválido");
        } else {
            this.salario = salario;
        }

    }

    public double getSalario(){
        return this.salario;
    }

    public double calcularIrpf(){
        double salario = this.salario;
        double imposto = 0;
        double diferenca = 0;
        if (salario > faixa05){
            imposto = limiteIr04 + limiteIr03 + limiteIr02;
            diferenca = salario-faixa05;
            imposto += (diferenca*aliquota05);
        } else if (salario > faixa04){
            imposto = limiteIr03 + limiteIr02;
            diferenca = salario-faixa04;
            imposto += (diferenca*aliquota04);
        } else if (salario > faixa03){
            imposto = limiteIr02;
            diferenca = salario-faixa03;
            imposto += (diferenca*aliquota03);
        } else if (salario > faixa02){
            diferenca = salario-faixa02;
            imposto += (diferenca*aliquota02);
        }
        return imposto;
    }

}
