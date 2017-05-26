package estacao;

public class Teste {
    
    /** Método Principal **/ 
    public static void main (String args[]){
        
        /** Linhas **/
    	Linha circular = new Linha (11, 8, "Ant Bezerra - Parangaba - Papicu");
    	Linha parangaba_papicu_montese = new Linha (44, 4.4, "Parangaba - Papicu - Centro - Montese ");
    	Linha jovita_feitosa = new Linha (389, 3, "Ant Bezerra - Benfica - Centro");
        
        /** Estações **/
    	Estacao parangaba = new Estacao ("Parangaba");
        
        /** Cadastro de linhas nas estações **/
    	parangaba.getLinhas().add(circular);
    	parangaba.getLinhas().add(parangaba_papicu_montese);
        parangaba.getLinhas().add(jovita_feitosa);
        parangaba.getLinhas().remove(jovita_feitosa);
        
        /** Mostrar linhas das estações **/
        System.out.println("Linhas da Estacao " + parangaba.getNome());
    	parangaba.mostraLinhas();
        
    }
} /** Fim da Classe **/
