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

<h2> Documentação </h2>
<strong> <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html"> Class Exception </a></strong>
