package iterator;

public class BookShelfIterator implements Iterator{

    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < bookShelf.getSize();
    }

    @Override
    public Object next() {
        if(this.hasNext())
            return bookShelf.getBookAt(index++);
        throw new IndexOutOfBoundsException();
    }
}
