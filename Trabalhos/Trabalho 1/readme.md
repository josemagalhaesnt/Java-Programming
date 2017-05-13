Trabalho de POO
Prof Lucas Silva

-------------
 Fundamentos
-------------

Uma imagem é uma matriz (Array multidimensional), ou seja ela possui uma altura (A), largura (L) e cada célula (i, j) , 
i = 1 .. L, j = 1 .. A é chamada de píxel.

Cada píxel(célula da matriz) possui um valor inteiro entre 0 e K, onde K geralmente é 255. Os píxels com valores próximos de 
zero são escuros (0 é preto total) e píxels próximos de K são píxels mais claros (K é branco).

Essa imagem pode ser armazenada em arquivos. Cada arquivo vai representar essa imagem de alguma forma (bytes, texto, ...).
Um tipo de arquivo muito simples é o PGM Plain, pois a imagem é armazenada em formato de texto simples.

--------------------------------
 ESTRUTURA DO ARQUIVO PGM PLAIN
--------------------------------
Regras iniciais:

	- Dentro do arquivo PGM podem ocorrer comentários precedidos do caractere #. Podem ocorrer no início de linhas ou ao final. 
  Esses textos são ignorados.
	
	- As linhas não podem conter mais de 70 caracteres, sem contar com comentários.

Detalhes da Estrutura

	- O formato (PGM plain) inicia pela string "P2". Essa string deve aparecer sozinha na primeira linha válida do arquivo. 
  Uma linha válida é uma linha que não-comentada.

	- A segunda linha válida do arquivo possui dois valores inteiros separados por espaço: L - Largura, A - Altura da imagem.

	- A terceira linha possui o valor de intensidade máxima da imagem. Geralmente é 255.

	- Cada linha do restante do arquivo é um conjunto de números inteiros separados por espaço, sem exceder 70 'caracteres' por linha. 
  Os valores devem ser lidos da esquerda para a direita e linha-a-linha de modo que cada L números lidos no arquivo de texto, 
  uma linha da matriz que irá representar a imagem seja preenchida. O arquivo total possui A * L números inteiros.

	Ex. 

		P2
		30 4
		255
		10 11 12 13 14 15 16 17 18 19 
		20 21 22 23 24 25 26 27 28 29 
		30 31 32 33 34 35 36 37 38 39 
		40 41 42 43 44 45 46 47 48 49 
		50 51 52 53 54 55 56 57 58 59 
		60 61 62 63 64 65 66 67 68 69 
		70 71 72 73 74 75 76 77 78 79 
		80 81 82 83 84 85 86 87 88 89 
		90 91 92 93 94 95 96 97 98 99 
		100 101 102 103 104 105 106 107 108 109
		110 111 112 113 114 115 116 117 118 119
		120 121 122 123 124 125 126 127 128 129 

		Matriz gerada

10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39
40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69
70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99
...

-----------------------------
 PRJ 01 - ENTREGA: 30/05/2017
-----------------------------

Crie uma classe chamada ArquivoPGM. A classe deve ser devidamente encapsulada e ter os atributos: 
	- altura: inteiro, 
	- largura: inteiro, 
	- max: inteiro,
	- imagem: matriz de inteiros,

Além disso, a classe ArquivoPGM deve possuir um método chamado carregaPGM que recebe uma string representando o caminho para um 
arquivo PGM como parâmetro. A classe deve verificar se o arquivo realmente existe e caso positivo deve ler todo o arquivo e 
carregar as informações no objeto da classe. A classe ArquivoPGM também deve possuir um método chamado escrevePGM, o qual irá receber 
como parâmetro o caminho do arquivo e irá criá-lo a partir dos dados contidos no objeto da classe. 

Para teste da classe, foram disponibilizadas imagens no formato PGM Plain. Crie um programa que leia um arquivo PGM
e crie um outro utilizando os métodos carregaPGM e escrevePGM. Lembrando que deve ser feita uma classe de teste 
contendo um método main em um arquivo separado.



