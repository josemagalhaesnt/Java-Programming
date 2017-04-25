import java.util.Scanner;

public class Agenda {
	public static void main (String args[]){
		Pessoa p1 = new Pessoa();
		Scanner teclado = new Scanner (System.in);
		System.out.println("Nome: ");
		p1.setNome(teclado.next());
	
	}
}
