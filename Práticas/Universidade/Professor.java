package universidade;
public class Professor extends Funcionario {
    // Atributos
    private String areaDeAtuacao;
    private Departamento departamento;
    private int qtDeAulas; //Semanais
    
    //Construtores
    public Professor (Funcionario f, String areaDeAtuacao, Departamento departamento, 
    		int qtDeAulas) {
    	
        super(new Pessoa(f.nome,f.telefone,f.rg,f.cpf,f.sexo),
        		f.matricula,f.cargo,f.salario,f.cargaHoraria);
        
        this.areaDeAtuacao = areaDeAtuacao;
        this.departamento = departamento;
        this.qtDeAulas = qtDeAulas;
    }
    //Getters e Setters

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public int getQtDeAulas() {
		return qtDeAulas;
	}

	public void setQtDeAulas(int qtDeAulas) {
		this.qtDeAulas = qtDeAulas;
	}

    //Métodos
	public double calculaDecimoTerceiro(){
		double taxaINSS = 0.1;
		double decimo = this.salario - (this.salario * taxaINSS);
		return decimo;
	}
}	
