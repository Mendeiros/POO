package Questao04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Pessoa fulano = new Pessoa();
        Pessoa ciclano = new Pessoa();
        Pessoa beltrano = new Pessoa();
        

        System.out.print("Informe o nome da primeira pessoa: ");
        fulano.nome = scanner.nextLine();
        System.out.print("Informe a altura: ");
        fulano.altura = scanner.nextDouble();
        System.out.print("Informe o peso: ");
        fulano.peso = scanner.nextDouble();

        System.out.print("Informe o nome da segunda pessoa: ");
        ciclano.nome = scanner.nextLine();
        System.out.print("Informe a altura: ");
        ciclano.altura = scanner.nextDouble();
        System.out.print("Informe o peso: ");
        ciclano.peso = scanner.nextDouble();

        System.out.print("Informe o nome da terceira pessoa: ");
        beltrano.nome = scanner.nextLine();
        System.out.print("Informe a altura: ");
        beltrano.altura = scanner.nextDouble();
        System.out.print("Informe o peso: ");
        beltrano.peso = scanner.nextDouble();

        System.out.println("Nome: "+beltrano.nome+"\nPeso: "+beltrano.peso+"\nAltura: "+beltrano.altura);
        System.out.println("Nome: "+ciclano.nome+"\nPeso: "+ciclano.peso+"\nAltura: "+ciclano.altura);
        System.out.println("Nome: "+fulano.nome+"\nPeso: "+fulano.peso+"\nAltura: "+fulano.altura);
        scanner.close();
    }
}
