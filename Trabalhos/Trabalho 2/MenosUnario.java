package atividadepratica;

public class MenosUnario extends OperacaoUnaria {
	
	/** Construtor **/
	public MenosUnario(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {
		float resultado = 0;
		
			if (operandos.length == 1)
				resultado -= operandos[0].getValor();
			
		return resultado;
	}
	
	public boolean validaOp(Operando...operandos) throws NumeroOperandosException{
		if (operandos.length == 1){ 
			return true;
		}

		else 
			throw new NumeroOperandosException();	
	}
}



