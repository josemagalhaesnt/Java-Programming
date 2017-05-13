package questao26_dado;

public class Jogo {
    
    public static void main (String args[]){
    
    Dado d1 = new Dado();
    Dado d2 = new Dado();
    
    d1.jogar();
    d2.jogar();
    
    System.out.println("O seu dado 1 tirou um: " + d1.getFaceJogada());
    System.out.println("O seu dado 2 tirou um: " + d2.getFaceJogada());
    
    }
}
