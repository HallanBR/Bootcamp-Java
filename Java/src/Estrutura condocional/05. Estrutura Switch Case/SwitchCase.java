public class SwitchCase {
 
    public static void main(String[] args) {
        
        int diaDaSemana = 7; // Variável que representa o dia da semana (1 a 7)
        String nomeDoDia; // Variável para armazenar o nome do dia da semana
        // Estrutura switch para determinar o nome do dia da semana com base no número

        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo"; // Se diaDaSemana for 1, nomeDoDia será "Domingo"
                break; // Sai do switch após executar este caso
            case 2:
                nomeDoDia = "Segunda-feira"; // Se diaDaSemana for 2, nomeDoDia será "Segunda-feira"
                break; // Sai do switch após executar este caso
            case 3:
                nomeDoDia = "Terça-feira"; // Se diaDaSemana for 3, nomeDoDia será "Terça-feira"
                break; // Sai do switch após executar este caso
            case 4:
                nomeDoDia = "Quarta-feira"; // Se diaDaSemana for 4, nomeDoDia será "Quarta-feira"
                break; // Sai do switch após executar este caso
            case 5:
                nomeDoDia = "Quinta-feira"; // Se diaDaSemana for 5, nomeDoDia será "Quinta-feira"
                break; // Sai do switch após executar este caso
            case 6:
                nomeDoDia = "Sexta-feira"; // Se diaDaSemana for 6, nomeDoDia será "Sexta-feira"
                break; // Sai do switch após executar este caso
            case 7:
                nomeDoDia = "Sábado"; // Se diaDaSemana for 7, nomeDoDia será "Sábado"
                break; // Sai do switch após executar este caso
            default: 
                nomeDoDia = "Valor inválido"; // Caso nenhum dos casos anteriores seja atendido, atribui um valor padrão
        }
        // Exibe o nome do dia da semana correspondente ao número informado
        System.out.println("O dia da semana é: " + nomeDoDia);



    }
}
