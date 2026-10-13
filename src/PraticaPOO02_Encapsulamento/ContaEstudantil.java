package PraticaPOO02_Encapsulamento;

/**
 * Classe que representa uma Conta Estudantil para pagamento de mensalidades
 * e crédito de restaurante universitário.
 * Aplicação do princípio de Encapsulamento: atributos privados, acesso controlado via getters.
 * O número da conta é imutável após a criação (apenas getter, sem setter).
 */
public class ContaEstudantil {
    private final String numeroConta; // final = não pode ser alterado após criação
    private double saldo;
    private final Aluno titular; // final = não pode ser alterado após criação
    private final double limiteCredito; // final = não pode ser alterado após criação

    /**
     * Construtor que inicializa a conta estudantil.
     * @param numeroConta Número da conta (imutável)
     * @param titular Aluno titular da conta (imutável)
     * @param limiteCredito Limite de crédito adicional para restaurante/xerox (imutável)
     */
    public ContaEstudantil(String numeroConta, Aluno titular, double limiteCredito) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = 0.0; // Saldo inicializado com 0.0
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Retorna o titular da conta.
     * ATENÇÃO: Retorna a referência direta ao objeto Aluno.
     * Isso permite que código externo modifique o estado do Aluno (ex: conta.getTitular().setNome("X")).
     * Uma abordagem mais segura seria retornar uma cópia defensiva ou um DTO imutável.
     */
    public Aluno getTitular() {
        return this.titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    // Não há setters para numeroConta, titular e limiteCredito (são imutáveis)
    // Não há setter para saldo (modificado apenas via operações controladas: depositar, pagar, transferir)

    /**
     * Adiciona valor ao saldo apenas se o valor for positivo.
     * @param valor Valor a ser depositado
     * @return true se o depósito foi realizado, false caso contrário
     */
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    /**
     * Deduz o valor do saldo. O pagamento só é autorizado se (saldo + limiteCredito) >= valor.
     * @param valor Valor a ser pago
     * @return true se o pagamento foi autorizado, false caso contrário
     */
    public boolean pagar(double valor) {
        if (valor <= 0) {
            return false;
        }
        if ((this.saldo + this.limiteCredito) >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Transfere um valor para outra conta estudantil, utilizando os métodos pagar e depositar.
     * @param destino Conta de destino da transferência
     * @param valor Valor a ser transferido
     * @return true se a transferência foi realizada, false caso contrário
     */
    public boolean transferir(ContaEstudantil destino, double valor) {
        if (destino == null || valor <= 0) {
            return false;
        }
        // Tenta pagar (deduzir da conta de origem)
        if (this.pagar(valor)) {
            // Se pagou com sucesso, deposita na conta de destino
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    /**
     * Retorna uma representação formatada da conta.
     * @return String com as informações da conta
     */
    public String exibirConta() {
        return "=== Conta Estudantil ===\n" +
               "Número: " + numeroConta + "\n" +
               "Titular: " + titular.getNome() + " (Matrícula: " + titular.getMatricula() + ")\n" +
               "Saldo: R$ " + String.format("%.2f", saldo) + "\n" +
               "Limite de Crédito: R$ " + String.format("%.2f", limiteCredito) + "\n" +
               "Disponível (Saldo + Limite): R$ " + String.format("%.2f", (saldo + limiteCredito));
    }

    @Override
    public String toString() {
        return "ContaEstudantil{numeroConta='" + numeroConta + "', saldo=" + saldo + 
               ", titular=" + titular.getNome() + ", limiteCredito=" + limiteCredito + "}";
    }
}