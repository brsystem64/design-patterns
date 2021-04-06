package App;

import Behavioral.ChainOfResponsability.NotaCemHandler;
import Behavioral.ChainOfResponsability.NotaCincoHandler;
import Behavioral.ChainOfResponsability.NotaCinquentaHandler;
import Behavioral.ChainOfResponsability.NotaDezHandler;
import Behavioral.ChainOfResponsability.NotaDoisHandler;
import Behavioral.ChainOfResponsability.NotaUmHandler;
import Behavioral.ChainOfResponsability.NotaVinteHandler;
import Behavioral.Strategy.CalculadoraImpostos;
import Behavioral.Strategy.ICMS;
import Behavioral.Strategy.IPI;

public class Application {

	public static void main(String[] args) {
		Application.chainOfResponsability();
	}
	
	public static void strategy() {
	    CalculadoraImpostos calculadora = new CalculadoraImpostos(); 
	    ICMS icms = new ICMS(100.0); 
	    IPI  ipi  = new IPI(100.0); 
	    System.out.println(calculadora.calcular(icms)); 
	    System.out.println(calculadora.calcular(ipi));
	}
	
	public static void chainOfResponsability() {
		
		NotaCemHandler 		 handler100 = new NotaCemHandler();
		NotaCinquentaHandler handler50 = new NotaCinquentaHandler();
		NotaVinteHandler     handler20 = new NotaVinteHandler();
		NotaDezHandler 		 handler10 = new NotaDezHandler();
		NotaCincoHandler     handler5 = new NotaCincoHandler();
		NotaDoisHandler 	 handler2 = new NotaDoisHandler();
		NotaUmHandler		 handler1 = new NotaUmHandler();
		
		handler100.setProximaNotaHanlder(handler50);
		handler50.setProximaNotaHanlder(handler20);
		handler20.setProximaNotaHanlder(handler10);
		handler10.setProximaNotaHanlder(handler5);
		handler5.setProximaNotaHanlder(handler2);
		handler2.setProximaNotaHanlder(handler1);
		
		handler100.sacar(28);
	}
}
