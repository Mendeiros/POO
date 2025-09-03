public class Tutor {
    private String nome;
    private String telefone;
    private String endereco;

    /**
     * Inicializador simplificado para cadastro de tutor em uma clinica veterinária
     * 
     * @param nome nome do tutor 
     * @param telefone numero de telefone do tutor
     * 
     * @throws IllegalArgumentException lança a excessão de argumento ilegal quando telefone não é inserido
     * 
     * @author Gabriel Mendes Medeiros 
     */

    public Tutor(String nome, String telefone){
        try {
            this.nome = nome;
            this.endereco = "Indefinido";
            if (telefone == null || telefone == ""){
                throw new IllegalArgumentException("Cadastro negado, telefone não pode estar vazio!");
            } else {
                this.telefone = telefone;
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
            
    }

    /**
     * Inicializador simplificado para cadastro de tutor em uma clinica veterinária
     * 
     * @param nome nome do tutor 
     * @param telefone numero de telefone do tutor
     * @param endereco endereco de moradia do tutor
     * 
     * @throws IllegalArgumentException lança a excessão de argumento ilegal quando telefone não é inserido
     * 
     * @author Gabriel Mendes Medeiros 
     */

    public Tutor(String nome, String telefone, String endereco){
        try {
            this.nome = nome;
            this.endereco = endereco;
            if (telefone == ""){
                throw new IllegalArgumentException("Cadastro negado, telefone não pode estar vazio!");
            } else {
                this.telefone = telefone;
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Getter da variavel nome
     * @return O nome do tutor
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
     * Getter da variavel de telefone
     * @return O telefone do tutor
     * @author Gabriel Mendes Medeiros 
     */
    
    public String getTelefone(){
        return this.telefone;
    }

    /**
     * Setter da variavel telefone
     * @param telefone telefone a ser settado
     * @author Gabriel Mendes Medeiros 
     */

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    /**
     * Getter da variavel endereco
     * @return O endereco do tutor
     * @author Gabriel Mendes Medeiros 
     */

    public String getEndereco(){
        return this.endereco;
    }

    /**
     * Setter da variavel endereco
     * @param endereco Endereço a ser settado
     * @author Gabriel Mendes Medeiros 
     */

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
