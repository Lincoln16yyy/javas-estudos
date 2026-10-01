# Biblioteca - Controle de Empréstimos

Sistema simplificado para gerenciar o controle de empréstimos de uma biblioteca escolar.

## Classes

| Classe | Descrição |
| --- | --- |
| `Livro` | Atributos `titulo`, `autor` e `disponivel` (inicia `true`). Métodos `emprestar()` (exibe aviso se já estiver emprestado) e `devolver()`. |
| `Leitor` | Atributos `nome` e `matricula` (aluno ou professor). |
| `Emprestimo` | Liga um `Livro` a um `Leitor` com uma `dataEmprestimo`. O construtor chama `livro.emprestar()` e `exibirDetalhes()` mostra as informações formatadas. |
| `Main` | Simula os empréstimos, a tentativa de empréstimo duplicado e a devolução. |

## Como executar

```bash
cd src/Biblioteca
javac *.java
java Main
```
