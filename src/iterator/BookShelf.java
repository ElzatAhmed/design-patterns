package iterator;

public class BookShelf implements Aggregate{

    private Book[] books;

    private int size;

    public BookShelf(int size){
        this.size = size;
        this.books = new Book[size];
    }

    public int getSize() {
        return size;
    }

    public Book getBookAt(int index){
        return this.books[index];
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
