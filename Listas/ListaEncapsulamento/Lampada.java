package ListaEncapsulamento;
 
public class Lampada {
		/** Atributos **/
		
	private boolean status;
	private int cont;
	
		/** Getters and Setters **/
	
	public boolean getStatus(){
		return status;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public int getCont(){
		return cont;
	}
	
	public void setCont(int cont){
		this.cont = cont;
	}
	
		/** Métodos da Classe **/
		
	public void ligar() {
			
		if (l1.getStatus() == false)
			l1.setStatus(true);
		else 
			l1.setStatus(false);
			
	} 
	
	public void verificar() {
	
		if (getStatus() == true) 
			system.out.println("A lampada esta ligada");
			
		else if (getCont() >= 100) 
			system.out.println("A lampada esta desligada");
		else
			system.out.println("A lampada esta queimada");
		
	}
	
	
}

