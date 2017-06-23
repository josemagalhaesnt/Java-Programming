package atividadepratica;

public class MenosUnario extends OperacaoUnaria {
	
	/** Construtor **/
	public MenosUnario(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}
	
	/** M�todos **/
	@Override
	public float calculaResultado(Operando o) {
		return 0;
	}

}
