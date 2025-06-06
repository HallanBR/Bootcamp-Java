package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[]args){

        List<String> list = new ArrayList<>();
//Adiciona conteudo a lista
        list.add("Maria");
        list.add("Anna");
        list.add("Jose");
        list.add("Marco");
        list.add("Augusto");
        list.add(2, "Bob"); // adiciona BOB no espaco reservado 2
//Imprime o tamanho da lista, a quantidade de elementos dentro da mesma
        System.out.println(list.size());
// Imprime os elementos da lista
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-----------------------------------");
// Remove os elementos da lista que comecam com M
        list.removeIf(x -> x.charAt(0) == 'M');
// Imprime os elementos da lista
        for (String x : list){
            System.out.println(x);
        }

// Imprime o 1 ou -1, como sendo true ou falso, se o elemento existir na lista ou nao
        System.out.println("-----------------------------------");
        System.out.println("Inde of Bob: " + list.indexOf("Bob"));
        System.out.println("Inde of Marco: " + list.indexOf("Marco"));
        System.out.println("-----------------------------------");

// Tranforma a lista em STREAM, filta pelos elementos que inicial com A, e retorna para Lista novamente
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
// Imprime os elementos da lista
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-----------------------------------");
// Imprime os elementos filtrados que comecam com J, caso nao possua nenhum, ele retorna NULO
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
        








    }
}
