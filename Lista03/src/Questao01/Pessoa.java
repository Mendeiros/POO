package Questao01;
public class Pessoa {

    private double altura;
    private double peso;
    private String nome;

    double calcularImc() {
        return peso / (altura * altura);
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularImc());
        System.out.println("#######################");
    }

    double getAltura(){
        return altura;
    }

    void setAltura(double altura){
        this.altura = altura;
    }
    
    double getPeso(){
        return peso;
    }

    void setPeso(double peso){
        this.peso = peso;
    }

    String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

}
