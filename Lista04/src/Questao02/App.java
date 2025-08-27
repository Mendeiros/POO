package Questao02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qntLivros;

        System.out.println("Informe quantos livros serão cadastrados: ");
        qntLivros = teclado.nextInt();
        Livro[] livros = new Livro[qntLivros];

        for (int i = 0; i < livros.length; i++){
            System.out.println("Informe o título do livro " + i);
			String titulo = teclado.next();

			System.out.println("Informe o autor do livro " + i);
			String autor = teclado.next();

			System.out.println("Informe o ano de publicação do livro " + i);
			int anoPublicacao = teclado.nextInt();

			livros[i] = new Livro(titulo, autor, anoPublicacao);
        }
        
        teclado.close();

        for (int i = 0; i < livros.length; i++) {
			Livro livroRead = livros[i];
			
			System.out.println(livroRead.exibirInfo(true));
            if (i == qntLivros){
                System.out.println(livroRead.exibirInfo());
            }
		}
        System.out.println("Quantidade de livros: "+Livro.totalLivros);

    }
}
