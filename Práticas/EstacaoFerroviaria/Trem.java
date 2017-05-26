package estacao;

public class Trem {
    
    /** Atributos **/
    private String prefixo;
    private String dataFormacao;
    private Estacao origem;
    private Estacao destino;
    private Vagao numVagoes;
    
    /** Construtores **/
    public Trem (String prefixo, String dataFormacao){
        this.prefixo = prefixo;
        this.dataFormacao = dataFormacao;
    
    }
    
    public Trem (String prefixo, String dataFormacao, Estacao origem, Estacao destino){
        this(prefixo,dataFormacao);
        this.origem = origem;
        this.destino = destino;
    }
    
     /** Getters and Setters **/
    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Vagao getNumVagoes() {
        return numVagoes;
    }

    public void setNumVagoes(Vagao numVagoes) {
        this.numVagoes = numVagoes;
    }

    public String getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }
    
     public Estacao getOrigem() {
        return origem;
    }

    public void setOrigem(Estacao origem) {
        this.origem = origem;
    }

    public Estacao getDestino() {
        return destino;
    }

    public void setDestino(Estacao destino) {
        this.destino = destino;
    }
    
    /** Métodos da Classe **/
    public boolean transportar(){
        return this.getOrigem() != this.getDestino();
    }

   
    
    
    
    
}
