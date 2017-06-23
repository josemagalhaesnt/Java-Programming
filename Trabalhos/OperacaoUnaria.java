package atividadepratica;

public abstract class OperacaoUnaria extends Operacao {

	/** Construtor **/
	public OperacaoUnaria(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}

	/** M�todos **/
	public abstract float calculaResultado(Operando o);
	//return resultado
}
