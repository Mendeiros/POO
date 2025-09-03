public class Animal {
    private String nome;
    private String especie;
    private String historico;
    private int idade;
    
    /**
     * Inicializador simplificado para cadastro de animal em uma clinica veterinária
     * 
     * @param nome nome do animal 
     * @param idade idade do animal
     * 
     * @throws IllegalArgumentException lança a excessão de argumento ilegal quando um numero negativo é inserido
     * 
     * @author Gabriel Mendes Medeiros 
     */

    public Animal(String nome, int idade){
        try{
            this.nome = nome;
            this.especie = "Indefinido";
            this.historico = "";
            if (idade < 0){
                throw new IllegalArgumentException("Cadastro negado, a idade deve ser posivitva!");
            } else {
                this.idade = idade;
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Inicializador completo para cadastro de animal em uma clinica veterinária
     * 
     * @param nome nome do animal 
     * @param especie especie do animal
     * @param idade idade do animal
     * 
     * @throws IllegalArgumentException lança a excessão de argumento ilegal quando um numero negativo é inserido
     * 
     * @author Gabriel Mendes Medeiros 
     */

    public Animal(String nome, String especie, int idade){
        try{
            this.nome = nome;
            this.especie = especie;
            this.historico = "";
            if (idade < 0){
                throw new IllegalArgumentException("Cadastro negado, a idade deve ser posivitva!");
            } else {
                this.idade = idade;
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Getter da variavel nome
     * @return O nome do animal
     * @author Gabriel Mendes Medeiros 
     */
    
    public String getNome(){
        return this.nome;
    }

    /**
     * Setter da variavel nome
     * @param nome nome a ser settado
     * @author Gabriel Mendes Medeiros 
     */

    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Getter da variavel especie
     * @return a especie do animal
     * @author Gabriel Mendes Medeiros 
     */

    public String getEspecie(){
        return this.especie;
    }

    /**
     * Setter da variavel especie
     * @param especie especie a ser settada
     * @author Gabriel Mendes Medeiros 
     */

    public void setEspecie(String especie){
        this.especie = especie;
    }

    /**
     * Getter da variavel idade
     * @return A idade do animal
     * @author Gabriel Mendes Medeiros 
     */

    public int getIdade(){
        return this.idade;
    }

    /**
     * Setter da variavel idade
     * @param idade idade a ser settada
     * @author Gabriel Mendes Medeiros 
     */

    public void setIdade(int idade){
        this.idade = idade;
    }

    /**
     * Adiciona uma linha de descrição ao histórico do animal
     * @param descricao informação a ser adicionada
     * @author Gabriel Mendes Medeiros 
     */

    public void adicionarHistorico(String descricao){
        historico = historico + descricao + "; \n";
    }

    /**
     * Getter da variavel historico
     * @return O historico do animal
     * @author Gabriel Mendes Medeiros 
     */

    public String getHistorico(){
        return this.historico;
    }

}
