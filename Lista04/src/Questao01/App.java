package Questao01;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario[] funcionarios = new Funcionario[5];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < funcionarios.length; i++){
            Funcionario funcionarioAdd = new Funcionario();

            System.out.println("Informe o nome do funcionário "+ i);
            funcionarioAdd.setNome(teclado.next());

            System.out.println("Informe o salário do funcionário "+i);
            funcionarioAdd.setSalario(teclado.nextDouble());

            funcionarios[i] = funcionarioAdd;
        }

        teclado.close();

        for (int i = 0; i < funcionarios.length; i++){
            Funcionario func = funcionarios[i];
            System.out.println("Nome: "+func.getNome()+" | Salário: "+func.getSalario()+" | Imposto: "+func.calcularIrpf());
        }
    }
}
