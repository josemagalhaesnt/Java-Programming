package atividadepratica;

public class OperacaoDiv extends OperacaoBinaria {
	
	/** Atributos **/
	float resultado = 0;
	float[] num;
	
	/** Construtor **/
	public OperacaoDiv(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {
		try {
			try {
				if (operandos.length == 2) {
					if (operandos[0].getValor() > 0 || operandos[1].getValor() > 0){
						float resultado = operandos[0].getValor() / operandos[1].getValor();
						return resultado;
					}
				}
				else if (operandos.length == 1){
					if (operandos[0].getValor() > 0 || operandos[1].getValor() > 0){ 
						float resultado = operandos[0].getValor();
						return resultado;
					}
				}
			} catch (DivisaoPorZeroException e){
				e.getMessage();
			}
			
		} catch (NumeroOperandosException e){
			e.getMessage();
		}
		
		return 0;
	}

}
