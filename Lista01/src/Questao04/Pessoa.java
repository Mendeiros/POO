package Questao04;

public class Pessoa {

    String nome;
    double altura;
    double peso;

    public double calcularImc(){
        
        double imc = peso/(altura*altura);

        return imc;
    }
}
