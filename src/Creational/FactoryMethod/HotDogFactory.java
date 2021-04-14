package Creational.FactoryMethod;

public class HotDogFactory implements BaseFactory{

	@Override
	public Produto criar() {
		return new HotDog();
	}

}
