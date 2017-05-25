package estacao;

public class Vagao {
   
    /** Atributos **/
    private String numSerie;
    private String tipo;
    private double capacidade;
    //Opcional Informar
    private float comprimentoTesteiras; 
    private float comprimentoEngates;
    
    /** Construtores **/
    
     /** Getters and Setters **/
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public float getComprimentoTesteiras() {
        return comprimentoTesteiras;
    }

    public void setComprimentoTesteiras(float comprimentoTesteiras) {
        this.comprimentoTesteiras = comprimentoTesteiras;
    }

    public float getComprimentoEngates() {
        return comprimentoEngates;
    }

    public void setComprimentoEngates(float comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }
    
}
