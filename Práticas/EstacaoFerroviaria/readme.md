# Descrição do problema

### Estação ferroviária

Uma estação ferroviária é composta por uma ou mais linhas ferroviárias.
Ao criar uma estação rodoviária, obrigatoriamente devem ser definidas as
linhas ferroviárias que irão compor sua estrutura. Em uma linha ferroviária
podem estar estacionados diversos recursos ferroviários, que opcionalmente
podem ser informados durante a criação da estação ferroviária.
Recursos ferroviários podem ser vagões, locomotivas ou trens. Um trem é
formado por vagões e locomotivas que devem ser informados durante a
criação do trem. Uma estação ferroviária tem uma sigla e uma descrição.

### Linha 

Uma linha ferroviária tem um número (que a diferencia de outra linha
dentro da mesma estação), uma extensão em metros e uma descrição. 

### Vagão

Um vagão é descrito por um número de série, tipo, capacidade de carga,
comprimento entre testeiras e comprimento dos engates, podendo ser
opcionalmente informados durante a sua criação.

### Locomotiva

Uma locomotiva é descrita por um número de série, capacidade de tração
e comprimento, também podendo ser opcionalmente informados durante a
sua criação. Um trem é descrito por um prefixo (ex: NAG1010) e data de
formação.

### Trem

Um trem é formado em uma estação ferroviária de origem e
tem como destino uma outra estação ferroviária, ou seja, a estação de
origem não pode ser igual à estação de destino (também deve ser
informado durante a criação). Um trem não pode ter mais do que 150
recursos (vagões e locomotivas).
