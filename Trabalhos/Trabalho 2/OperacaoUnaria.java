package atividadepratica;

public abstract class OperacaoUnaria extends Operacao {
	
	/** Construtor **/
	public OperacaoUnaria(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}

	/** Métodos **/
	public abstract float calculaResultado(Operando...operandos);
	//return resultado
}
