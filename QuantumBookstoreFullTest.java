public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        BookInventory store = new BookInventory(); 
        store.addBook(new PaperBook("ISBN001", "Coding", 2008, 40.0, "Hossam", 5));
        store.addBook(new EBook("ISBN002", "Java", 2018, 30.0, "Ahmed", "PDF"));
        store.addBook(new ShowcaseBook("ISBN003", "Math", 2020, 0.0, "Dr.Meow"));
        store.listAllBooks();        
        store.removeOutdatedBooks(2010);
        try {
            double cost = store.buyBook("ISBN001", 2, "me@gmail.com", "Cairo, Egypt");
            System.out.println("Paid " + cost);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double cost = store.buyBook("ISBN002", 1, "me@gmail.com", "N/A");
            System.out.println("Paid " + cost);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("ISBN003", 1, "me@gmail.com", "N/A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
