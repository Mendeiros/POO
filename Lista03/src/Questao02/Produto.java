package Questao02;
public class Produto {
    
    private String nome;
    private double preco;
    private int estoque;

    public void vender(int quantidade){
        if (estoque < quantidade){
            System.out.println("Estoque insuficiente para a venda!");
        } else {
            estoque -= quantidade;
            System.out.println(quantidade + " produtos foram vendidos!");
        }
    }

    public void repor(int quantidade){
        if (quantidade > 0){
            estoque += quantidade;
            System.out.println(quantidade+ " produtos foram adicionados ao estoque!");
        } else {
            System.out.println("Insira um valor maior que 0 (zero)!");
        }
    }

    public int getEstoque(){
        return estoque;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        } else {
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
