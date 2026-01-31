public class App {
    public static void main(String[] args) {
        Candidate[] candidatesList = {
                new Candidate("Ada Lovelace", 01),
                new Candidate("Alan Turing", 02),
                new Candidate("Marie Curie", 03),
                new Candidate("Albert Einstein", 04),
                new Candidate("Ludwig van Beethoven", 05)
        };
        EletronicVotingMachine evm = new EletronicVotingMachine(candidatesList);

        evm.showCandidates();
    }
}
