Os aquivos com a resolução dos exercícios podem ser encontrados <a href="https://github.com/fabianojunior139/Academia-Java-Atos/tree/main/Back-end/Exercicio%201%20-%20Primeiros%20contatos%20com%20POO/Exercicio1_POO/src/Exercicios">AQUI!</a>
<br><br>
Ou podem ser encontrados na seguinte pasta: 

```ts
src/Exercicios 
```

Academia Java 1-2023 <br>
Exercícios Java OO <br>
Prof. Lucas A. Schlestein <br>

- [x] 1 - Escreva uma classe, que represente uma Pessoa. As informações que devem estar contidas nessas classe, são: (nome, email, CPF). Atentar para os tipos de dados inerentes a cada informação. Ex. String email;


- [x] 2 - Tendo como base a Questão 1, crie um instância da classe, e preencha os atributos da mesma. Ex. Pessoa p = new Pessoa(); p.nome = “Pedro”;


- [x] 3 - Tendo como base a Questão 1, crie um método para que os valores dos atributos, sejam definidos através do teclado, via console. (importar as classes BufferedReader, ou Scanner), do JDK.


- [x] 4 - Tendo como base a Questão 3, crie um método para que os valores dos atributos, sejam definidos através do teclado, via console. (importar as classes BufferedReader, ou Scanner), do JDK. Exibir as informações no console, após a criação dos objetos.


- [x] 4 - Escreva uma classe, que represente um Aluno. Os atributos dessa classe são: (nome, email, matrícula). Crie um método principal, e crie 3 objetos (instâncias) da classe Aluno. As informações devem ser solicitadas ao usuário via console da IDE. Preferencialmente utilizar métodos na classe para solicitar essas informações. Exibir as informações no console, após a criação dos objetos.


- [x] 5 - Tendo como base a Questão 4, reescreva o código com os mesmos atributos da questão anterior, porém, dessa vez, os mesmos devem ser atribuídos via construtor da classe. Criar pelo menos dois construtores nessa classe. Criar um método que exiba as informações do objeto no console.


- [x] 6 - Uma universidade está com as inscrições abertas para o vestibular de inverno 2023. Sendo assim, foi solicitado ao depto. de TI da mesma, a criação de uma aplicação para cadastrar os alunos para o vestibular. As informações que devem ser solicitadas para cadastro dos candidatos são: (CPF, nome, email, curso). Para evitar erros de digitação, é necessário verificar se o CPF que está sendo inserido, é válido. A verificação do CPF deve ser feita através de um método, que deve retornar, verdadeiro ou falso após a validação. O cadastro não pode ser realizado, caso o CPF digitado seja inválido, e uma mensagem deve ser retornada via console para o usuário do sistema.
Preferencialmente, utilizar construtores, métodos, e algum tipo de estrutura (list, array) para armazenar os candidatos já cadastrados.
*Não é necessário implementar o algoritmo de validação do dígito verificador do CPF. Verificar se o número de dígitos é 11 está de bom tamanho. Caso deseje implementar o algoritmo para verificar, será considerado.


- [x] 7 - Crie uma classe ContaCorrente que obedeça à descrição abaixo: A classe possui o atributo saldo do tipo float e os métodos depositar e sacar. O método depositar, deve adicionar o valor passado por parâmetro ao atributo saldo. O método sacar deve reduzir o valor passado por parâmetro do saldo já existente.

Crie um objeto novaConta do tipo ContaCorrente.
Faça um depósito de R$ 2000,00, utilizando o método criado anteriormente;
Faça um saque de R$800,00, utilizando o método criado anteriormente;
Faça um saque de R$1500,00, utilizando o método criado anteriormente;
Exiba o saldo da conta.
Bônus:

Verificar antes de sacar, se o saldo da conta é suficiente para o saque. Caso não seja, informe via console ao usuário.
Torne o atributo saldo privado, e ajuste o código para que a classe principal exiba o saldo desta conta. Criar um novo método para fazer essa exibição.
Implementar via console uma interface para exibir o saldo, sacar e depositar na conta.
