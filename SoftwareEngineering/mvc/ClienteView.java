
package mvc;

public class ClienteView implements Observer {
    
    Cliente cliente;

    public ClienteView(Cliente cliente) {
        super();
        this.cliente = cliente;
        this.cliente.attach(this);
    }
    
    
    public void display() {
        System.out.println(cliente.getNome()+ " cadastrado com sucesso!");
    }

    @Override
    public void update() {
        display();
    }
}
