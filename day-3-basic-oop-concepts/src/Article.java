import java.util.List;

public class Article {
    private String articleBody;
    private String articleTitle;
    private String date;
    private List<User> viewers;
    private List<Reaction> reactions;
    private List<Comment> comments;

    public Article(String articleBody, String articleTitle, String date) {
        this.articleBody = articleBody;
        this.articleTitle = articleTitle;
        this.date = date;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public List<User> getViewers() {
        return viewers;
    }

    public void setViewers(List<User> viewers) {
        this.viewers = viewers;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleBody='" + articleBody + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", date='" + date + '\'' +
                ", viewers=" + viewers +
                ", reactions=" + reactions +
                ", comments=" + comments +
                '}';
    }
}
