package atividadepratica;

public class NumeroOperandosException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	String mensagem;

	/** Construtor **/
	public NumeroOperandosException (){
		 this.mensagem = "Numero de operandos invalidos, apenas 1 ou 2 operandos sao permitidos";	
	}
	public NumeroOperandosException (String mensagem){
		 this.mensagem = "Numero de operandos invalidos, apenas 1 ou 2 operandos sao permitidos";	
	}
	
	/** Métodos **/
	@Override
	public String toString (){
		return super.getMessage();
	}
}
