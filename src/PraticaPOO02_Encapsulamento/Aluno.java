package PraticaPOO02_Encapsulamento;

/**
 * Classe que representa um Aluno no sistema de gestão financeira de contas estudantis.
 * Aplicação do princípio de Encapsulamento: atributos privados, acesso controlado via getters/setters.
 * A matrícula é imutável após a criação do objeto (apenas getter, sem setter).
 */
public class Aluno {
    private final String matricula; // final = não pode ser alterada após criação
    private String nome;
    private String email;

    /**
     * Construtor que inicializa todos os atributos do aluno.
     * @param matricula Número de matrícula (imutável)
     * @param nome Nome do aluno
     * @param email E-mail do aluno
     */
    public Aluno(String matricula, String nome, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // Setters (apenas para atributos mutáveis)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna os dados formatados do aluno.
     * @return String com as informações do aluno
     */
    public String exibirPerfil() {
        return "=== Perfil do Aluno ===\n" +
               "Matrícula: " + matricula + "\n" +
               "Nome: " + nome + "\n" +
               "E-mail: " + email;
    }

    @Override
    public String toString() {
        return "Aluno{matricula='" + matricula + "', nome='" + nome + "', email='" + email + "'}";
    }
}