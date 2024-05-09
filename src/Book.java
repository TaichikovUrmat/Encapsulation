public class Book {
    private int id;
    private String name;
    private int price;
    private int publishedYear;
    private String authorName;

    public Book(int id, String name, int price, int publishedYear, String authorName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publishedYear = publishedYear;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }




}
