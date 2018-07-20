public class Comment {
    private User commentedUser;
    private String commentBody;

    public Comment(User commentedUser, String commentBody) {
        this.commentedUser = commentedUser;
        this.commentBody = commentBody;
    }

    public User getCommentedUser() {
        return commentedUser;
    }

    public void setCommentedUser(User commentedUser) {
        this.commentedUser = commentedUser;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentedUser=" + commentedUser +
                ", commentBody='" + commentBody + '\'' +
                '}';
    }
}
