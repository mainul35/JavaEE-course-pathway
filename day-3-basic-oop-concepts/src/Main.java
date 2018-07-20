import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        User mainul = new User("Syed Mainul Hasan", 1, "mainul35");
        User dipto = new User("Dipto", 2, "dipto");
        User rizvi = new User("Rizvi", 3, "rizvi");
        User amit = new User("Amit", 4, "amit");

        Article mArticle1 = new Article("some body by Mainul 1", "some title by Mainul 1", "18/07/2018");
        Article mArticle2 = new Article("some body by Mainul 2", "some title by Mainul 2", "19/07/2018");
        Article mArticle3 = new Article("some body by Mainul 3", "some title by Mainul 3", "20/07/2018");

        Article dArticle1 = new Article("some body by Dipto 1", "some title by Dipto 1", "18/07/2018");
        Article dArticle2 = new Article("some body by Dipto 2", "some title by Dipto 2", "19/07/2018");
        Article dArticle3 = new Article("some body by Dipto 3", "some title by Dipto 3", "20/07/2018");

        List<Article> mArticles = new ArrayList<>();
        mArticles.add(mArticle1);
        mArticles.add(mArticle2);
        mArticles.add(mArticle3);

        List<User> mArticleViewers = new ArrayList<>();
        mArticleViewers.add(dipto);
        mArticleViewers.add(amit);

        mArticle1.setViewers(mArticleViewers);

        mainul.setArticles(mArticles);

        List<Article> dArticles = new ArrayList<>();
        dArticles.add(dArticle1);
        dArticles.add(dArticle2);
        dArticles.add(dArticle3);

        dipto.setArticles(dArticles);

        List<User> users = new ArrayList<>();
        users.add(mainul);
        users.add(rizvi);
        users.add(dipto);
        users.add(amit);

        for (User u : users) {
            System.out.println("Author: " + u.getName());
            if (u.getArticles() != null)
                for (Article article : u.getArticles()) {
                    System.out.println("Article: " + article.getArticleBody());
                    if (article.getViewers() != null)
                        for (User viewer : article.getViewers()) {
                            System.out.println("Viewer: " + viewer.getName());
                        }
                    else
                        System.out.println("Sorry, no viewer found");
                }
            else
                System.out.println("Sorry, no article found");

        }
    }
}
