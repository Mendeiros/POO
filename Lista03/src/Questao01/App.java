package Questao01;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];

        Pessoa p;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < pessoas.length; i++) {
            p = new Pessoa();

            System.out.println("Informe o nome da pessoa " + i + ":");
            p.setNome(teclado.next()); 

            System.out.println("Informe o peso da pessoa " + i + ":");
            p.setPeso(teclado.nextDouble());

            System.out.println("Informe a altura da pessoa " + i + ":");
            p.setAltura(teclado.nextDouble());

            pessoas[i] = p;
        }   

        teclado.close();

        for (int i = pessoas.length - 1; i >= 0; i--) {
            Pessoa pDados = pessoas[i];
            pDados.exibirDados();
        }
    }
}
