package Behavioral.ChainOfResponsability;

public interface IContadorHandler {

	void setProximaNotaHanlder(IContadorHandler handler);
	
	 void sacar(int valor);
	
}
