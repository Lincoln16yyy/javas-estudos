# Prática POO 02 - Encapsulamento

**Módulo:** Gestão Financeira de Contas Estudantis  
**Conceito:** Encapsulamento em Programação Orientada a Objetos  
**Data:** 08/10/2026  
**Professor:** João Paulo  
**Instituição:** IF Campus Picos

## 📋 Descrição

Este módulo implementa um sistema de gestão financeira de contas estudantis aplicando os princípios do **Encapsulamento**:

- Atributos privados (`private`)
- Acesso controlado via getters e setters
- Imutabilidade de identificadores (matrícula, número da conta)
- Validação de regras de negócio nos métodos

## 🏗️ Estrutura das Classes

### `Aluno`
| Atributo | Tipo | Visibilidade | Observação |
|----------|------|--------------|------------|
| matricula | String | `private final` | Imutável após criação |
| nome | String | `private` | Mutável (tem setter) |
| email | String | `private` | Mutável (tem setter) |

**Métodos:**
- `Aluno(matricula, nome, email)` - Construtor
- `exibirPerfil()` - Retorna dados formatados
- Getters para todos os atributos
- Setters apenas para `nome` e `email`

### `ContaEstudantil`
| Atributo | Tipo | Visibilidade | Observação |
|----------|------|--------------|------------|
| numeroConta | String | `private final` | Imutável após criação |
| saldo | double | `private` | Modificado apenas via operações |
| titular | Aluno | `private final` | Imutável após criação |
| limiteCredito | double | `private final` | Imutável após criação |

**Métodos:**
- `ContaEstudantil(numeroConta, titular, limiteCredito)` - Construtor (saldo = 0.0)
- `depositar(valor)` - Adiciona ao saldo se valor > 0
- `pagar(valor)` - Deduz do saldo se (saldo + limite) >= valor
- `transferir(destino, valor)` - Usa `pagar` + `depositar`
- Getters para todos os atributos (sem setters para imutáveis)

## ▶️ Como Executar

```bash
cd src/PraticaPOO02_Encapsulamento
javac *.java
java Main
```

## 🧪 Cenários de Teste (Main)

1. **Instanciação:** Cria 2 alunos (Carlos Silva e Beatriz Souza)
2. **Contas:** Cria 2 contas estudantis associadas aos alunos
3. **Depósito e Validação:** Tenta depósito negativo (falha) → Depósito válido R$ 100,00
4. **Pagamento com Limite:** Pagamento R$ 130,00 com saldo R$ 100,00 + limite R$ 50,00
5. **Transferência:** Transfere R$ 20,00 de Carlos para Beatriz

## 🎯 Conceitos Avançados Analisados

### 1. Vazamento de Encapsulamento (`getTitular()`)
```java
// PROBLEMA: Retorna referência direta ao objeto interno
contaDoCarlos.getTitular().setNome("Nome Alterado"); // Modifica estado externamente!
```

**Soluções:**
- Cópia defensiva (defensive copy)
- DTO/Record imutável
- Tornar `Aluno` imutável (sem setters)

### 2. Single Responsibility Principle (SRP)
Colocar lógica de envio de e-mail no método `pagar()` viola SRP:
- **Responsabilidade 1:** Operações financeiras
- **Responsabilidade 2:** Infraestrutura de e-mail (SMTP)

**Solução:** Separar em `NotificacaoService` + Observer/Events

### 3. Acoplamento no `transferir()`
- **Auto-acoplamento (ContaEstudantil → ContaEstudantil):** Aceitável
- **Acoplamento com API externa (BancoDoBrasilAPI):** Problemático

**Solução:** Interface `TransferenciaValidador` + Injeção de Dependência (DIP)

## 📚 Conceitos Demonstrados

- ✅ Encapsulamento (private + getters/setters controlados)
- ✅ Imutabilidade (atributos `final`)
- ✅ Validação de regras de negócio
- ✅ Construtores com inicialização controlada
- ✅ Sobrescrita de `toString()`
- ✅ Análise de vazamento de encapsulamento
- ✅ Single Responsibility Principle (SRP)
- ✅ Dependency Inversion Principle (DIP)
- ✅ Acoplamento e coesão

---

**Desenvolvido por:** Lincoln  
**Curso:** Análise e Desenvolvimento de Sistemas - IF Campus Picos