package universidade;
public class Funcionario extends Pessoa {
    // Atributos
    protected double matricula;
    protected String cargo;
    protected double salario;
    protected int cargaHoraria; //Carga Horária Semanal
	
    //Construtores
    
    public Funcionario (Pessoa p, double matricula, String cargo, double salario, int cargaHoraria) {
        super(p.nome,p.endereco,p.dataNasc,p.rg,p.cpf,p.sexo);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    //Getters e Setters

    //Métodos
}
