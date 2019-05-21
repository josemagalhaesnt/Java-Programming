package mvc;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nome;
    
    List<Observer> observers = new ArrayList<>();
    
    public void attach(Observer obs) {
        observers.add(obs);
    }
    
    public Cliente(String nome) {
        super();
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        notifyChange();
    }

    private void notifyChange() {

       for (Observer observer : observers) {
           observer.update();
       }
    }
}
