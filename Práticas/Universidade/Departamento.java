package universidade;
public class Departamento {
    
	// Atributos
    private Professor coordenador;
    private String nome;
    private String curso;
    private String sigla;
    
    //Construtores
    public Departamento (String nome, String curso, String sigla){
    	this.coordenador = null;
    	this.nome = nome;
    	this.curso = curso;
    	this.sigla = sigla;
    }
    
    //Getters e Setters

	public Professor getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	//Métodos 
	
	public void mostrarInfo(){
		System.out.println(this.getSigla() + " - " + this.getNome());
		System.out.println("Curso: " + this.getCurso());
		System.out.println("Coordenador: " + this.coordenador.getNome());
	}

}
