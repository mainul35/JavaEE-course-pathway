public class Reaction {
    private User reactedUser;
    private int reactionType;

    public Reaction(User reactedUser, int reactionType) {
        this.reactedUser = reactedUser;
        this.reactionType = reactionType;
    }

    public User getReactedUser() {
        return reactedUser;
    }

    public void setReactedUser(User reactedUser) {
        this.reactedUser = reactedUser;
    }

    public int getReactionType() {
        return reactionType;
    }

    public void setReactionType(int reactionType) {
        this.reactionType = reactionType;
    }

    @Override
    public String toString() {
        return "Reaction{" +
                "reactedUser=" + reactedUser +
                ", reactionType=" + reactionType +
                '}';
    }
}
