public class Candidato {
    // Atributos
    private String nome;
    private int numero;
    private int votos;

    // Construtor---------------------------------
    public Candidato(String nome, int numero) {
        this.setNome(nome);
        this.setNumero(numero);
    }

    // Getters e Setters ---------------------------------
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Numero invalido, o numero deve ser positivo");
        }
        this.numero = numero;
    }

    public int getVotos() {
        return this.votos;
    }

    public void setVotos(int votos) {
        if (votos < 0) {
            throw new IllegalArgumentException(
                    "Quantidade de Votos invalido, nao e permitido colocar um valor negativo");
        }
        this.votos = votos;
    }
    // Outros Métodos ---------------------------------

    public void incrementarVotos() {
        setVotos(this.votos++);
    }

}