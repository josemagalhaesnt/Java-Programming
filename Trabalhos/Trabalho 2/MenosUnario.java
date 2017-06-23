package atividadepratica;

public class MenosUnario extends OperacaoUnaria {
	
	/** Construtor **/
	public MenosUnario(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando o) {
		return 0;
	}

}
