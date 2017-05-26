package estacao;
import java.util.ArrayList;

public class Estacao {
    
    /**Atributos da Classe **/
    private String nome;
    private ArrayList<Linha> linhas;
    
    /** Construtores **/
    public Estacao (String nome){
        this.nome = nome;
        this.linhas = new ArrayList<Linha>();
    }
    
    /** Getters and Setters **/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Linha> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Linha> linhas) {
        this.linhas = linhas;
    }
    
    /** Métodos da Classe **/
   
    public void mostraLinhas(){
        
        int k;
        
        for (k=0; k < linhas.size(); k++){
            System.out.println("Linha: " + linhas.get(k).getNumero());
            System.out.println("Extensao: " + linhas.get(k).getExtensao() + " km");
            System.out.println("Descricao/Percurso: " + linhas.get(k).getDescricao());
            System.out.println(" ");  

        }
    }
    
} /** Fim da Classe **/
