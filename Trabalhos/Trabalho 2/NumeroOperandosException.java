package atividadepratica;

public class NumeroOperandosException extends RuntimeException {

	/** Construtor **/
	public NumeroOperandosException (String mensagem){
		 mensagem = "Numero de operandos invalidos, apenas 1 ou 2 operandos sao permitidos";
		
	}
	
	/** Métodos **/
	@Override
	public String toString (){
		return super.getMessage();
	}
}
