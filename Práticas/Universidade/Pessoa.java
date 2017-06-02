package universidade;

import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Pessoa {
    
	// Atributos
    protected String nome;
    protected int idade;
    protected String telefone;
    protected Endereco endereco;
    protected String rg;
    protected String cpf;
    protected char sexo;
    
    Scanner teclado = new Scanner (System.in);
    GregorianCalendar calendario = new GregorianCalendar();
    
    //Construtores
    public Pessoa (String nome, String telefone, String rg, 
    		String cpf, char sexo){
    	
       this.nome = nome;
       this.idade = this.calculaIdade();
       this.telefone = telefone;
       this.endereco = this.cadastraEndereco();
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
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
    public Endereco cadastraEndereco(){
    	Endereco e = new Endereco();
    	
    	System.out.println("Logradouro: ");
    	e.setLogradouro(teclado.nextLine());
    	System.out.println("Numero: ");
    	e.setNumero(teclado.nextInt());
    	System.out.println("Complemento: ");
    	e.setComplemento(teclado.nextLine());
    	System.out.println("CEP: ");
    	e.setCep(teclado.nextLine());
    	System.out.println("Cidade: ");
    	e.setCidade(teclado.nextLine());
    	System.out.println("Estado: ");
    	e.setEstado(teclado.nextLine());
    	
    	return e;
    }
    
    public int calculaIdade(){
    	
    	int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
        int mesAtual = calendario.get(Calendar.MONTH) + 1;
        int anoAtual = calendario.get(Calendar.YEAR);
        
        System.out.println("Digite sua data de aniversario abaixo");
        System.out.print("Dia:");
        int diaNasc = teclado.nextInt();
        System.out.print("Mes:");
        int mesNasc = teclado.nextInt();
        System.out.print("Ano:");
        int anoNasc = teclado.nextInt();
        
        
        if ((mesAtual == mesNasc) && (diaAtual == diaNasc))
        	this.setIdade(anoAtual - anoNasc); 
        else 
        	this.setIdade(anoAtual - anoNasc - 1);
        
        return this.getIdade();
    }

	public void mostrarDados() {
		System.out.println("Nome: " + this.nome);
		
		//Verificar o Sexo
		if (this.sexo == 'M' || this.sexo == 'm')
			System.out.println("Sexo: Masculino");
		else if (this.sexo == 'F' || this.sexo == 'f')
			System.out.println("Sexo: Feminino");
		else
			System.out.println("Sexo: Indefinido");
		
		System.out.println("Idade: " + this.idade);
		System.out.println("RG: " + this.rg);
		System.out.println("CPF: " + this.cpf);
		
		System.out.println("Endereco: " + this.endereco.getLogradouro() + ", " 
		+ this.endereco.getNumero() + this.endereco.getComplemento());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("Estado: " + this.endereco.getEstado());
	
	}

}
