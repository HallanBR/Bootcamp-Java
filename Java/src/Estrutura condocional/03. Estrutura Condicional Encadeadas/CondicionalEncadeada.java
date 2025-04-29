public class CondicionalEncadeada {

    public static void main(String[] args){

        // Declaração da variável 'nota' com valor inicial 90
        int nota = 90;

        // Verifica se a nota está entre 90 e 100 (inclusive)
        if (nota >=90 && nota <= 100){
            System.out.println("Nota A"); // Imprime "Nota A" se a condição for verdadeira
        } 
        // Verifica se a nota está entre 80 (inclusive) e 90
        else if (nota >= 80 && nota < 90){
            System.out.println("Nota B"); // Imprime "Nota B" se a condição for verdadeira
        } 
        // Verifica se a nota está entre 70 (inclusive) e 80
        else if (nota >= 70 && nota < 80){
            System.out.println("Nota C"); // Imprime "Nota C" se a condição for verdadeira
        } 
        // Verifica se a nota está entre 60 (inclusive) e 70
        else if (nota >= 60 && nota < 70){
            System.out.println("Nota D"); // Imprime "Nota D" se a condição for verdadeira
        } 
        // Verifica se a nota está entre 0 (inclusive) e 60
        else if (nota >= 0 && nota < 60){
            System.out.println("Nota F"); // Imprime "Nota F" se a condição for verdadeira
        } 
        // Caso nenhuma das condições acima seja atendida
        else {
            System.out.println("Nota inválida"); // Imprime "Nota inválida" para valores fora do intervalo esperado
        }        
    }
    
}
