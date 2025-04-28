public class ModificadoresDeStrings {
    public static void main(String[] args){

        // String original para realizar as operações
        String original = "abcde FGHIJ ABC abc DEFG ";

        // Converte a string para letras minúsculas
        String s01 = original.toLowerCase();

        // Converte a string para letras maiúsculas
        String s02 = original.toUpperCase();

        // Remove espaços em branco no início e no final da string
        String s03 = original.trim();

        // Retorna uma substring a partir do índice 2
        String s04 = original.substring(2);

        // Retorna uma substring do índice 2 ao índice 9 (exclusivo)
        String s05 = original.substring(2, 9);

        // Substitui todas as ocorrências do caractere 'a' por 'x'
        String s06 = original.replace('a', 'x');

        // Substitui todas as ocorrências da substring "abc" por "xy"
        String s07 = original.replace("abc", "xy");

        // Retorna o índice da primeira ocorrência da substring "bc"
        int i = original.indexOf("bc");

        // Retorna o índice da última ocorrência da substring "bc"
        int j = original.lastIndexOf("bc");

        // Imprime a string original
        System.out.println("Original: -" + original + "-");

        // Imprime a string em letras minúsculas
        System.out.println("toLowerCase: -" + s01 + "-");

        // Imprime a string em letras maiúsculas
        System.out.println("toUpperCase: -" + s02 + "-");

        // Imprime a string sem espaços em branco nas extremidades
        System.out.println("trim: -" + s03 + "-");

        // Imprime a substring a partir do índice 2
        System.out.println("substring(2): -" + s04 + "-");

        // Imprime a substring do índice 2 ao índice 9
        System.out.println("substring(2, 9): -" + s05 + "-");

        // Imprime a string com 'a' substituído por 'x'
        System.out.println("replace('a', 'x'): -" + s06 + "-");

        // Imprime a string com "abc" substituído por "xy"
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");

        // Imprime o índice da primeira ocorrência de "bc"
        System.out.println("Index of 'bc': " + i);

        // Imprime o índice da última ocorrência de "bc"
        System.out.println("Last index of 'bc': " + j);
    }
}
