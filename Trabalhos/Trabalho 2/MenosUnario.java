package atividadepratica;

public class MenosUnario extends OperacaoUnaria {
	
	/** Construtor **/
	public MenosUnario(String nome, String simboloOperador) {
		super(nome, simboloOperador);
	}
	
	/** Métodos **/
	@Override
	public float calculaResultado(Operando...operandos) {
		try {
			if (operandos.length == 1){
				float resultado = 0;
				resultado -= operandos[0].getValor();
				return resultado;
			}
		} catch (NullPointerException e){
			System.out.println("Quantidade de operandos invalida");
		}
		
		return 0;
	}

}
