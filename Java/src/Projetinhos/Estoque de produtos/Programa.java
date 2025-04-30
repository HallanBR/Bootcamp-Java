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
        System.out.println(products.name + ", " + products.price + ", " + products.quantity);





        sc.close();
    }
}
