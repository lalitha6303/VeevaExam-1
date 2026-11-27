public class Participant {
    private String username;
    private int problemsSolved;
    private int penaltyTime;
    private int rating;
    public Participant(String username,int problemsSolved,int penaltyTime,int rating)
    {
        this.username=username;
        this.problemsSolved=problemsSolved;
        this.penaltyTime=penaltyTime;
        this.rating=rating;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProblemsSolved() {
        return problemsSolved;
    }

    public void setProblemsSolved(int problemsSolved) {
        this.problemsSolved = problemsSolved;
    }

    public int getPenaltyTime() {
        return penaltyTime;
    }

    public void setPenaltyTime(int penaltyTime) {
        this.penaltyTime = penaltyTime;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return username + " " + problemsSolved + " "
                + penaltyTime + " " + rating;
    }
}
