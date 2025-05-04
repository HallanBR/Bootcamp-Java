package Entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts (int quantity){
        this.quantity += quantity;
    }

    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }
    /**
     * O método toString é uma sobrescrita do método padrão da classe Object.
     * Ele é utilizado para fornecer uma representação textual do objeto.
     * 
     * Neste caso, o método retorna uma string formatada contendo:
     * - O nome do produto.
     * - O preço do produto formatado com duas casas decimais.
     * - A quantidade de unidades disponíveis no estoque.
     * - O valor total em estoque, calculado pelo método totalValueInStock().
     * 
     * Essa representação é útil para exibir informações detalhadas do produto
     * de forma legível e organizada.
     * 
     * @return Uma string contendo os detalhes do produto formatados.
     */
    public String toString(){
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, total: $ "
        + String.format("%.2f", totalValueInStock());
    
    }





}
