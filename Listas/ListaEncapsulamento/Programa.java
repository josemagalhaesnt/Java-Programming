package ListaEncapsulamento;
 
public class Programa {

	/** Atributos **/
	int i;
	int aux;
	Lampada l1 = new Lampada();
		
	/* Método Principal */
	
	public static void main (String args[]) 
	{
	
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
