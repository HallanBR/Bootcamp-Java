import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Cria um objeto Scanner para ler a entrada do usuário
		Scanner sc = new Scanner(System.in);
		
		// Lê as dimensões da matriz (m linhas e n colunas)
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n]; // Inicializa a matriz
		
		// Preenche a matriz com os valores fornecidos pelo usuário
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt(); // Lê cada elemento da matriz
			}
		}
		
		// Lê o valor alvo para buscar na matriz
		int x = sc.nextInt();
		
		// Itera pela matriz para encontrar ocorrências do valor alvo
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) { // Verifica se o elemento atual corresponde ao valor alvo
					System.out.println("Posição " + i + "," + j + ":"); // Imprime a posição da correspondência
					
					// Verifica e imprime o valor à esquerda (se existir)
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					
					// Verifica e imprime o valor acima (se existir)
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					
					// Verifica e imprime o valor à direita (se existir)
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					
					// Verifica e imprime o valor abaixo (se existir)
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}
		
		// Fecha o objeto Scanner para liberar recursos
		sc.close();
	}
}