package javaassignment;

import java.util.ArrayList;
import java.util.List;

// Media Classes
class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
    public String toString() {
        return "Book: " + title;
    }
}

class Video {
    String title;
    Video(String title) {
        this.title = title;
    }
    public String toString() {
        return "Video: " + title;
    }
}

class Newspaper {
    String name;
    Newspaper(String name) {
        this.name = name;
    }
    public String toString() {
        return "Newspaper: " + name;
    }
}

// Generic Library Class
class GenericLibrary<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T retrieve(int index) {
        return items.get(index);
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

// Non-Generic Library Class
class NonGenericLibrary {
    private List items = new ArrayList();

    public void add(Object item) {
        items.add(item);
    }

    public Object retrieve(int index) {
        return items.get(index);
    }

    public void displayAll() {
        for (Object item : items) {
            System.out.println(item);
        }
    }
}

// Main Class to Demonstrate
public class question39 {
    public static void main(String[] args) {
        System.out.println("----- Using Generic Library -----");
        GenericLibrary<Book> bookLibrary = new GenericLibrary<>();
        bookLibrary.add(new Book("The Alchemist"));

        GenericLibrary<Video> videoLibrary = new GenericLibrary<>();
        videoLibrary.add(new Video("Inception"));

        GenericLibrary<Newspaper> newspaperLibrary = new GenericLibrary<>();
        newspaperLibrary.add(new Newspaper("The Hindu"));

        bookLibrary.displayAll();
        videoLibrary.displayAll();
        newspaperLibrary.displayAll();

        System.out.println("\n----- Using Non-Generic Library -----");
        NonGenericLibrary nonGenLibrary = new NonGenericLibrary();
        nonGenLibrary.add(new Book("Wings of Fire"));
        nonGenLibrary.add(new Video("Avatar"));
        nonGenLibrary.add(new Newspaper("The Times of India"));

        nonGenLibrary.displayAll();
    }
}

/*
 * ----- Using Generic Library -----
Book: The Alchemist
Video: Inception
Newspaper: The Hindu

----- Using Non-Generic Library -----
Book: Wings of Fire
Video: Avatar
Newspaper: The Times of India
*/
