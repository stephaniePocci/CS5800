public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String newTitle, String newAuthor, String newPublisher) { // constructor
        this.title = newTitle;
        this.author = newAuthor;
        this.publisher = newPublisher;
    }

    public void setAuthor(String newAuthor) { // author mutator
        this.author = newAuthor;
    }

    public void setPublisher(String newPublisher) { // publisher mutator
        this.publisher = newPublisher;
    }

    public void setTitle(String newTitle) { // title mutator
        this.title = newTitle;
    }

    public String getTitle() { // title accessor
        return title;
    }

    public String getAuthor() { // author accessor
        return author;
    }

    public String getPublisher() { // publisher accessor
        return publisher;
    }
}
