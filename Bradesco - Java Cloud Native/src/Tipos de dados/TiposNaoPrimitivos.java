public class TiposNaoPrimitivos {
    
    public static void main(String[] args) {

        // String (sequência de caracteres)
        String nome = "João da Silva"; // Declaração e inicialização de uma variável do tipo String

        // Array (coleção de elementos do mesmo tipo)
        int[] numeros = {1, 2, 3, 4, 5}; // Declaração e inicialização de um array de inteiros

        // Classe (tipo definido pelo usuário)
        Pessoa pessoa = new Pessoa("Maria", 25); // Criação de um objeto da classe Pessoa

        // Imprimindo os valores
        System.out.println("Nome: " + nome); // Imprime o valor da variável nome

        System.out.print("Números: "); // Imprime o texto "Números: "
        for (int numero : numeros) { // Loop para iterar sobre os elementos do array
            System.out.print(numero + " "); // Imprime cada número do array seguido de um espaço
        }
        System.out.println(); // Imprime uma nova linha

        System.out.println("Pessoa: " + pessoa.nome + ", " + pessoa.idade); // Imprime os atributos do objeto pessoa
    }
}

// Classe Pessoa (exemplo de tipo definido pelo usuário)
class Pessoa {
    String nome; // Atributo para armazenar o nome da pessoa
    int idade; // Atributo para armazenar a idade da pessoa

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome; // Inicializa o atributo nome com o valor passado como argumento
        this.idade = idade; // Inicializa o atributo idade com o valor passado como argumento
    }
}