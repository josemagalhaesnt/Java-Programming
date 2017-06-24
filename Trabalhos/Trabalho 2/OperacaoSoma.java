package atividadepratica;

public class OperacaoSoma extends OperacaoBinaria {
	
	/** Construtor **/
	public OperacaoSoma(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {
		float resultado = 0;
		
		if (operandos.length == 2){
			resultado = operandos[0].getValor() + operandos[1].getValor();
		}
		else if (operandos.length == 1) {
			resultado = operandos[0].getValor();
		}
		return resultado;
	}
	
	public boolean validaOp(Operando...operandos) throws NumeroOperandosException{
			if (operandos.length == 2)
				return true;
			else 
				throw new NumeroOperandosException();	
	}
	
}

