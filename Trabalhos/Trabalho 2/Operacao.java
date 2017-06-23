package atividadepratica;

public abstract class Operacao {
	
	/** Atributos **/
	protected String nome;
	protected String simboloOperador;
	
	/** Construtor **/
	public Operacao(String nome, String simboloOperador) {
		this.nome = nome;
		this.simboloOperador = simboloOperador;
	}
	
	/** Getters and Setters **/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSimboloOperador() {
		return simboloOperador;
	}
	public void setSimboloOperador(String simboloOperador) {
		this.simboloOperador = simboloOperador;
	}
	
	/** Métodos **/
	public abstract float calculaResultado (Operando ...operandos);
	//return resultado
}
