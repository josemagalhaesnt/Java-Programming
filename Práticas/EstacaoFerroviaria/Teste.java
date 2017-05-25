package estacao;


public class Teste {
    
    /** Método Principal **/ 
    public static void main (String args[]){

    	Linha circular = new Linha (011, 8, "Ant Bezerra - Parangaba - Papicu");
    	Linha parangaba_papicu_montese = new Linha (044, 4.4, "Parangaba - Papicu - Centro - Montese ");
    	Linha jovita_feitosa = new Linha (389, 3, "Ant Bezerra - Benfica - Centro");

    	Estacao parangaba = new Estacao ();
    	parangaba.cadastraLinhas(circular);
    	parangaba.cadastraLinhas(parangaba_papicu_montese);
        
        
    }
}
