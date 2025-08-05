package Questao02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pessoa fulano = new Pessoa();
        
        System.out.print("Digite sua altura: ");
        fulano.altura = scanner.nextDouble();

        System.out.print("Digite seu peso: ");
        fulano.peso = scanner.nextDouble();

        System.out.println("IMC: "+fulano.calcularImc());
        scanner.close();
    }
}
