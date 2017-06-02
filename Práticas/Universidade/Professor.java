package universidade;
public class Professor extends Funcionario {
    // Atributos
    private String areaDeAtuacao;
    private Departamento departamento;
    private int qtDeAulas; //Semanais
    
    //Construtores
    public Professor (Funcionario f, String areaDeAtuacao, Departamento departamento, int qtDeAulas) {
        super(new Pessoa(f.nome, f.endereco,f.dataNasc,f.rg,f.cpf,f.sexo),f.matricula,f.cargo,f.salario,f.cargaHoraria);
        this.areaDeAtuacao = areaDeAtuacao;
        this.departamento = departamento;
        this.qtDeAulas = qtDeAulas;
    }
    //Getters e Setters

    //Métodos
}
