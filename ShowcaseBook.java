public class ShowcaseBook extends Book {
  
    public ShowcaseBook(String iSBN, String title, int year, double price, String author) {
        super(iSBN, title, year, price, author);
    }

    @Override 
    public boolean isForSale(){
        return false;
    }
    @Override
    public void deliverTo(String address){
        throw new UnsupportedOperationException("Showcase books are not deliverable");

    }
}
