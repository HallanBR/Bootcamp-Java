public class Program{

    public static void main(String[] args){

        String[] vetor = new String[] {"Maria", "Bob", "Alex"};

        //imprimindo cada elemento dentro do vetor
        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }

        //imprimindo cada elemendo dentro do vetor utilizando a regra "for each"
        System.out.println("-------------------");
        for (String apelido : vetor){
            System.out.println(apelido);
        }


    }
}