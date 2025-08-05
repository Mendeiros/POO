package Questao01;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa fulano = new Pessoa();
        
        fulano.altura = 175;
        fulano.peso = 78;

        System.out.println("IMC:"+fulano.calcularImc());
    }
}
