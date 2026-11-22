# AV01 - Controle de Produtos

**Instituição:** IFPI - Campus Picos  
**Curso:** Análise e Desenvolvimento de Sistemas (ADS) - M2  
**Disciplina:** Programação Orientada a Objetos  
**Professora:** Isadora Martins  
**Atividade:** Atividade Avaliativa I  
**Dupla:** Lincoln e Roberto

## 📋 Descrição

Programa em Java que registra produtos de uma pequena loja e acompanha as
quantidades disponíveis no estoque. A atividade pratica os conceitos de
**classes, objetos, atributos, métodos, instanciação, controle de acesso e
encapsulamento**.

## 🏗️ Organização dos arquivos

| Arquivo | Responsabilidade |
| --- | --- |
| `Produto.java` | Modela o produto: guarda os dados, valida os valores e executa as operações de estoque. |
| `Main.java` | Classe principal: cria dois objetos `Produto`, exibe as informações e testa as operações. |

O código foi dividido em apenas duas classes, sem herança ou polimorfismo,
conforme as orientações da atividade. A classe `Produto` concentra o estado e
as regras do produto, e a classe `Main` apenas utiliza esses objetos.

## 🔒 Onde foi aplicado o encapsulamento

O encapsulamento está na classe `Produto`:

- Todos os atributos são `private`: `nome`, `codigo`, `preco` e `quantidade`.
  Nenhuma outra classe consegue alterá-los diretamente.
- O acesso acontece somente pelos **getters** (`getNome`, `getCodigo`,
  `getPreco`, `getQuantidade`) e pelos **setters** (`setNome`, `setCodigo`,
  `setPreco`, `setQuantidade`).
- Os setters validam os dados antes de gravar. Se o valor for inválido, o
  atributo mantém o valor anterior e o método retorna `false`:

| Atributo | Regra de validação |
| --- | --- |
| `nome` | Não pode ser nulo nem vazio |
| `codigo` | Deve ser maior que zero |
| `preco` | Não pode ser negativo |
| `quantidade` | Não pode ser negativa |

- O estoque só muda pelos métodos `adicionarEstoque(int)` e
  `removerEstoque(int)`. A remoção é recusada quando não há quantidade
  suficiente disponível.
- O construtor também passa pelos setters, então um objeto nunca nasce com
  dados inválidos.

## ▶️ Como executar

Pré-requisito: JDK instalado.

```bash
cd src/AV01_ControleDeProdutos
javac Produto.java Main.java
java Main
```

## 🖥️ Exemplo de saída

```
--- CONTROLE DE PRODUTOS ---
Produto: Teclado
Código: 101
Preço: R$ 80,00
Quantidade: 10

Produto: Mouse
Código: 102
Preço: R$ 45,90
Quantidade: 7

Adicionando 5 unidades...
Estoque atual: 15

Removendo 3 unidades...
Estoque atual: 12
...
```

## 🧪 Cenários testados no `Main`

1. Criação de dois produtos (`Teclado` e `Mouse`).
2. Exibição das informações de cada produto.
3. Adição de 5 unidades ao estoque do teclado.
4. Remoção de 3 unidades do estoque do teclado.
5. Tentativa de remover mais unidades do que o estoque possui (recusada).
6. Tentativas de definir preço negativo, quantidade negativa, código inválido
   e nome vazio (todas recusadas).
7. Atualização válida do preço do mouse e exibição do estado final.

## 📚 Conceitos praticados

- Classe e objeto
- Atributos e métodos
- Instanciação com `new`
- Encapsulamento com `private` + getters/setters
- Validação de dados
- Controle de estoque com regras de negócio
- Formatação de valores monetários

---

**Dupla:** Lincoln e Roberto
