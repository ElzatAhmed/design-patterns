package iterator;

public class Main {

    public static void main(String[] args){
        BookShelf shelf = new BookShelf();
        for (int i = 0; i < 10; i++) {
            shelf.addBook(new Book(String.valueOf(i)));
        }
        Iterator iterator = shelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) (iterator.next());
            System.out.println(book.getName());
        }
    }

}
