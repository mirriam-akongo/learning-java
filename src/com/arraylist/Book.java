package com.arraylist;

import java.util.ArrayList;

/**
 * Fields: A single private ArrayList of Book field is all that is necessary. This will hold all the Book objects in the library.
 *
 * Methods: public Library(ArrayList other)
 *
 * Throws a NullPointerException if other is null. Otherwise, the Library’s Book ArrayList should take on all the books in other.
 *
 * public Library( ) Creates an empty ArrayList of books.
 *
 * public boolean add(Book book)
 *
 * First checks for null or empty Strings and calls the appropriate exception. Otherwise it adds the Book argument to the end of the library ArrayList. Notice it returns a boolean (whether or not the add operation succeeded) See the add method of ArrayList:
 *
 * public ArrayList findTitles(String title)
 *
 * Generates an ArrayList of all books which have titles that match (exactly) with the passed argument and returns this list to the calling program. The String compareTo method is useful here.
 *
 * public void sort( )
 *
 * Sorts the library’s book ArrayList in ascending order according to the title field (sort these titles just as they are, i.e. don’t worry about articles such as The or A, etc.). As illustrated in the textbook, p. 666 (Don’t let this number concern you :) ), you will use the Collections sort.
 *
 * public String toString( )
 *
 * returns a properly formatted String representation of all the books in the library (Title followed by authors).
 * */

public class Book implements Comparable<Book> {
    private String bookTitle;
    private ArrayList<String> bookAuthor;
    public Book(String title, ArrayList<String> authors) {
        if (title == null && authors == null) {
            throw new IllegalArgumentException("Can't be null");
        }
        if (title.isEmpty() && authors.isEmpty()) {
            throw new IllegalArgumentException("Can't be empty");
        }
        bookTitle = title;
        bookAuthor = authors;
    }

    public String getTitle() {
        return bookTitle;
    }
    public ArrayList<String> getAuthors( ) {
        return bookAuthor;
    }

    public String toString( ) {
        return bookTitle + bookAuthor;
    }
    public int compareTo(Book other){
        return bookTitle.compareTo(other.bookTitle);
    }
    public boolean equals(Object o) {
        if(!(o instanceof Book)) {
            return false;
        }
        Book b = (Book) o;
        return b.bookTitle.equals(bookTitle)
                && b.bookAuthor.equals(bookAuthor);
    }
}
