<h1> Tratamento de Exceções no Java </h1>

<h2> 🔸 Exceção </h2>
<ul> 
  <li> Evento que interrompe o fluxo normal do processamento de uma classe. </li>
</ul>

<h2> 🔸 Error </h2>
<ul> 
  <li> Usado pela JVM e serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar. </li>
  <li> Não podem ser evitadas. Aqui não se aplica Try/Catch. Erros não checados pelo compilador – eventos irrecuperáveis. </li>
</ul>

<h2> 🔸 Unchecked (Runtime) </h2>
<ul> 
  <li> Exceptions que podem ser evitados se forem tratados e analisados. </li>
  <li> Geralmente erro de lógica, ex: dividir por zero ou tentar acessar índice inexistente num array. </li>
</ul>

<h2> 🔸  Checked Exception </h2>
<ul> 
  <li> Exceptions que devem ser evitados e tratados para o programa funcionar. </li>
  <li> Ex: acessar um arquivo que não existe. </li>
</ul>


<h2>  🔸 Blocos try/catch/finally </h2>

     <h1> Bloco try:  </h1>
    Região onde se encontra o código que queremos verificar se irá ou não lançar uma exceção.
    Caso ocorra uma exceção em algum ponto, o restante do código contido no bloco try não será executado.
    O bloco try não pode ser declarado sozinho, por tanto, precisa estar seguido de um ou vários blocos catch e/ou de um bloco finally.

    <h1> Bloco catch:  </h1>
    Região onde se encontra o possível tratamento da exceção. Isso significa que só será executado caso o bloco try apresentar alguma exceção.
    Recebe como argumento a classe ou subclasse da possível exceção.
    No seu escopo ficam as instruções de como tratar essa exceção.
    Pode haver mais de um bloco catch, porém, será executado apenas o primeiro bloco que identificar a exceção.
    Importante: Caso você utilize mais de um catch e houver exceções de uma mesma hierarquia de classes, certifique-se que a classe mais genérica esteja como argumento do último catch. Caso contrário, qualquer exceção sempre cairá neste primeiro catch, assim fazendo com que a exception mais específica não seja verificada.

     <h1> Bloco finally:  </h1>
    Este bloco é opcional, mas caso seja construído, quase sempre será executado. (A menos que seja forçada sua parada, por exemplo, com um System.exit(0), no catch)
    Dentro do bloco finally, poderá conter outros blocos try, catch, bem como outro finally.
    Geralmente utilizado quando precisamos executar algum código independente se ocorrer exception ou não. 

<h2> 🔸 Cláusulas throws e throw </h2>

     <h1> Cláusula throws  </h1>
    Usada na assinatura do método.
    Necessária apenas para exceções checked.
    Informa ao chamador que este método pode lançar uma das exceções listadas no escopo do método. Isso obriga a fazer a captura dessa exception (try-catch) ou relançar o throws.

    <h1>  Cláusula throw  </h1>
    É usada para lançar explicitamente uma exceção de um método ou de qualquer bloco de código.
    Usada principalmente para lançar exceções personalizadas
    Importante:
    O fluxo de execução "normal" do programa para imeditamente apos a execução da cláusula throw. O bloco try envolvente mais próximo é verificado para encontrar um bloco catch que corresponda ao tipo de exceção.
    Caso encontre essa correspondência, o controlado é transferido para esse bloco. Caso contrário, o próximo bloco try envolvente é verificado e assim por diante.
    Outro caso, é se nenhuma captura for encontrada, o manipulador da exceção padrão interromperá o programa.
    
   
<h2> Documentação </h2>
<strong> <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html"> Class Exception </a></strong>
