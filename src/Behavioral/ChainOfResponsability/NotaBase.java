package Behavioral.ChainOfResponsability;

abstract class NotaBase implements IContadorHandler{

	protected int valorNota;
	protected int qtdeDisponivel;
	
	private IContadorHandler handler;
	
	public NotaBase(int valor, int quantidade) {
		this.valorNota = valor;
		this.qtdeDisponivel = quantidade;
	}
	
	@Override
	public void setProximaNotaHanlder(IContadorHandler handler) {
		this.handler = handler;
	}

	@Override
	public void sacar(int valor) {
		if(valor < valorNota) {
			if(isNextHandlerNull()) {
				System.out.println("Os valores das notas sao insuficientes");
				return;
			}
			handler.sacar(valor);
			return;
		}
		
		int qtdNotas = valor / valorNota;
		int restante = valor % valorNota;
		
		if(qtdNotas > qtdeDisponivel) {
			restante += ((qtdNotas - qtdeDisponivel) * valorNota);
			qtdNotas = qtdeDisponivel;
		}
		
		System.out.println("Nota:" + valorNota+ "... Qtde:" + qtdNotas + "... Acu:"+ (qtdNotas * valorNota));
		if(restante != 0) {
			if(isNextHandlerNull()) {
				System.out.println("A quantidade das notas sao insuficientes");
				return;
			}
			handler.sacar(restante);
		}
	}
	
	private boolean isNextHandlerNull() {
		return (handler == null);
	}
	

}
