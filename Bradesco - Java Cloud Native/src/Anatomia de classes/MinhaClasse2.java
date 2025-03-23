public class MinhaClasse2 {
    
    public static void main(String[] args) {
        int ano = 2021;
        ano = 2022;
        System.out.println(ano);


        final String BR = "Brasil";
        /*BR = brazil;*/ /*Isso nao pode ser feito pois a string BR foi definida acima como final, portanto nao pode ser alterada quando eu a chamar novamente */
        System.out.println(BR);

    }
}
