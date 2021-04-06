package Creational.Singleton;

/*
 * O Controlador tem uma instancia unica.
 */
public class Controlador {

	private static Controlador controlador;	
	private Controlador() {};
	
	public void write(String msg) {
		System.out.println(this.toString() + ":" + msg);
	};
	 
	
	public static Controlador getInstance() {
		if(controlador == null) {
			controlador = new Controlador();
		}
		return controlador;
	}
}
