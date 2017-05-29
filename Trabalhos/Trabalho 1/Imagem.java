public class Imagem {
	
	/** Atributos **/
	private int[][] pixels;
	private int largura;
	private int altura;
	private int valorMax;

	/** Construtores **/

	public Imagem(int[][] matriz) {
    	this.pixels = matriz;
	}

	/** Getters e Setters **/

	public int getLargura(){
		return largura;
	}

	public void setLargura(int largura){
		this.largura = largura;
	}

	public int getAltura(){
		return altura;
	}

	public void setAltura(int altura){
		this.altura = altura;
	}

	public int getValorMax(){
		return valorMax;
	}

	public void setValorMax(int altura){
		this.altura = altura;
	}

}