import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

System.out.println("Escolha o tipo de combustivel:");
        System.out.println("1 - Alcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Sair");
        // Exibe as opções de combustível para o usuário

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = scanner.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                alcool = alcool + 1;
            }
            else if(tipo ==2){
                gasolina = gasolina + 1;
            }
            else if (tipo == 3){
                diesel = diesel + 1;
            }
            tipo = scanner.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        // Exibe a quantidade de cada tipo de combustível

        scanner.close();
        // Fecha o objeto Scanner para liberar recursos

        
    }
}
