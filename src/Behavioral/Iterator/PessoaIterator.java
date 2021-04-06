package Behavioral.Iterator;

public class PessoaIterator implements Iterator<Pessoa> {
	private Pessoa[] pessoas;
	private int index;
	private int max;
	public PessoaIterator(Pessoa[] pessoas) {
		index = 0;
		max = pessoas.length;
		this.pessoas = pessoas;
	}

	@Override
	public Pessoa next() {
		if(hasNext()) {
			++index;
			return (Pessoa) pessoas[index-1];
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return index < max;
	}
	
	public void resetIndex() {
		index = 0;
	}
}
