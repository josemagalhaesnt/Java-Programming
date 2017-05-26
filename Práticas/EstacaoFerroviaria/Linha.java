package estacao;
import java.util.ArrayList;

public class Linha {
    
    /** Atributos da Classe **/
    private int numero;
    private double extensao;
    private String descricao;

    /** Construtores da Classe **/
    
    public Linha (int numero) {
        this.numero = numero;
    }

    public Linha (int numero, double extensao) {
        this(numero);
        this.extensao = extensao;
    }
    
    /** Getters and Setters **/
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getExtensao() {
        return extensao;
    }

    public void setExtensao(double extensao) {
        this.extensao = extensao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /** Métodos da Classe **/

} /** Fim da Classe **/
