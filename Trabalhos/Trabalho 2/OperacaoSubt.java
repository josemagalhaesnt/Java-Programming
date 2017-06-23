package atividadepratica;

public class OperacaoSubt extends OperacaoBinaria {
	
	/** Construtor **/
	public OperacaoSubt(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {

		try {
			if (operandos.length == 2) {
				float resultado = operandos[0].getValor() - operandos[1].getValor();
				return resultado;
			}
			else if (operandos.length == 1){
				float resultado = operandos[0].getValor();
				return resultado;
			}
		} catch (NumeroOperandosException e){
			e.getMessage();
		}
		
		return 0;
	}

}
