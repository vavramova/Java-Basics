package Library;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> storage;

    public Library(){
        this.storage = new ArrayList<>();
    }

    public void addBook(Book book){
        storage.add(book);
    }

    public void borrowBook(String nameOfBook){
        for(Book book : storage){
            if(book.getTitle().equals(nameOfBook) && book.isAvailable){
                book.setAvailable(false);
                System.out.println("The book " + nameOfBook + " is borrowed!");
                return;
            }
        }

        System.out.println("The book is not available!");
    }

    public void returnBook(String title){
        for(Book book : storage){
            if(book.getTitle().equals(title) && !book.isAvailable){
                book.setAvailable(true);
                System.out.println("You returned " + title + " successfully!");
                return;
            }
        }
        System.out.println("The book has not been borrowed yet!");
    }

    public void listOfAvailableBooks(){
        System.out.println("Available books:");

        int n = 1;
        for(Book book : storage){
            if(book.isAvailable){
                System.out.println(n + ". " + book.getTitle() + " from " + book.getAuthor());
                n++;
            }
        }
    }


}
