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
			
		if (getStatus() == false)
			setStatus(true);
		else 
			setStatus(false);
			
	} 
	
	public void verificar() {
	
		if (getStatus() == true) 
			System.out.println("A lampada esta ligada");
			
		else if (getCont() >= 100) 
			System.out.println("A lampada esta desligada");
		else
			System.out.println("A lampada esta queimada");
		
	}
	
	
}

