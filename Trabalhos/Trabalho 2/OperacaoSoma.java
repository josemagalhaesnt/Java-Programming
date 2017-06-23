package atividadepratica;

public class OperacaoSoma extends OperacaoBinaria {
	
	/** Atributos **/
	float resultado = 0;
	float[] num;
	
	/** Construtor **/
	public OperacaoSoma(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {
		int i;
		
		for (i = 0; i < 2; i++)
			num[i] = operandos[i].getValor();
		
		this.resultado = num[0] + num[1];
		return this.resultado;
	}
}
