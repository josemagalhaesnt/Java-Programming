package universidade;
public class Funcionario extends Pessoa {
    // Atributos
    protected double matricula;
    protected String cargo;
    protected double salario;
    protected int cargaHoraria; //Carga Horária Semanal
	
    //Construtores
    public Funcionario (Pessoa p, double matricula, String cargo, 
    		double salario, int cargaHoraria) {
        super(p.nome,p.telefone,p.rg,p.cpf,p.sexo);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    //Getters e Setters
	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
    
    //Métodos
	public double calculaDecimoTerceiro(){
		double taxaINSS = 0.08;
		double decimo = this.salario - (this.salario * taxaINSS);
		return decimo;
	}
	
}
