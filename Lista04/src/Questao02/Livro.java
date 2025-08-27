package Questao02;

public class Livro {
    static int totalLivros;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(){
        titulo = "Sem título";
        autor = "Desconhecido";
        anoPublicacao = 0;
        totalLivros++;
    }
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        totalLivros++;
    }

    public String exibirInfo(){
        String minhaStr = "%s: Escrito por: %s, Publicado em: %d";
        String mensagem = String.format(minhaStr, titulo, autor, anoPublicacao);
        return mensagem;
    }

    public String exibirInfo(boolean resumido){
        if (resumido){
            return titulo;
        } else {
            return exibirInfo();
        }
    }

    public int getTotalLivros(){
        return totalLivros;
    }
}
