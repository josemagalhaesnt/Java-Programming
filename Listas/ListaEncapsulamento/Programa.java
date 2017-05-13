 package ListaEncapsulamento;
 public class Programa {

	/* Método Principal */
	
	public static void main (String args[]) {

		int i;
		int aux;
		Lampada l1 = new Lampada();
	
		l1.setStatus(false);
		l1.setCont(0);
		aux = 0;
		
		for (i = 0; i < 100; i++) {
		
			l1.ligar();
			l1.verificar();
			
			if (l1.getStatus() == true)
				l1.setCont(aux++); 
								
		}
		
	}
	
}
