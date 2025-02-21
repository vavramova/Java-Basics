package Library;

public class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }


    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

}
