package estacao;

public class Teste {
    
    /** Método Principal **/ 
    public static void main (String args[]){
        
        /** Estações e Linhas **/
    	Estacao e1 = new Estacao ("Parangaba");
        Estacao e2 = new Estacao ("Centro");
        Estacao e3 = new Estacao ("Mucuripe");
        Estacao e4 = new Estacao ("Papicu");
        Estacao e5 = new Estacao ("Antonio Bezerra");
        
        Linha norte = new Linha (1, 9.4);
        norte.setDescricao("A linha norte percorre por quase toda a cidade, passando pela Parangaba, Centro e Papicu");
        Linha sul = new Linha (2, 5.2);
        sul.setDescricao("A linha sul percorre uma pequena parcela da cidade, passando pelo Mucuripe e Papicu");
        Linha leste = new Linha (3, 7.3);
        leste.setDescricao("A linha leste percorre a parte central da cidade, passando pelo Centro, Mucuripe e Antonio Bezerra");
        Linha oeste = new Linha (4, 6.94);
        oeste.setDescricao("A linha oeste percorre uma distância média, ideal para descolocamentos para Parangaba e Antonio Bezerra");
        
        e1.getLinhas().add(norte);
        e1.getLinhas().add(oeste);
        e2.getLinhas().add(norte);
        e2.getLinhas().add(leste);
        e3.getLinhas().add(sul);
        e3.getLinhas().add(leste);
        e4.getLinhas().add(norte);
        e4.getLinhas().add(sul);
        e5.getLinhas().add(oeste);
        e5.getLinhas().add(leste);
        
        /** Trens **/
    	Trem t1 = new Trem ("FOR-010", "11/12/2015",e1,e2);
        Trem t2 = new Trem ("FOR-020", "11/12/2015",e2,e5);
        Trem t3 = new Trem ("FOR-030", "11/12/2015",e5,e1);
        Trem t4 = new Trem ("FOR-040", "28/07/2016",e2,e3);
        Trem t5 = new Trem ("FOR-050", "28/10/2016",e3,e4);
        Trem t6 = new Trem ("FOR-060", "28/10/2016",e4,e5);
        Trem t7 = new Trem ("FOR-070", "22/04/2017",e4,e1);
        Trem t8 = new Trem ("FOR-080", "22/04/2017",e5,e3);
        Trem t9 = new Trem ("FOR-090", "11/12/2015",e4,e2);
        Trem t10 = new Trem ("FOR-100", "22/04/2017",e3,e1);
        
        /** Cadastro dos trens nas estações **/
        
        //Estação Parangaba
    	e1.getTrens().add(t1);
    	e1.getTrens().add(t3);
        e1.getTrens().add(t7);
        e1.getTrens().add(t10);
        
        //Estação Centro
        e2.getTrens().add(t1);
        e2.getTrens().add(t2);
        e2.getTrens().add(t4);
        e2.getTrens().add(t9);
        
        //Estação Mucuripe
        e3.getTrens().add(t4);
    	e3.getTrens().add(t5);
        e3.getTrens().add(t8);
        e3.getTrens().add(t10);
        
        //Estação Papicu
        e4.getTrens().add(t9);
        e4.getTrens().add(t5);
    	e4.getTrens().add(t6);
        e4.getTrens().add(t7);
        
        //Estação Ant. Bezerra
        e5.getTrens().add(t2);
    	e5.getTrens().add(t3);
        e5.getTrens().add(t6);
        e5.getTrens().add(t8);
        
        /** Mostrar linhas das estações **/
        System.out.println("----------------------------");
        System.out.println("Linhas de Trem da Estacao " + e1.getNome());
    	e1.detalharViagem();
        System.out.println("----------------------------"); 
        System.out.println("Linhas de Trem da Estacao " + e2.getNome());
    	e2.detalharViagem();
        System.out.println("----------------------------");
        System.out.println("Linhas de Trem da Estacao " + e3.getNome());
    	e3.detalharViagem();
        System.out.println("----------------------------");
        System.out.println("Linhas de Trem da Estacao " + e4.getNome());
    	e4.detalharViagem();
        System.out.println("----------------------------");
         
    }
} /** Fim da Classe **/
