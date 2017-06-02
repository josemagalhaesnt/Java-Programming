package universidade;
public class Seguranca extends Funcionario {
    
	// Atributos
	private String numRegistro;
    
	//Construtores
	public Seguranca(Funcionario f, String numRegistro){
		super(new Pessoa(f.nome,f.telefone,f.rg,f.cpf,f.sexo),
        		f.matricula,f.cargo,f.salario,f.cargaHoraria);
		this.numRegistro = numRegistro;
	}
    
	//Getters e Setters
	public String getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

}
