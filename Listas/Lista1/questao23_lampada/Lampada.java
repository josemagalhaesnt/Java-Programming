package questao24_lampada;
public class Lampada {
	/** Atributos **/
		
	private boolean status;
	private int cont;
	
	/** Getters and Setters **/
   
	public boolean getStatus(){
		return this.status;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}
	
	public int getCont(){
		return this.cont;
	}
	
	public void setCont(int cont){
		this.cont = cont;
	}
	
	/** Métodos da Classe **/
		
	public void ligar() {
			
		if (this.getStatus() == false && this.getCont()< 100)
			this.setStatus(true);
		else 
			this.setStatus(false);
			
	} 
	
	public void verificar() {
	
		if (this.getStatus() == true) { 
			System.out.println("A lampada esta ligada");
                        System.out.println("Restam: " + (100 - (this.getCont() + 1)) + " utilizacoes");
                        System.out.println(" ");
                }
			
		else {
                        if (this.getCont() < 100){ 
			System.out.println("A lampada esta desligada");
                        System.out.println(" ");
                        }
                        
                        else
			System.out.println("A lampada esta queimada");
                }
	}	
}