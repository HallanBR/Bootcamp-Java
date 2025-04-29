package Operadores;

public class OperadoresJava {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10;
        int b = 20;

        // Exibe operações aritméticas básicas
        System.out.println("\nOperadores Aritimeticos");
        System.out.println("a + b = " + (a + b)); // Soma
        System.out.println("a - b = " + (a - b)); // Subtração
        System.out.println("a * b = " + (a * b)); // Multiplicação
        System.out.println("a / b = " + (a / b)); // Divisão
        System.out.println("a % b = " + (a % b)); // Módulo (resto da divisão)
        System.out.println("a++ = " + (a++)); // Incremento (pós-incremento)
        System.out.println("++b = " + (++b)); // Incremento (pré-incremento)
        System.out.println("a-- = " + (a--)); // Decremento (pós-decremento)
        System.out.println("--b = " + (--b)); // Decremento (pré-decremento)


        // Operadores de Atribuição
        int c = 10;
        System.out.println("\nOperadores de Atribuicao");
        System.out.println("c = " + c); // Atribuição simples

        // Realiza operações de atribuição compostas
        c += 5; 
        System.out.println("c += 5 = " + c); // Adição e atribuição
        c -= 3; 
        System.out.println("c -= 3 = " +c); // Subtração e atribuição
        c *= 2;
        System.out.println("c *= 2 = " + c); // Multiplicação e atribuição
        c /= 4;
        System.out.println("c /= 4 = " + c); // Divisão e atribuição
        c %= 3;
        System.out.println("c %= 3 = " + c); // Módulo e atribuição


        // Operadores Relacionais
        int x = 10; // Declarando x
        int y = 5;
        
        // Exibe operações relacionais
        System.out.println("\nOperadores Relacionais");
        System.out.println("x == y = " + (x == y)); // Igual a
        System.out.println("x != y = " + (x != y)); // Diferente de
        System.out.println("x > y = " + (x > y)); // Maior que
        System.out.println("x < y = " + (x < y)); // Menor que
        System.out.println("x >= y = " + (x >= y)); // Maior ou igual a
        System.out.println("x <= y = " + (x <= y)); // Menor ou igual a


        // Operadores Lógicos
        boolean p = true; // Declarando p
        boolean q = false; // Declarando q
        
        // Exibe operações lógicas
        System.out.println("\nOperadores Logicos");
        System.out.println("p && q = " + (p && q)); // E lógico
        System.out.println("p || q = " + (p || q)); // Ou lógico
        System.out.println("!p = " + !p); // Negação lógica
        System.out.println("!q = " + !q); // Negação lógica

        
        // Operadores Ternarios
        int idade = 20;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("\nOperadores Ternarios");
        System.out.println(resultado);
        System.out.println(idade + " anos");


        // Operadores Bitwise
        int num1 = 5; // Representacao binaria: 0101
        int num2 = 3; // Representacao binaria: 0011

        // Exibe operações bitwise
        System.out.println("\nOperadores Bitwise");
        System.out.println("num1 & num2 = " + (num2 & num2)); // E bit a bit
        System.out.println("num1 | num2 = " + (num1 | num2)); // Ou bit a bit
        System.out.println("num1 ^ num2 = " + (num1 ^ num2)); // Ou exclusivo bit a bit
        System.out.println("~num1 = " + ~num1); // Negação bit a bit
        System.out.println("num1 << 1 = " + (num1 << 1)); // Deslocamento a esquerda
        System.out.println("num1 >> 1 = " + (num1 >> 1)); // Deslocamento a direita
        System.out.println("num1 >>> 1 = " + (num1 >>> 1)); // Deslocamento a direita sem sinal




    }
}
