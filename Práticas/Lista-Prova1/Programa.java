package lista_prova;

public class Programa {
	
	public static void main(String[] args) {
		
		Data d1 = new Data ();
		d1.setDia(29);
		d1.setMes(2);
		d1.setAno(2012);
		
		if (d1.validaData() == true)
			d1.imprimeData();
		else 
			System.out.println("Data invalida");
		

	}

}
