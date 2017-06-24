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
				OperacaoSoma soma = new OperacaoSoma("Soma", "+");
				System.out.println("Digite o primeiro valor: ");
				Operando op1 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op2 = new Operando (teclado.nextFloat());
				//Operando com a intenção de causar treta e lançar a exceção
				Operando bugarsoma = new Operando(7);
				
				try {
					if (soma.validaOp(op1,op2) == true) {
						System.out.println("");
						System.out.println("Operacao: " + op1.getValor() + " " + soma.getSimboloOperador() + " " + op2.getValor());
						System.out.println("");
						System.out.println("Resultado = " + soma.calculaResultado(op1,op2));
						System.out.println("");
					}
				
					if (soma.validaOp(op1,op2,bugarsoma) == true) {
						System.out.println("");
						System.out.println("Operacao: " + op1.getValor() + " " + soma.getSimboloOperador() + " " + op2.getValor() + " " + soma.getSimboloOperador() + bugarsoma.getValor());
						System.out.println("");
						System.out.println("Resultado = " + soma.calculaResultado(op1,op2,bugarsoma));
						System.out.println("");
					}
					
				} catch (NumeroOperandosException e){
					System.out.println("Erro!!! Permitidos no max dois operandos para essa operacao");
				}
				break;
				
			case "-":
				OperacaoSubt subt = new OperacaoSubt("Subtracao", "-");
				System.out.println("Digite o primeiro valor: ");
				Operando op3 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op4 = new Operando (teclado.nextFloat());
				
				//Operando com a intenção de causar treta e lançar a exceção
				Operando bugarsubt = new Operando (0);
				
				try {
					if (subt.validaOp(op3,op4) == true) {
						System.out.println("");
						System.out.println("Operacao: " + op3.getValor() + " " + subt.getSimboloOperador() + " " + op4.getValor());
						System.out.println("");
						System.out.println("Resultado = " + subt.calculaResultado(op3,op4));
						System.out.println("");
					}
					
					if (subt.validaOp(op3,op4,bugarsubt) == true) {
						System.out.println("");
						System.out.println("Operacao: " + op3.getValor() + " " + subt.getSimboloOperador() + " " + op4.getValor() + " " + subt.getSimboloOperador() + bugarsubt.getValor());
						System.out.println("");
						System.out.println("Resultado = " + subt.calculaResultado(op3,op4,bugarsubt));
						System.out.println("");
					}
					
			} catch (NumeroOperandosException e){
				System.out.println("Erro!!! Permitidos no max dois operandos para essa operacao");
			}
				
				break;
				
			case "*":
				OperacaoMult mult = new OperacaoMult("Multiplicacao", "*");
				System.out.println("Digite o primeiro valor: ");
				Operando op5 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op6 = new Operando (teclado.nextFloat());
				
				//Operando com a intenção de causar treta e lançar a exceção
				Operando bugarmult = new Operando(0);
				
				try {
					if (mult.validaOp(op5,op6) == true) {
						System.out.println("");
						System.out.println("Operacao: " + op5.getValor() + " " + mult.getSimboloOperador() + " " + op6.getValor());
						System.out.println("");
						System.out.println("Resultado = " + mult.calculaResultado(op5,op6));
						System.out.println("");
					}
				
					if (mult.validaOp(op5,op6,bugarmult) == true) {
						System.out.println("");
						System.out.println("Operacao: " + op5.getValor() + " " + mult.getSimboloOperador() + " " + op6.getValor() + " " + mult.getSimboloOperador() + bugarmult.getValor());
						System.out.println("");
						System.out.println("Resultado = " + mult.calculaResultado(op5,op6,bugarmult));
						System.out.println("");
				}		
				
			} catch (NumeroOperandosException e){
				System.out.println("Erro!!! Permitidos no max dois operandos para essa operacao");
			}
				
				break;
				
			case "/":
				OperacaoDiv div = new OperacaoDiv("Divisao", "/");
				System.out.println("Digite o primeiro valor: ");
				Operando op7 = new Operando (teclado.nextFloat());
				System.out.println("Digite o segundo valor: ");
				Operando op8 = new Operando (teclado.nextFloat());
				
				//Operandos com a intenção de causar treta e lançar a exceção
				Operando bugardiv1 = new Operando(7);
				Operando bugardiv2 = new Operando(0);
				try {
					try {
						if (div.validaOp(op7,op8) == true) {
							System.out.println("");
							System.out.println("Operacao: " + op7.getValor() + " " + div.getSimboloOperador() + " " + op8.getValor());
							System.out.println("");
							System.out.println("Resultado = " + div.calculaResultado(op7,op8));
							System.out.println("");
						}
				
						if (div.validaOp(op7,op8,bugardiv1) == true) {
							System.out.println("");
							System.out.println("Operacao: " + op7.getValor() + " " + div.getSimboloOperador() + " " + op8.getValor() + " " + div.getSimboloOperador() + " " + bugardiv1.getValor());
							System.out.println("");
							System.out.println("Resultado = " + div.calculaResultado(op7,op8,bugardiv1));
							System.out.println("");
						}
				
						if (div.validaOp(bugardiv2,op8) == true) {
							System.out.println("");
							System.out.println("Operacao: " + bugardiv2.getValor() + " " + div.getSimboloOperador() + " " + op8.getValor());
							System.out.println("");
							System.out.println("Resultado = " + div.calculaResultado(bugardiv2,op8));
							System.out.println("");
						}
				
						if (div.validaOp(op7,bugardiv2) == true) {
							System.out.println("");
							System.out.println("Operacao: " + op7.getValor() + " " + div.getSimboloOperador() + " " + bugardiv2.getValor());
							System.out.println("");
							System.out.println("Resultado = " + div.calculaResultado(op7,bugardiv2));
							System.out.println("");
						}
						
						} catch (DivisaoPorZeroException e){
							System.out.println("Erro!!! Nao eh possivel usar 0 como dividendo ou divisor");
						}
				
					} catch(NumeroOperandosException e){
						System.out.println("ERRO!!! Numero de operandos nao pode ser diferente de 2 nessa operacao");
					}	

				break;
			
			case "#":
				Operacao inv = new MenosUnario("Inversor","#");
				System.out.println("Digite o valor ao qual deseja inverter: ");
				Operando op9 = new Operando (teclado.nextFloat());
				
				//Operando com a intenção de causar treta e lançar a exceção
				Operando bugarinv = new Operando(7);
				
				try {
					if (inv.validaOp(op9) == true) {
						System.out.println("");
						System.out.printf("Resultado = %.2f", inv.calculaResultado(op9));
						System.out.println("");
					}
					if (inv.validaOp(op9,bugarinv) == true) {
						System.out.println("");
						System.out.printf("Resultado = %.2f", inv.calculaResultado(op9));
						System.out.println("");
					}
					
				} catch (NumeroOperandosException e){
					System.out.println("ERRO!!! Numero de operandos nao pode ser maior que 1 nessa operacao");
				}
				
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
