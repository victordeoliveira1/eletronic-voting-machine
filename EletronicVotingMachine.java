
public class EletronicVotingMachine {
    // Atributes
    private Candidate[] candidates;
    private int nullVotes;
    private int maxVotes;

    // Construtor
    public EletronicVotingMachine(Candidate[] candidates) {
        if (candidates == null) {
            throw new IllegalArgumentException("Invalid candidates array");
        }
        this.candidates = candidates;
        this.nullVotes = 0;
        this.maxVotes = 10;
    }

    // Methods
    public void startVoting() {
        
    }

    public void receiveVote(int number) {
        boolean voteIsNull = true;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getNumber() == number) {
                candidates[i].addVotes();
                voteIsNull = false;
                break;
            }
            if (voteIsNull) {
                setNullVotes(getNullVotes() + 1);
            }
        }

    }

    public void countVotes() {

    }

    public void showCandidates() {
        System.out.println("Candidates:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.printf("%02d - %s%n", candidates[i].getNumber(), candidates[i].getName());
        }
    }

    // Getters and Setters
    public int getNullVotes() {
        return this.nullVotes;
    }

    public void setNullVotes(int nullVotes) {
        this.nullVotes = nullVotes;
    }

}
