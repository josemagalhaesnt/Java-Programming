package atividadepratica;

public class MenosUnario extends OperacaoUnaria {
	
	/** Atributos **/
	float resultado = 0;
	float[] num;
	
	/** Construtor **/
	public MenosUnario(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {
		int i;
		for (i = 0; i < 1; i ++)
			num[i] = operandos[i].getValor();
		
		this.resultado -= num[0];
		
		return this.resultado;
	}

}
