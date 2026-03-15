package pedido;

/**
 * 4)<br>
 *
 * Múltiplas responsabilidades na mesma classe.<br>
 *
 * A classe Pedido cuida de:<br>
 *
 * Dados do cliente (nome, email).<br>
 *
 * Dados do produto (nome, preço).<br>
 *
 * Lógica de cálculo (total do pedido).<br>
 *
 * Apresentação (impressão no console).<br><br>
 *
 * Isso viola o Princípio da Responsabilidade Única (SRP).
 *
 *
 * Os atributos não pertencem todos ao mesmo “conceito”:<br><br>
 *
 * Cliente ≠ Produto ≠ Pedido.<br>
 *
 * Alterações em cliente ou produto impactam diretamente o pedido.<br><br>
 *
 *
 * Não é possível reutilizar Cliente ou Produto em outro contexto.<br>
 *
 * Se um cliente fizer vários pedidos, os dados ficam duplicados.<br>
 *
 * Um produto não pode ser compartilhado entre pedidos.<br>
 *
 */
public class Pedido {

    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }

    public void imprimirResumo() {
        System.out.println("\n-----------------------------------");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço unitário: " + produto.getPreco());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + calcularTotal());
    }
}


    //_________________________________________________________________________________

    //private String nomeCliente;
    //private String emailCliente;

    // private String nomeProduto;
    //private double precoUnitario;
    //private int quantidade;


    //public double calcularTotal() {
      //  return precoUnitario * quantidade;
    //}

   // public void imprimirResumo() {
      //  System.out.println("Cliente: " + nomeCliente);
      //  System.out.println("Email: " + emailCliente);
      //  System.out.println("Produto: " + nomeProduto);
      //  System.out.println("Preço unitário: " + precoUnitario);
      //  System.out.println("Quantidade: " + quantidade);
      //  System.out.println("Total: " + calcularTotal());
   // }
