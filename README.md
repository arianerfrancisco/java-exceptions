# Tratamento de Exceções no Java

###  Exceção: evento que interrompe o fluxo normal do processamento de uma classe. 
###  Error: Usado pela JVM e serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar. Não podem ser evitadas. Aqui não se aplica Try/Catch. Erros não checados pelo compilador – eventos irrecuperáveis.
###  Unchecked (Runtime): Exceptions que podem ser evitados se forem tratados e analisados. Geralmente erro de lógica, ex: dividir por zero ou tentar acessar índice inexistente num array.
###  Checked Exception: Exceptions que devem ser evitados e tratados para o programa funcionar. Ex: acessar um arquivo que não existe.
