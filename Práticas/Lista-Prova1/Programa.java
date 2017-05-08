package lista_prova;

public class Programa {
	
	public static void main(String[] args) {
		
		Data d1 = new Data ();
		d1.setDia(1);
		d1.setMes(10);
		d1.setAno(1995);
		
		if (d1.validaData() == true)
			d1.imprimeData();
		else 
			System.out.println("Data invalida");
		

	}

}
