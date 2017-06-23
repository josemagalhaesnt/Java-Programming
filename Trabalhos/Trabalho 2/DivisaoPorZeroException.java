package atividadepratica;

public class DivisaoPorZeroException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem = "Nao eh possivel dividir um numero por zero";
	
	/** Construtor **/
	public DivisaoPorZeroException (String mensagem){
		 this.mensagem = mensagem;
	}
	
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
