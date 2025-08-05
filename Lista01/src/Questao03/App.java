package Questao03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pessoa fulano = new Pessoa();
        Pessoa ciclano = new Pessoa();
        Pessoa beltrano = new Pessoa();
        

        System.out.print("Primeira pessoa, digite sua altura: ");
        fulano.altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        fulano.peso = scanner.nextDouble();
        System.out.println("IMC: "+fulano.calcularImc());

        System.out.print("Segunda pessoa, digite sua altura: ");
        ciclano.altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        ciclano.peso = scanner.nextDouble();
        System.out.println("IMC: "+ciclano.calcularImc());

        System.out.print("Terceira pessoa, digite sua altura: ");
        beltrano.altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        beltrano.peso = scanner.nextDouble();
        System.out.println("IMC: "+beltrano.calcularImc());

        scanner.close();
    }
}
