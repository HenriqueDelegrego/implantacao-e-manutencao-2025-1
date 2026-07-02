
/**
 * 1)<br>
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.<br>
 * 
 * Violação do princípio aberto/fechado.<br>
 * 
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco {

	private double preco;
	private static final double imposto = 0.10;

	public double calcular(double preco){
		double resultado = preco;
		double taxa = imposto/100;

		resultado =resultado + (preco * imposto);
		return resultado;
	}



	public static void main(String[] args) {

		CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();
		System.out.println(calculadoraDePreco.calcular(100));
	}

}