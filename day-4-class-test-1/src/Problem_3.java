import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Book javaHowToProgram = new Book("Java How to Program", "Technology", 100, "12345s-dfgh");
        Book springInAction = new Book("Spring 4 in Action", "Technology", 100, "1245s-dfgh");
        Book cHowToProgram = new Book("C How to Program", "Technology", 100, "1234s-dfgh");

        Author paulDeitel = new Author("Paul Deitel", 45);
        Author harveyDeitel = new Author("Harvey Deitel", 50);
        Author craigWalls = new Author("Craig Walls", 55);

        List<Book> pjBooks = new ArrayList<>();
        pjBooks.add(javaHowToProgram);
        pjBooks.add(cHowToProgram);


        paulDeitel.setBooks(pjBooks);
        List<Book> herveyDeitelBooks = new ArrayList<>();
        herveyDeitelBooks.add(javaHowToProgram);
        harveyDeitel.setBooks(herveyDeitelBooks);
        List<Book> craigWallsBooks = new ArrayList<>();
        craigWallsBooks.add(springInAction);
        craigWalls.setBooks(craigWallsBooks);

        List<Author> authors = new ArrayList<>();
        authors.add(paulDeitel);
        authors.add(harveyDeitel);
        authors.add(craigWalls);

        /**
         *
         *  Displaying authors...
         *
         * */
        System.out.println(authors.toString());

        Scanner scanner = new Scanner(System.in);
        String authorName = "";
        /**
         *
         *  Displaying search results...
         *
         * */
        while ((authorName = scanner.nextLine())!=null){

            for (Author author: authors) {
                if (author.getName().equalsIgnoreCase(authorName)){
                    System.out.println("Showing Books by "+ author.getName());
                    System.out.println(author.getBooks().toString());
                }
            }
        }
    }
}

class Author{
    private String name;
    private int age;
    private List<Book> books;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }

}

class Book {
    private String name;
    private String category;
    private double price;
    private String isbn;

    public Book(String name, String category, double price, String isbn) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
