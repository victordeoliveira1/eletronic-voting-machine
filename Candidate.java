public class Candidate {
    // Atributes
    private String name;
    private int number;
    private int votes;

    // Construtor
    public Candidate(String name, int number) {
        this.setName(name);
        this.setNumber(number);
    }

    // Methods
    public void addVotes() {
        setVotes(this.votes++);
    }

    // Getters e Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("invalid number, must be a positive number");
        }
        this.number = number;
    }

    public int getVotes() {
        return this.votes;
    }

    public void setVotes(int votes) {
        if (votes < 0) {
            throw new IllegalArgumentException(
                    "Quantidade de Votos invalido, nao e permitido colocar um valor negativo");
        }
        this.votes = votes;
    }

}