package lista_prova;

public class Programa {
	
	public static void main(String[] args) {
		
		Data d1 = new Data ();
		Data d2 = new Data ();
		d1.setDia(29);
		d1.setMes(2);
		d1.setAno(2012);
		d2.setDia(29);
		d2.setMes(2);
		d2.setAno(2020);
		
		
		if (d1.validaData() == true)
			d1.imprimeData();
		else 
			System.out.println("Data invalida");
		
		if (d2.validaData(d2.getDia(),d2.getMes(), d2.getAno()) == true)
			d2.imprimeData();
		else 
			System.out.println("Data invalida");
		

	}

}
