package PraticaPOO02_Encapsulamento;

/**
 * Classe principal para testar o módulo de Gestão Financeira de Contas Estudantis.
 * Executa os cenários descritos na Prática POO 02 - Encapsulamento.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  PRÁTICA POO 02 - ENCAPSULAMENTO");
        System.out.println("  Gestão Financeira de Contas Estudantis");
        System.out.println("==================================================\n");

        // ============================================
        // INSTANCIAÇÃO: Cria 2 objetos do tipo Aluno
        // ============================================
        System.out.println(">>> 1. INSTANCIAÇÃO DOS ALUNOS");
        System.out.println("--------------------------------------------------");
        
        Aluno carlos = new Aluno("2026001", "Carlos Silva", "carlos.silva@email.com");
        Aluno beatriz = new Aluno("2026002", "Beatriz Souza", "beatriz.souza@email.com");
        
        System.out.println(carlos.exibirPerfil());
        System.out.println();
        System.out.println(beatriz.exibirPerfil());
        System.out.println();

        // ============================================
        // CONTAS: Cria 2 objetos de ContaEstudantil
        // ============================================
        System.out.println(">>> 2. CRIAÇÃO DAS CONTAS ESTUDANTIS");
        System.out.println("--------------------------------------------------");
        
        // Carlos: limite de crédito R$ 50,00
        ContaEstudantil contaCarlos = new ContaEstudantil("1001", carlos, 50.0);
        // Beatriz: limite de crédito R$ 30,00
        ContaEstudantil contaBeatriz = new ContaEstudantil("1002", beatriz, 30.0);
        
        System.out.println(contaCarlos.exibirConta());
        System.out.println();
        System.out.println(contaBeatriz.exibirConta());
        System.out.println();

        // ============================================
        // DEPÓSITO E VALIDAÇÃO
        // ============================================
        System.out.println(">>> 3. DEPÓSITO E VALIDAÇÃO");
        System.out.println("--------------------------------------------------");
        
        // Tenta depósito com valor negativo (deve falhar)
        System.out.println("Tentando depositar R$ -20,00 na conta do Carlos...");
        boolean depositoInvalido = contaCarlos.depositar(-20.0);
        System.out.println("Resultado: " + (depositoInvalido ? "Sucesso" : "FALHA (valor inválido)"));
        System.out.println("Saldo após tentativa: R$ " + String.format("%.2f", contaCarlos.getSaldo()));
        System.out.println();
        
        // Depósito válido de R$ 100,00
        System.out.println("Realizando depósito válido de R$ 100,00 na conta do Carlos...");
        boolean depositoValido = contaCarlos.depositar(100.0);
        System.out.println("Resultado: " + (depositoValido ? "Sucesso" : "FALHA"));
        System.out.println("Saldo após depósito: R$ " + String.format("%.2f", contaCarlos.getSaldo()));
        System.out.println();

        // ============================================
        // PAGAMENTO COM LIMITE
        // ============================================
        System.out.println(">>> 4. PAGAMENTO COM LIMITE DE CRÉDITO");
        System.out.println("--------------------------------------------------");
        System.out.println("Saldo atual do Carlos: R$ " + String.format("%.2f", contaCarlos.getSaldo()));
        System.out.println("Limite de crédito: R$ " + String.format("%.2f", contaCarlos.getLimiteCredito()));
        System.out.println("Disponível (Saldo + Limite): R$ " + String.format("%.2f", (contaCarlos.getSaldo() + contaCarlos.getLimiteCredito())));
        System.out.println();
        
        // Tenta pagamento de R$ 130,00 (saldo 100 + limite 50 = 150, logo 130 é autorizado)
        System.out.println("Tentando pagar R$ 130,00 na conta do Carlos...");
        boolean pagamento = contaCarlos.pagar(130.0);
        System.out.println("Resultado: " + (pagamento ? "Sucesso (pagamento autorizado)" : "FALHA (saldo + limite insuficiente)"));
        System.out.println("Saldo após pagamento: R$ " + String.format("%.2f", contaCarlos.getSaldo()));
        System.out.println("Saldo ficou negativo? " + (contaCarlos.getSaldo() < 0 ? "SIM" : "NÃO"));
        System.out.println("Limite foi respeitado? " + (Math.abs(contaCarlos.getSaldo()) <= contaCarlos.getLimiteCredito() ? "SIM" : "NÃO"));
        System.out.println();

        // ============================================
        // TRANSFERÊNCIA ENTRE OBJETOS
        // ============================================
        System.out.println(">>> 5. TRANSFERÊNCIA ENTRE CONTAS");
        System.out.println("--------------------------------------------------");
        System.out.println("Estado ANTES da transferência:");
        System.out.println("  Conta Carlos: Saldo = R$ " + String.format("%.2f", contaCarlos.getSaldo()));
        System.out.println("  Conta Beatriz: Saldo = R$ " + String.format("%.2f", contaBeatriz.getSaldo()));
        System.out.println();
        
        // Transfere R$ 20,00 da conta do Carlos para a conta da Beatriz
        System.out.println("Realizando transferência de R$ 20,00 da conta do Carlos para a conta da Beatriz...");
        boolean transferencia = contaCarlos.transferir(contaBeatriz, 20.0);
        System.out.println("Resultado: " + (transferencia ? "Sucesso" : "FALHA"));
        System.out.println();
        
        System.out.println("Estado APÓS a transferência:");
        System.out.println("  Conta Carlos: Saldo = R$ " + String.format("%.2f", contaCarlos.getSaldo()));
        System.out.println("  Conta Beatriz: Saldo = R$ " + String.format("%.2f", contaBeatriz.getSaldo()));
        System.out.println();

        // ============================================
        // EXIBIÇÃO FINAL
        // ============================================
        System.out.println(">>> 6. RESUMO FINAL");
        System.out.println("--------------------------------------------------");
        System.out.println(contaCarlos.exibirConta());
        System.out.println();
        System.out.println(contaBeatriz.exibirConta());
        System.out.println();

        // ============================================
        // PRATICANDO CONCEITOS AVANÇADOS - DEMONSTRAÇÃO
        // ============================================
        System.out.println("==================================================");
        System.out.println("  PRATICANDO CONCEITOS AVANÇADOS");
        System.out.println("==================================================\n");
        
        demonstrarProblemaEncapsulamento();
        System.out.println();
        demonstrarSingleResponsibility();
        System.out.println();
        demonstrarAcoplamento();
    }

    /**
     * Demonstrar o problema de vazamento de encapsulamento ao retornar referência direta ao objeto Aluno.
     */
    private static void demonstrarProblemaEncapsulamento() {
        System.out.println(">>> ANÁLISE: getTitular() e Encapsulamento");
        System.out.println("--------------------------------------------------");
        
        Aluno alunoTeste = new Aluno("99999", "Aluno Teste", "teste@email.com");
        ContaEstudantil contaTeste = new ContaEstudantil("9999", alunoTeste, 100.0);
        
        System.out.println("Nome original do aluno: " + alunoTeste.getNome());
        
        // PROBLEMA: Código externo pode modificar o estado interno do Aluno
        // contaTeste.getTitular().setNome("Nome Alterado Externamente");
        // Descomente a linha acima para ver o problema!
        
        // Simulando o problema (comentado para não alterar o estado real):
        System.out.println("Se executássemos: contaTeste.getTitular().setNome(\"Nome Alterado\")");
        System.out.println("O nome do aluno seria alterado FORA da classe Aluno!");
        System.out.println("Isso VIOLA o encapsulamento, pois o estado interno do Aluno");
        System.out.println("é modificado sem passar pelos controles da própria classe.");
        System.out.println();
        System.out.println("SOLUÇÕES MAIS SEGURAS:");
        System.out.println("1. Retornar uma CÓPIA DEFENSIVA (new Aluno(...))");
        System.out.println("2. Retornar um DTO/Record imutável com apenas dados necessários");
        System.out.println("3. Retornar apenas String com nome, não o objeto completo");
        System.out.println("4. Tornar Aluno imutável (todos atributos final, sem setters)");
    }

    /**
     * Demonstrar violação do Single Responsibility Principle.
     */
    private static void demonstrarSingleResponsibility() {
        System.out.println(">>> ANÁLISE: Single Responsibility Principle (SRP)");
        System.out.println("--------------------------------------------------");
        System.out.println("PROBLEMA: Colocar lógica de envio de e-mail dentro de ContaEstudantil.pagar()");
        System.out.println("FERE o SRP porque a classe ContaEstudantil teria DUAS responsabilidades:");
        System.out.println("  1. Gerenciar operações financeiras (saldo, limite, transferências)");
        System.out.println("  2. Enviar notificações por e-mail (conectar SMTP, formatar mensagem, etc.)");
        System.out.println();
        System.out.println("CONSEQUÊNCIAS:");
        System.out.println("  - Difícil testar pagar() sem enviar e-mails reais");
        System.out.println("  - Mudança no servidor de e-mail exige alterar classe financeira");
        System.out.println("  - Viola coesão: lógica financeira misturada com infraestrutura");
        System.out.println("  - Não é possível reutilizar ContaEstudantil sem dependência de e-mail");
        System.out.println();
        System.out.println("ONDE DEVERIA FICAR:");
        System.out.println("  - Em um SERVIÇO DE NOTIFICAÇÃO separado (ex: NotificacaoService)");
        System.out.println("  - Usar PADRÃO OBSERVER ou EVENTOS para desacoplar");
        System.out.println("  - ContaEstudantil emite evento 'PagamentoRealizado',");
        System.out.println("    e um listener/handler envia o e-mail");
    }

    /**
     * Demonstrar análise de acoplamento.
     */
    private static void demonstrarAcoplamento() {
        System.out.println(">>> ANÁLISE: Acoplamento no método transferir()");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Acoplamento entre ContaEstudantil e ela mesma:");
        System.out.println("   - É ACEITÁVEL (baixo), pois é acoplamento a SI MESMA");
        System.out.println("   - A classe conhece sua própria estrutura, o que é natural");
        System.out.println("   - Não cria dependência externa problemática");
        System.out.println();
        System.out.println("2. Se transferir() recebesse BancoDoBrasilAPI:");
        System.out.println("   - Acoplamento ficaria ALTO e PROBLEMÁTICO");
        System.out.println("   - ContaEstudantil dependeria de API externa específica");
        System.out.println("   - Difícil testar (precisa de mock da API real)");
        System.out.println("   - Viola DIP (Dependency Inversion Principle)");
        System.out.println();
        System.out.println("COMO ENCAPSULAMENTO E INTERFACES AJUDAM:");
        System.out.println("  - Definir INTERFACE TransferenciaValidador");
        System.out.println("  - ContaEstudantil depende da INTERFACE, não da implementação");
        System.out.println("  - BancoDoBrasilAPI implementa a interface");
        System.out.println("  - Injeção de dependência permite trocar implementação");
        System.out.println("  - Facilita testes com Mock/Stub da interface");
    }
}