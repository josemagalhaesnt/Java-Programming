package atividadepratica;

public class DivisaoPorZeroException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	
	/** Construtor **/
	
	public DivisaoPorZeroException (String mensagem){
		 this.mensagem = mensagem;
	}
	
	public DivisaoPorZeroException(){}
	
	/** Métodos **/
	@Override
	public String getMessage(){
		return this.mensagem;
	}
	
	@Override
	public String toString (){
		return super.getMessage();
	}

}
