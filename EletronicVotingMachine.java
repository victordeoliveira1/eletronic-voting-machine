import java.util.Scanner;

public class EletronicVotingMachine {
    // Atributes
    private Candidate[] candidates;
    private int nullVotes;
    private int maxVotes;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
    public EletronicVotingMachine(Candidate[] candidates) {
        if (candidates == null) {
            throw new IllegalArgumentException("Invalid candidates array");
        }
        this.candidates = candidates;
        this.setNullVotes(0);
        this.setMaxVotes(10);
    }

    // Methods
    public void startVoting() {
        int votesConfirmed = 0;
        System.out.println("Welcome to Eletronic Voting Machine!\n");
        showCandidates();

        while (votesConfirmed < getMaxVotes()) {
            System.out.print("Enter your candidate's number: ");
            if (scanner.hasNextInt()) {
                receiveVote(scanner.nextInt());
                scanner.nextLine();
                votesConfirmed++;
            } else {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.nextLine();

            }
        }
        endVoting();
    }

    public void endVoting() {
        countVotes();
        scanner.close();
    }

    public void receiveVote(int number) {
    boolean voteIsNull = true;

    for (Candidate c : candidates) {
        if (c.getNumber() == number) {
            c.addVotes();
            voteIsNull = false;
            break;
        }
    }

    if (voteIsNull) {
        setNullVotes(getNullVotes() + 1);
    }

    System.out.println("Vote Confirmed!");
}

    public void countVotes() {
        Candidate winner = candidates[0];
        boolean draw = false;
        double percentage;
        System.out.println("Voting Results:\n");
        for (Candidate c : candidates) {
            percentage = (100 / getMaxVotes() * c.getVotes());
            System.out.printf("%s: %d votes (%.2f%%)%n", c.getName(), c.getVotes(), percentage);
            if (c.getVotes() > winner.getVotes()) {
                winner = c;
                draw = false;
            } else if (c.getVotes() == winner.getVotes() && c != winner) {
                draw = true;
            }
        }
        percentage = (100 / getMaxVotes()) * getNullVotes();
        System.out.printf("Null votes %d (%.2f%%)%n", getNullVotes(), percentage);

        if (draw) {
            System.out.println("\nDraw");

        } else {
            System.out.printf("\nWinner: %s%n", winner.getName());

        }
    }

    public void showCandidates() {
        System.out.println("Candidates:");
        for (Candidate c : candidates) {
            System.out.printf("%02d - %s%n", c.getNumber(), c.getName());
        }
        System.out.println("");
    }

    // Getters and Setters
    public int getNullVotes() {
        return this.nullVotes;
    }

    public void setNullVotes(int nullVotes) {
        this.nullVotes = nullVotes;
    }

    public int getMaxVotes() {
        return this.maxVotes;
    }

    public void setMaxVotes(int maxVotes) {
        this.maxVotes = maxVotes;
    }

}
