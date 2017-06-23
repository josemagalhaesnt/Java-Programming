package atividadepratica;

public class Operando extends Numero {
	
	/** Construtor **/
	public Operando (float valor){
		super(valor);
	}
	
	/** Métodos **/
	public float avaliar (Operando...operandos){
		if (operandos.length > 2){
			throw new NumeroOperandosException();
		}
		else 
			return super.valor;	
	}
}
