package atividadepratica;

public abstract class OperacaoBinaria extends Operacao {

	/** Construtor **/
	public OperacaoBinaria(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}

	/** M�todos **/
	public abstract float calculaResultado(Operando o);
	//return resultado
}
