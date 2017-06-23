package atividadepratica;

public class OperacaoSoma extends OperacaoBinaria {
	
	private float resultado = 0;
	
	public OperacaoSoma(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}

	@Override
	public float calculaResultado(Operando o) {
		float numero = o.getValor();
		this.resultado += numero;
		return this.resultado;
	}
}
