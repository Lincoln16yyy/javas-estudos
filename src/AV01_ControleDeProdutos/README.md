# AV01 - Controle de Produtos

**Dupla:** Lincoln e Roberto  
**Disciplina:** Programação Orientada a Objetos - IFPI Campus Picos

## Descrição

Programa em Java que registra produtos de uma pequena loja e acompanha a
quantidade disponível no estoque. O programa exibe os dados de cada produto,
adiciona unidades e remove unidades quando há estoque suficiente.

## Organização

- `Produto.java`: classe com os dados e as operações do produto.
- `Main.java`: cria dois produtos e testa as operações.

## Encapsulamento

Os atributos `nome`, `codigo`, `preco` e `quantidade` são `private`, então só
podem ser acessados pelos getters e setters da própria classe. Os setters
validam os valores recebidos: o nome não pode ser vazio, o código deve ser
maior que zero e o preço e a quantidade não podem ser negativos. O construtor
também impede a criação de um produto com código inválido. O estoque só muda
por meio de `adicionarEstoque()` e `removerEstoque()`, e a remoção só acontece
quando existe quantidade suficiente.

## Como executar

```bash
cd src/AV01_ControleDeProdutos
javac Produto.java Main.java
java Main
```
