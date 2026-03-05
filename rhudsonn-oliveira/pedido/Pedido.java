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

    Cliente cliente = new Cliente();
    Produto produto = new Produto();

    Cliente c1 = new Cliente("Nome","rhudsonn@");
    Produto p1 = new Produto("Blusa",2.0,2);
    


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
}