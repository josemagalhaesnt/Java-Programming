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
		System.out.println(getDia() + "/" + getMes() + "/" + getAno());
	}
	
	public boolean anoBissexto(){
		if ((getAno()% 4 == 0) || (getAno()% 400 == 0))
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
		
		if ((getDia() > 0 && getDia() <= 31) && (getMes() > 0 && getMes()<=12)){
			if (getMes() == 1 && getDia() <= 31)
				return true;
			if (getMes() == 2 && getDia() <= 28 && anoBissexto() == false) 
				return true;
			if (getMes() == 2 && getDia() <= 29 && anoBissexto() == true) 
				return true;
			if (getMes() == 3 && getDia() <= 31)
				return true;
			if (getMes() == 4 && getDia() <= 30)
				return true;
			if (getMes() == 5 && getDia() <= 31)
				return true;
			if (getMes() == 6 && getDia() <= 30)
				return true;
			if (getMes() == 7 && getDia() <= 31)
				return true;
			if (getMes() == 8 && getDia() <= 31)
				return true;
			if (getMes() == 9 && getDia() <= 30)
				return true;
			if (getMes() == 10 && getDia() <= 31)
				return true;
			if (getMes() == 11 && getDia() <= 30)
				return true;
			if (getMes() == 12 && getDia() <= 31)
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
			if (mes == 2 && dia <= 28 && anoBissexto(ano) == false) 
				return true;
			if (mes == 2 && dia <= 29 && anoBissexto(ano) == true) 
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
