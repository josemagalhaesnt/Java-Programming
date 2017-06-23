package atividadepratica;
import java.util.Scanner;

public class Calculadora {

	private static Scanner teclado;

	public static void main(String[] args) {
		String op;
		String continuar;
		teclado = new Scanner (System.in);
		
		do {
			System.out.println("Digite o simbolo da operacao que voce quer executar: ");
			System.out.println(" + Soma");
			System.out.println(" - Subtracao");
			System.out.println(" * Multiplicacao");
			System.out.println(" / Divisao");
			System.out.println(" # Inversor");
			op = teclado.next();
			
			switch(op) {
			case "+":
				Operacao soma = new OperacaoSoma("Soma", "+");
				System.out.println("Digite o primeiro valor: ");
				Operando op1 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op2 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", soma.calculaResultado(op1,op2));
				System.out.println("");
				break;
				
			case "-":
				Operacao subt = new OperacaoSubt("Subtracao", "-");
				System.out.println("Digite o primeiro valor: ");
				Operando op3 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op4 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f ", subt.calculaResultado(op3,op4));
				System.out.println("");
				break;
				
			case "*":
				Operacao mult = new OperacaoMult("Multiplicacao", "*");
				System.out.println("Digite o primeiro valor: ");
				Operando op5 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op6 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", mult.calculaResultado(op5,op6));
				System.out.println("");
				break;
				
			case "/":
				Operacao div = new OperacaoDiv("Divisao", "/");
				System.out.println("Digite o primeiro valor: ");
				Operando op7 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op8 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", div.calculaResultado(op7,op8));
				System.out.println("");
				break;
			
			case "#":
				Operacao inv = new MenosUnario("Inversor","#");
				System.out.println("Digite o valor ao qual deseja inverter: ");
				Operando op9 = new Operando (teclado.nextFloat());
				System.out.printf("Resultado = %.2f", inv.calculaResultado(op9));
				System.out.println("");
				break;
				
			default:
				System.out.println("Operacao invalida");
			}
			
			System.out.println("Deseja continuar ? S/N");
			continuar = teclado.next();
		
		} while (continuar.equals("S") || continuar.equals("s"));
		System.out.println("Desligando a calculadora...");
		
	}
}
