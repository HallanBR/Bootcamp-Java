import Entities.Products;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Products products = new Products();
        System.out.println("Adicione um novo produto:");
        System.out.println("Nome: ");
        products.name = sc.nextLine();
        System.out.println("Insira o preco");
        products.price = sc.nextDouble();
        System.out.println("Insira a quantidade");
        products.quantity = sc.nextInt();

        //* 5. Exibe as informações do produto utilizando o método toString() da classe Products.
        System.out.println(products);

        System.out.println();

        System.out.println("Insira a quantidade de produtos que deseja adicionar");
        int quantity = sc.nextInt();
        products.addProducts(quantity);
        System.out.println();
        System.out.println("Dados atualizados: " + products);

        System.out.println("Insira a quantidade de produtos que deseja remover");
        quantity = sc.nextInt();
        products.removeProducts(quantity); 
        System.out.println();
        System.out.println("Dados atualizados: " + products);





        sc.close();
    }
}
