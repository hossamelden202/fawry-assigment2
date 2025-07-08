public class PaperBook extends Book{
    private int stock;
    public PaperBook(String iSBN, String title, int year, double price, String author, int stock) {
        super(iSBN, title, year, price, author);
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double buy(int quantity){
    if (this.stock<quantity){
        throw new IllegalArgumentException("Requested " + quantity + " but only " + stock + " in stock for ISBN " + ISBN + ". Short by " + (quantity-stock));
      }
      this.stock-=quantity;

      return this.price*quantity;

    }
    @Override
    public void deliverTo(String location){
        ShippingService.shipBook(location);
    }
    @Override
    public boolean isForSale(){
        return true;
    }

    




}