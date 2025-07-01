package Lesson3;

class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book[title=\"" + title + "\", author=\"" + author + "\"]";
    }
}

public class Main4 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "Alice");
        System.out.println(b);             // Book[title="Java Basics", author="Alice"]
        System.out.println(b.toString());  // Same output
    }
}


