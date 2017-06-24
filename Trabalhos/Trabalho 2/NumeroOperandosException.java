package atividadepratica;

public class NumeroOperandosException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	String mensagem;

	/** Construtor **/
	
	public NumeroOperandosException (String mensagem){
		 this.mensagem = mensagem;	
	}
	
	public NumeroOperandosException (){	
	}
	
	/** Métodos **/
	@Override
	public String toString (){
		return super.getMessage();
	}
}
