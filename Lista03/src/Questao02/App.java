package Questao02;

public class App {
    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.setNome("Caneta");
        prod.setPreco(-10);
        prod.repor(20);
        System.out.println(prod.getEstoque());
        prod.vender(7);
        System.out.println(prod.getNome());
        System.out.println(prod.getPreco());
        System.out.println(prod.getEstoque());
    }
}
