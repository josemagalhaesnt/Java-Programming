package estacao;

public class Linha {
    
    /** Atributos da Classe **/
    private int numero;
    private float extensao;
    private String descricao;

    /** Construtores da Classe **/
    public Linha (int numero) {
        this.setNumero(numero);
    }

    public Linha (int numero, float extensao, String descricao) {
        this(numero);
        this.setExtensao(extensao);
        this.setDescricao(descricao);
    }
    
    /** Getters and Setters **/
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getExtensao() {
        return extensao;
    }

    public void setExtensao(float extensao) {
        this.extensao = extensao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /** Métodos da Classe **/

   
    
    
}
