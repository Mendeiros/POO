public class Main {
    
    public static void main(String[] args) {
        Tutor[] tutores = new Tutor[2];
        Animal[] animais = new Animal[3];
        tutores[0] = new Tutor("Jon Arbuckle", null, "711 Maple Street");
        tutores[1] = new Tutor("Liz Wilson", "");
        animais[0] = new Animal("Garfield", "Gato", 47);
        animais[1] = new Animal("Odie", "Cachorro", -3);
        animais[2] = new Animal("Arlene", 45);

        animais[0].adicionarHistorico("Comeu lasanha");

        for (int i = 0; i < tutores.length; i++){
            Tutor tutorCadastrado = tutores[i];
            System.out.println(tutorCadastrado.getNome());
            System.out.println(tutorCadastrado.getTelefone());
            System.out.println(tutorCadastrado.getEndereco());
        }

        for (int i = 0; i < animais.length; i++){
            Animal animalCadastrado = animais[i];
            System.out.println(animalCadastrado.getNome());
            System.out.println(animalCadastrado.getEspecie());
            System.out.println(animalCadastrado.getIdade());
            System.out.println(animalCadastrado.getHistorico());
        }
    }
}
