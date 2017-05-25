package estacao;

public class Trem {
    
    /** Atributos **/
    private String prefixo;
    private String dataFormacao;
    private Estacao origem;
    private Estacao destino;
    
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

    public String getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }
    
    /** Métodos da Classe **/
    public boolean transportar(){
        return this.origem != this.destino;
    }
    
    
    
    
}
