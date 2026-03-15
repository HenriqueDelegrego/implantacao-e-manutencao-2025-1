package pedido;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Rhudsonn", "rhudsonnoliveira2@email.com");

        Produto produto = new Produto("Pc", 3500.00);

        Pedido pedido = new Pedido(cliente, produto, 2);

        pedido.imprimirResumo();
    }
}