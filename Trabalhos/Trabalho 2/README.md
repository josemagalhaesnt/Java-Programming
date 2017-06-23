### Descrição do Trabalho 2 ###

/* IFCE - Instituto Federal do Ceará
 * @ Avaliação prática de POO
 * @ Prof. Lucas Sousa
 */

Para a elaboração do programa a seguir, utilize as boas práticas de POO.

1) Um operando nada mais é do que um símbolo numérico com valor. Para representar isso, crie as classes a seguir:
	- Classe Número: Possui um atributo valor e seu construtor recebe um único valor ponto flutuante.
	- Classe Operando: A classe operando é derivada de Número mas possui um método chamado "avaliar" que retorna o valor do atributo número da superclasse. Seu único construtor recebe um ponto flutuante por parâmetro e deve utilizar o construtor da superclasse Número.

2) Crie uma classe chamada de Operação. Ela deve possuir dois atributos do tipo String (nome e simboloOperador). 
   O único construtor dessa classe deve receber valores para os dois atributos por parâmetro. Crie os devidos métodos de acesso (set/get) para os atributos.
   Todas as classes que irão derivar de Operação deverão obrigatoriamente possuir um método chamado calculaResultado que recebe um número variado de parâmetros do 
   tipo Operando. Além disso, a função calculaResultado deve retornar um valor de ponto flutuante correspondendo ao resultado da devida operação.

3) As classes OperaçãoBinaria e OperaçãoUnaria derivam de Operação. Essas classes devem ter somente um construtor que recebem valores para os dois atributos da superclasse.
OBS: As classes OperaçãoBinária OperaçãoUnária não implementam o método calculaResultado.

4) Crie as classes OperacaoSubtracao, OperacaoSoma, OperacaoMultiplicacao, OperacaoDivisao e MenosUnario. Cada uma dessas classes extendem de OperacaoBinaria ou OperacaoUnaria com base em sua operação e possuem somente um construtor padrão que executa o construtor da superclasse passando seus devidos parâmetros (Constantes). As cinco classes devem implementar o método calculaResultado descrito no tópico 2. Além disso esse método deverá verificar se a quantidade de parâmetros recebidos é um ou 2, com base na sua classe ancestral. Caso positivo, calcule o resultado da operação, imprima na tela uma string exibindo os operandos, o símbolo e o resultado e retorne o resultado. Caso contrário lance uma exceção do tipo NumeroOperandosException que deve ser criada informando uma mensagem do problema. Cada método deve "lançar para fora" a exceção NumeroOperandosException. Para o caso da classe OperacaoDivisao também deve ser lançada uma exceção do tipo DivisaoPorZeroException caso o segundo operando recebido seja zero.

5) As classes DivisaoPorZeroException e NumeroOperandosException devem derivar de RuntimeException. Elas devem ter um construtor que recebe uma mensagem informativa do problema que deve ser repassada para a superclasse. Além do construtor, as classes devem sobrescrever o toString retornando o getMessage() da superclasse.

6) Crie uma classe executável chamada Calculadora que testa as operações.
