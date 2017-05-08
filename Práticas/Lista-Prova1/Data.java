package lista_prova;

public class Data {
	
	//Atributos da Classe
	
	private int dia;
	private int mes;
	private int ano;
	
	//Getters and Setters
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Métodos da Classe

	public void imprimeData(){
		System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
	}
	
	public boolean anoBissexto(){
		if ((this.getAno()% 4 == 0 && this.getAno() % 100 != 0 ) || (this.getAno()% 400 == 0))
			return true;
		else
			return false;
	}
	
	public boolean anoBissexto(int ano){
		if ((ano % 4 == 0) || (ano % 400 == 0))
			return true;
		else
			return false;
	}
	
	public boolean validaData(){
		
		if ((this.getDia() > 0 && this.getDia() <= 31) && (this.getMes() > 0 && this.getMes() <= 12)){
			if (this.getMes() == 1 && this.getDia() <= 31)
				return true;
			if (this.getMes() == 2 && this.getDia() <= 28 && this.anoBissexto() == false) 
				return true;
			if (this.getMes() == 2 && this.getDia() <= 29 && this.anoBissexto() == true) 
				return true;
			if (this.getMes() == 3 && this.getDia() <= 31)
				return true;
			if (this.getMes() == 4 && this.getDia() <= 30)
				return true;
			if (this.getMes() == 5 && this.getDia() <= 31)
				return true;
			if (this.getMes() == 6 && this.getDia() <= 30)
				return true;
			if (this.getMes() == 7 && this.getDia() <= 31)
				return true;
			if (this.getMes() == 8 && this.getDia() <= 31)
				return true;
			if (this.getMes() == 9 && this.getDia() <= 30)
				return true;
			if (this.getMes() == 10 && this.getDia() <= 31)
				return true;
			if (this.getMes() == 11 && this.getDia() <= 30)
				return true;
			if (this.getMes() == 12 && this.getDia() <= 31)
				return true;
			else
				return false;	
		}
		
		else
			return false;
	}
	
	public boolean validaData(int dia, int mes, int ano){
		
		if (dia > 0 && dia <= 31 && mes > 0 && mes <=12){
			if (mes == 1 && dia <= 31)
				return true;
			if (mes == 2 && dia <= 28 && this.anoBissexto(ano) == false) 
				return true;
			if (mes == 2 && dia <= 29 && this.anoBissexto(ano) == true) 
				return true;
			if (mes == 3 && dia <= 31)
				return true;
			if (mes == 4 && dia <= 30)
				return true;
			if (mes == 5 && dia <= 31)
				return true;
			if (mes == 6 && dia <= 30)
				return true;
			if (mes == 7 && dia <= 31)
				return true;
			if (mes == 8 && dia <= 31)
				return true;
			if (mes == 9 && dia <= 30)
				return true;
			if (mes == 10 && dia <= 31)
				return true;
			if (mes == 11 && dia <= 30)
				return true;
			if (mes == 12 && dia <= 31)
				return true;
			else
				return false;	
		}
		
		else
			return false;
		
	}

}
