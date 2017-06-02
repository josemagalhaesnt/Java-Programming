package universidade;
public class Pessoa {

    // Atributos
    protected String nome;
    protected Endereco endereco;
    protected String dataNasc;
    protected String rg;
    protected String cpf;
    protected char sexo;
	
    //Construtores
    public Pessoa (String nome, Endereco endereco, String dataNasc, String rg, String cpf, char sexo){
       this.nome = nome;
       this.endereco = endereco;
       this.dataNasc = dataNasc;
       this.rg = rg;
       this.cpf = cpf;
       this.sexo = sexo;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //Métodos

}
