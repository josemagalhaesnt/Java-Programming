package questao26_dado;
import java.util.Random;

public class Dado {
     /** Atributos **/
    private int faceJogada;
    
    /** Getters and Setters **/
    public int getFaceJogada() {
        return this.faceJogada;
    }

    public void setFaceJogada(int faceJogada) {
        this.faceJogada = faceJogada;
    }
    
    /** Métodos da Classe **/
    public void jogar(){
        Random jogada = new Random();
        int numDado = jogada.nextInt(6) + 1;
        this.setFaceJogada(numDado);
        
    } 
 
}
