package pedido;

public class Cliente {

    private String nomeCliente;
    private String emailCliente;

    public Cliente(){

    }
    public Cliente(String nomeCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
