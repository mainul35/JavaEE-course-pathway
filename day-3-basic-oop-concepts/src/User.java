import java.util.List;

public class User {
    private String name;
    private int id;
    private String username;
    private List<Article> articles;

    public User(String name, int id, String username) {
        this.name = name;
        this.id = id;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", articles=" + articles +
                '}';
    }
}
