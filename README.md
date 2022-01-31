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


<h2>  🔸 Blocos try/catch-finally </h2>
 <h3>  ❗ Try:  </h3>
<ul> 
  <li> Região onde se encontra o código que queremos verificar se irá ou não lançar uma exceção. </li>
  <li> Caso ocorra uma exceção em algum ponto, o restante do código contido no bloco try não será executado.  </li>
  <li> O bloco try não pode ser declarado sozinho, por tanto, precisa estar seguido de um ou vários blocos catch e/ou de um bloco finally.  </li>
</ul>
  <h3>  ❗ Bloco catch:  </h3>
  <ul> 
     <li>  Região onde se encontra o possível tratamento da exceção. Isso significa que só será executado caso o bloco try apresentar alguma exceção.</li>
   <li>    Recebe como argumento a classe ou subclasse da possível exceção.</li>
     <li>  No seu escopo ficam as instruções de como tratar essa exceção.</li>
     <li>  Pode haver mais de um bloco catch, porém, será executado apenas o primeiro bloco que identificar a exceção.</li>
     <li>  Importante: Caso você utilize mais de um catch e houver exceções de uma mesma hierarquia de classes, certifique-se que a classe mais genérica esteja como argumento do último catch. Caso contrário, qualquer exceção sempre cairá neste primeiro catch, assim fazendo com que a exception mais específica não seja verificada.</li>
</ul> 
     <h3>  ❗ Bloco finally:  </h3>
     <ul> 
      <li> Este bloco é opcional, mas caso seja construído, quase sempre será executado. (A menos que seja forçada sua parada, por exemplo, com um System.exit(0), no catch) </li>
      <li> Dentro do bloco finally, poderá conter outros blocos try, catch, bem como outro finally.</li>
     <li>  Geralmente utilizado quando precisamos executar algum código independente se ocorrer exception ou não. </li>
  </ul> 

<h2> 🔸 Cláusulas throws e throw </h2>
<h3> ❗ Cláusula throws  </h3>
 <ul> 
      <li> Usada na assinatura do método. </li>
      <li> Necessária apenas para exceções checked. </li>
     <li>  Informa ao chamador que este método pode lançar uma das exceções listadas no escopo do método. Isso obriga a fazer a captura dessa exception (try-catch) ou relançar o throws. </li>
  </ul> 
<h3>  ❗ Cláusula throw  </h3>
 <ul> 
      <li>  É usada para lançar explicitamente uma exceção de um método ou de qualquer bloco de código. </li>
      <li> Usada principalmente para lançar exceções personalizadas </li>    
  </ul> 

   <h2> 📢 Importante: </h4> 
   
   <li>    O fluxo de execução "normal" do programa para imeditamente apos a execução da cláusula throw. O bloco try envolvente mais próximo é verificado para encontrar um bloco catch que corresponda ao tipo de exceção.</li>
     <li>  Caso encontre essa correspondência, o controlado é transferido para esse bloco. Caso contrário, o próximo bloco try envolvente é verificado e assim por diante.</li>
     <li>  Outro caso, é se nenhuma captura for encontrada, o manipulador da exceção padrão interromperá o programa.  </li>
    </ul> 
    
   
<h2> Documentação </h2>
<strong> <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html"> Class Exception </a></strong>

<h2> Referências </h2>
<strong> <a href="https://github.com/cami-la/exceptions-java/blob/master/src/br/com/dio/exceptions/DivisaoNaoExataException.java"> Camila Cavalcante - DIO  </a></strong>

<h2> Este repositório foi criado para fins de estudo 🤝 </h2>

