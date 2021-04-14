package Creational.FactoryMethod;

public class Hamburguer implements Produto {

	@Override
	public void mostrarIngredientes() {
		System.out.println("Pão, carne, queijo");
	}

}
