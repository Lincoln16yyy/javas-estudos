# ☕ Java Estudos

Repositório com os exercícios e mini-projetos que faço enquanto estudo **Java** (com foco em back-end). Cada pasta dentro de `src/` é um módulo independente e representa uma etapa do aprendizado, indo dos fundamentos até orientação a objetos e estruturas de dados.

> Este é um repositório de estudo: o código prioriza aprender os conceitos, não ser código de produção.

## 📚 Conteúdo

| Módulo | Tema | O que foi praticado |
| --- | --- | --- |
| [`condiçoes`](src/condiçoes) | Controle de fluxo | `if/else`, `switch`, operador ternário, laços de repetição, entrada de dados com `Scanner` |
| [`NivelBasico`](src/NivelBasico) | Fundamentos | Arrays, menu interativo no terminal, `while` + `switch` |
| [`Nivel_intermediario`](src/Nivel_intermediario) | Orientação a objetos e coleções | Classes, `enum`, generics, `LinkedList`, `ArrayList`, `toString()` |
| [`Biblioteca`](src/Biblioteca) | Mini-projeto | Sistema de empréstimos de uma biblioteca escolar |

## 🗂️ Estrutura

```
javas-estudos/
└── src/
    ├── condiçoes/
    │   ├── ifandelse.java
    │   ├── switchCases.java
    │   ├── Ternarios.java
    │   ├── LacosDeRepeticao.java
    │   └── ScannerDoUsuario.java
    ├── NivelBasico/src/
    │   ├── Array.java
    │   ├── Ninja.java
    │   └── cadastrodosninjas.java
    ├── Nivel_intermediario/src/
    │   ├── Ninja.java
    │   ├── GerenciadorNinjas.java
    │   ├── Missoes.java
    │   ├── rankingDeMissoes.java
    │   ├── equipamentosNinjas.java
    │   ├── bolsaGenerica.java
    │   ├── linked_List.java
    │   ├── chamaromain.java
    │   └── Main.java
    └── Biblioteca/
        ├── Livro.java
        ├── Leitor.java
        ├── Emprestimo.java
        ├── Main.java
        └── README.md
```

## 🔎 Detalhes de cada módulo

### `condiçoes` — Controle de fluxo
Exercícios curtos, cada arquivo com um conceito:

- **`ifandelse`** — decide se um ninja pode subir de nível combinando condições com `&&`.
- **`switchCases`** — menu de escolha de personagem usando `switch`.
- **`Ternarios`** — o operador ternário (`condição ? valorSeVerdadeiro : valorSeFalso`) para atribuir um valor em uma linha.
- **`LacosDeRepeticao`** — laço `for` contando clones.
- **`ScannerDoUsuario`** — leitura de texto e número digitados pelo usuário e verificação de idade.

### `NivelBasico` — Fundamentos
- **`cadastrodosninjas`** — menu no terminal (cadastrar, listar, sair) que guarda até 5 ninjas em um array, usando `while`, `switch` e `Scanner`.
- **`Array`** — anotações sobre arrays bidimensionais (matriz de `String`).
- **`Ninja`** — classe vazia, reservada para evoluir.

### `Nivel_intermediario` — Orientação a objetos e coleções
- **`Ninja`** — classe com nome, idade e vila, com `toString()` sobrescrito.
- **`GerenciadorNinjas`** — encapsula uma `LinkedList<Ninja>` com operações de adicionar (no fim e no início), remover o primeiro, acessar por posição e exibir todos.
- **`Main`** — demonstra o `GerenciadorNinjas` em uso.
- **`rankingDeMissoes`** — `enum` com os ranks D, C, B, A e S, cada um com descrição e dificuldade.
- **`Missoes`** — missão com nome e rank, usando o `enum`.
- **`equipamentosNinjas`** e **`bolsaGenerica<T>`** — classe genérica que guarda uma lista de qualquer tipo de equipamento.
- **`linked_List`** — experimentos diretos com `LinkedList<String>` (`add`, `add(índice, item)`, `remove`).
- **`chamaromain`** — cria e exibe uma missão.

### `Biblioteca` — Sistema de empréstimos
Simulação do controle de empréstimos de uma biblioteca escolar, com quatro classes:

| Classe | Responsabilidade |
| --- | --- |
| `Livro` | Guarda título, autor e se está disponível. `emprestar()` avisa se o livro já estiver emprestado e `devolver()` libera ele de novo. |
| `Leitor` | Guarda nome e matrícula (aluno ou professor). |
| `Emprestimo` | Liga um `Livro` a um `Leitor` em uma data. O construtor já chama `livro.emprestar()`. |
| `Main` | Executa o cenário: empréstimo, tentativa de empréstimo duplicado e devolução. |

Mais detalhes no [README do módulo](src/Biblioteca/README.md).

## ▶️ Como executar

**Pré-requisito:** JDK instalado. Os projetos foram criados com o **JDK 26** no IntelliJ IDEA. Alguns arquivos usam `static void main` sem `public`, o que exige uma versão recente (JDK 25 ou superior).

Cada módulo é independente, então compile e execute dentro da pasta dele.

**Biblioteca**
```bash
cd src/Biblioteca
javac *.java
java Main
```

**Nivel_intermediario** (há mais de uma classe com `main`)
```bash
cd src/Nivel_intermediario/src
javac *.java
java Main          # demonstração do GerenciadorNinjas
java chamaromain   # exemplo de missão
java linked_List   # experimentos com LinkedList
```

**NivelBasico**
```bash
cd src/NivelBasico/src
javac cadastrodosninjas.java
java cadastrodosninjas
```

**condiçoes** (os arquivos usam `package condiçoes`, então execute a partir da pasta `src`)
```bash
cd src
javac condiçoes/*.java
java condiçoes.ifandelse
```
Troque `ifandelse` por `switchCases`, `Ternarios`, `LacosDeRepeticao` ou `ScannerDoUsuario` para rodar os outros exercícios.

Você também pode abrir a pasta raiz no **IntelliJ IDEA** e rodar cada `main` pelo botão de execução.

## 🛠️ Tecnologias

- Java (JDK 26)
- IntelliJ IDEA


**Lincoln** — estudante de Análise e Desenvolvimento de Sistemas.

[GitHub: Lincoln16yyy](https://github.com/Lincoln16yyy)
