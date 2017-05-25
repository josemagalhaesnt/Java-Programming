package estacao;

import java.util.ArrayList;

public class Estacao {

    /**Atributos da Classe **/
    private ArrayList<Linha> linhas;
    private ArrayList<Trem> trens;
    private ArrayList<Vagao> vagoes;
    private ArrayList<Locomotiva> locomotivas;
    private static int qtRecursos;
    
    /** Construtores **/
    public Estacao (ArrayList<Linha> linhas){
        this.linhas = linhas;
    }
    
    /** Getters and Setters **/
    public ArrayList<Linha> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Linha> linhas) {
        this.linhas = linhas;
    }
    
    /** Métodos da Classe **/
    public void cadastraLinha(Linha l){
        
        int i;

        for (i = 0; i < linhas.size(); i++){

            //Se a linha já estiver na lista, emitir mensagem
            if (linhas.get(i).getNumero().equals(l.getNumero()))
                System.out.println("Essa linha ja esta cadastrada");

            //Senão, adicionar ela à lista
            else { 
                linhas.add(l);
                System.out.println("Linha cadastrada com sucesso !");
            }   
        }
    }
    
    public void removeLinha(Linha l){
        
        int i;
    
        for (i = 0; i < linhas.size(); i++){

            //Se a linha selecionada estiver na lista, removê-la
            if (linhas.get(i).getNumero().equals(l.getNumero())){
                linhas.remove(l);
                System.out.println("Linha removida com sucesso !");
            }
            
            //Senão, emitir mensagem    
            else  
                System.out.println("Essa linha nao esta nessa estacao");    
        }
    }

    public void mostraLinhas(){
        
        int i;
        
        for (i=0; i < linhas.size(); i++){
            System.out.println("Linha: " + linhas.get(i).getNumero());
            System.out.println("Extensao: " + linhas.get(i).getExtensao());
            System.out.println("Descricao: " + linhas.get(i).getDescricao());
            System.out.println(" ");  

        }
    }
    
    //Falta implementar
    
    /*
    public void cadastraRecurso(){
    int i;
    
    for (i = 0; i < 200; i++) {
        if ((linhas.size() + vagoes.size() + locomotivas.size()) > i)
            this.qtRecursos++;
        
        }
    
    }*/
}
