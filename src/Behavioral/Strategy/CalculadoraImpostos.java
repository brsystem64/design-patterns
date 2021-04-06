package Behavioral.Strategy;

/*
 * No padrao Strategy o método recebe qualquer objeto que implemente a interface parametrizada.
 */
public class CalculadoraImpostos {

	public double calcular(Imposto imposto) {
		return imposto.calcular();
	}
}
