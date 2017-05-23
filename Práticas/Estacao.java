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
    
    /** Métodos da Classe **/
    public void cadastraLinhas(Linha l){
        int i;
        //Se a linha recebida não estiver na lista
        for (i = 0; i < linhas.size(); i++){
            if (linhas.get(i).getSigla().equals(l.getSigla()))
                System.out.println("Essa linha ja esta cadastrada");
            else { 
                linhas.add(l);
                System.out.println("Linha cadastrada com sucesso !");
            }   
        }
    }
    
 public void removeLinhas(Linha l){
        int i;
        //Se a linha recebida não estiver na lista
        for (i = 0; i < linhas.size(); i++){
            if (linhas.get(i).getSigla().equals(l.getSigla())){
                linhas.add(l);
                System.out.println("Linha cadastrada com sucesso !");
            }    
            else  
                System.out.println("Essa linha nao esta nesse terminal");    
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
