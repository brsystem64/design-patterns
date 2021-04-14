package Creational.FactoryMethod;

public class HamburguerFactory implements BaseFactory {

	@Override
	public Produto criar() {
		return new Hamburguer();
	}

}
