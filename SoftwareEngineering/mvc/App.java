
package mvc;

import java.util.Scanner;


public class App {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1 = new Cliente("Juzera");
        ClienteView v1 = new ClienteView(c1);
        ClienteController cnt1 = new ClienteController(c1,v1);
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("Entre com o nome do cliente: \n");
            String str = scan.next();
            cnt1.handleEvent(str);
        }
    }
    
    
}
