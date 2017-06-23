package atividadepratica;

public class OperacaoDiv extends OperacaoBinaria {

private float resultado = 0;
	
	/** Construtor **/
	public OperacaoDiv(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	
	}
	/** Métodos **/
	@Override
	public float calculaResultado(Operando o) {
		float numero = o.getValor();
		this.resultado /= numero;
		return this.resultado;
	}

}
