import java.util.*;

public class BookInventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
        System.out.println("Added book " + book.getTitle());
    }

    public List<Book> removeOutdatedBooks(int yearLimit) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> it = books.entrySet().iterator();
        while (it.hasNext()) {
            Book b = it.next().getValue();
            if (b.getYear() < yearLimit) {
                removed.add(b);
                it.remove();
                System.out.println("Removed outdated book " + b.getTitle());
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        if (book == null) {
            throw new RuntimeException("Book with ISBN " + isbn + " not found");
        }

        if (!book.isForSale()) {
            throw new RuntimeException("Book: "+book.getTitle() + " is not for sale.");
        }

        double cost = 0.0;

        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            cost = pb.buy(quantity);
            pb.deliverTo(address);
        } else if (book instanceof EBook) {
            cost = book.getPrice() * quantity;
            book.deliverTo(address);
        }

        System.out.println("Bought " + quantity + " of " + book.getTitle());
        return cost;
    }

    public Book getBookByISBN(String isbn) {
        return books.get(isbn);
    }

    public void listAllBooks() {
        for (Book b : books.values()) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
    }
}
