package atividadepratica;

public class OperacaoDiv extends OperacaoBinaria {
	
	/** Construtor **/
	public OperacaoDiv(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	
	}

	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {
		float resultado = 0;		
		if (operandos.length == 2) {
			if (operandos[0].getValor() > 0 || operandos[1].getValor() > 0){
				resultado = operandos[0].getValor() / operandos[1].getValor();
			}
		}
		
		else if (operandos.length == 1){
			if (operandos[0].getValor() > 0 || operandos[1].getValor() > 0){ 
				resultado = operandos[0].getValor();
			}
		}
		return resultado;
	}
	
	public boolean validaOp(Operando...operandos) throws DivisaoPorZeroException, NumeroOperandosException{
		
				if (operandos.length == 2) {
					if (operandos[0].getValor() != 0 && operandos[1].getValor() != 0){
						return true;
				}
					if (operandos[0].getValor() == 0 || operandos[1].getValor() == 0)
						throw new DivisaoPorZeroException();
					}
				else
					throw new NumeroOperandosException();
	
		return false;
	}
	
}



