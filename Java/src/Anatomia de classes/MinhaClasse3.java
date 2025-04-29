public class MinhaClasse3 {
    public static void main(String[] args) {
        // Chama o método NomeCompleto passando "Joao" e "Silva" como argumentos e imprime o resultado
        System.out.println(NomeCompleto("Joao", "Silva"));      
    }

    // Método que recebe dois parâmetros (nome e sobrenome) e retorna a concatenação dos dois com um espaço entre eles
    public static String NomeCompleto (String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }
}
