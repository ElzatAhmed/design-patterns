package iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate{

    private ArrayList<Book> books;

    public BookShelf(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book getBookAt(int index){
        return this.books.get(index);
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public int getSize() {
        return this.books.size();
    }
}
