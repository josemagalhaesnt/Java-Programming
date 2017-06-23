package atividadepratica;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		String op;
		String continuar;
		Scanner teclado = new Scanner (System.in);
		
		do {
			System.out.println("Digite o simbolo da operacao que voce quer executar: ");
			System.out.println(" + Soma");
			System.out.println(" - Subtracao");
			System.out.println(" * Multiplicacao");
			System.out.println(" / Divisao");
			op = teclado.next();
			
			switch(op) {
			case "+":
				Operacao soma = new OperacaoSoma("Soma", "+");
				System.out.println("Digite o valor numerico: ");
				Operando op1 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", soma.calculaResultado(op1));
				break;
				
			case "-":
				Operacao subt = new OperacaoSubt("Subtracao", "-");
				System.out.println("Digite o valor numerico: ");
				Operando op2 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", subt.calculaResultado(op2));
				break;
				
			case "*":
				Operacao mult = new OperacaoMult("Multiplicacao", "*");
				System.out.println("Digite o valor numerico: ");
				Operando op3 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", mult.calculaResultado(op3));
				break;
				
			case "/":
				Operacao div = new OperacaoDiv("Divisao", "/");
				System.out.println("Digite o valor numerico: ");
				Operando op4 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", div.calculaResultado(op4));
				break;
				
			default:
				System.out.println("Operacao invalida");
			}
			
			System.out.println("Deseja continuar ? S/N");
			continuar = teclado.next();
		
		} while (continuar.equals("S") || continuar.equals("s"));
	}
}
