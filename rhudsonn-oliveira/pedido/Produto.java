package pedido;

public class Produto {

    private String nomeProduto;
    private double precoUnitario;
    private int quantidade;

    public Produto(){

    }

    public Produto(String nomeProduto, double precoUnitario, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double somar(double precoUnitario, int quantidade){
        return quantidade * precoUnitario;
    }



    public String imprimirProduto(){
        System.out.printf("Nome produto:" + nomeProduto);
        System.out.printf("Preço: "+ precoUnitario);
        System.out.printf("Quantidade:"+ quantidade);
        System.out.printf("total:"+ somar(precoUnitario,quantidade));
        return imprimirProduto();
    }
}
