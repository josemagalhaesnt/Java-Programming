package estacao;
import java.util.ArrayList;

public class Estacao {
    
    /**Atributos da Classe **/
    private String nome;
    private ArrayList<Trem> trens;
    private ArrayList<Linha> linhas;
    
    /** Construtores **/
    public Estacao (String nome){
        this.nome = nome;
        this.trens = new ArrayList<Trem>();
        this.linhas = new ArrayList<Linha>();
    }
    
    /** Getters and Setters **/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Trem> getTrens() {
        return trens;
    }

    public void setTrens(ArrayList<Trem> trens) {
        this.trens = trens;
    }

    public ArrayList<Linha> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Linha> linhas) {
        this.linhas = linhas;
    }
    
    /** Métodos da Classe **/
    
    public void detalharViagem(){
        
        int k;
        
        for (k=0; k < trens.size(); k++){
            System.out.println(" "); 
            System.out.println("Trem: " + trens.get(k).getPrefixo());
            System.out.println("Data de Formacao: " + trens.get(k).getDataFormacao());
            System.out.println("Origem: " + trens.get(k).getOrigem().getNome());
            System.out.println("Destino: " + trens.get(k).getDestino().getNome());
            System.out.println(" ");  

        }
    }
    
} /** Fim da Classe **/
