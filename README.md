# Stragegy
### Cenário 1 - Conceitos
#### 1. Você tem uma série de algoritmos que pertencem a uma mesma família. E surge a possibilidade de trocar um algoritmo pelo outro. De forma que quem vai usar esse algoritmo não fique sabendo dessa troca. Sendo assim, quem for usar esse algoritmo, continue usando ele, independente da maneira em que ele é implementado.
#### 2. Isso é o que o Strategy visa resolver.
#### 3. O classe raiz desse padrão é o que podemos chamar de Strategy ( Podendo ser uma Interface ou uma Classe Abstrata ). Ela tem um método, o método doit(), que vai permitir a execução do algoritmo. Só que esse vai ser implementado nas sub-classes concretas que implementam o método doit():
##### a. StrategyA
##### b. StrategyB
##### c. StrategyC
#### 4. Context faz a intermediação entre a chamada do algoritmo pelo cliente, e o algoritmo em si.
#### 5. Quando o Context é instanciado é passado para ele a estratégia ( strategy ), que ele vai usar na execução. Normalmente você cria um construtor que recebe parâmetros, esse é copiado que é um strategy que é copiado para um atributos strategy.
#### 6.  E quando o cliente chama o método execute, ele vai se encarregar de chamar o método de execução do algoritmo: strategy.doit().
### Cenário 2 - Exemplo
#### 1. Eu tenho um sistema de E-commerce e vendo pela internet.
#### 2. E aceito diversas formas de pagamento como:
##### a. Cartão de crédito.
##### b. Débito em conta.
##### c. Boleto bancário.
#### 3. Para acessar o pagamento nessas três formas, levando em conta que cada uma tem as suas peculiaridades, eu posso encapsular cada uma delas como sendo um algoritmo específico, utilizando um padrão Strategy.
#### 4. E na hora de pagar, você diz: eu quero pagar e passa a estratégia do cartão de crédito. E daí todo pagamento vai ser feito com cartão de crédito e pode acontecer esse fluxo pré-estabelecido de acordo com cada uma das formas de pagamento.

