
package mvc;

public class ClienteController implements Observer {
    
    Cliente cliente;
    ClienteView view;
   

    public ClienteController(Cliente cliente, ClienteView view) {
        super();
        this.cliente = cliente;
        this.view = view;
    }
    
    public void handleEvent(String str) {
        cliente.setNome(str);
        //view.display();
    }

    @Override
    public void update() {
       
    }
}
