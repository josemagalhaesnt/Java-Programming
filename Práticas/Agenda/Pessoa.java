public class Pessoa {
	
	/* Atributos */

	private String nome;
	private int idade;
	private String telefone;
	private String email;

	/* Construtor padrão */

	public Pessoa (){}
	
	/* Construtor com atributos */

	public Pessoa (String nome, int idade, String telefone, String email) {

		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
	
	}

	/* Getters and Setters */
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;	
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;	
	}

	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;	
	}

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;	
	}


	
	

}
