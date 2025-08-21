package Questao03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta0 = new ContaBancaria();
        ContaBancaria conta1 = new ContaBancaria();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o numero da primeira conta: ");
        conta0.setNumero(teclado.nextLine());
        System.out.println("Insira o nome do titular: ");
        conta0.setTitular(teclado.nextLine());

        System.out.println("Insira o numero da segunda conta: ");
        conta1.setNumero(teclado.nextLine());
        System.out.println("Insira o nome do titular: ");
        conta1.setTitular(teclado.nextLine());

        teclado.close();

        conta0.depositar(1000);
        conta0.depositar(700);
        conta1.depositar(5000);
        conta1.sacar(3000);
        conta1.transferir(conta0, 1800);
        System.out.println("Titular primeira conta: "+conta0.getTitular()+"\nSaldo: "+conta0.getSaldo());
        System.out.println("Titular segunda conta: "+conta1.getTitular()+"\nSaldo: "+conta1.getSaldo());



    }

}
