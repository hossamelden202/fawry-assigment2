public abstract class Book{
    protected  String ISBN ;
    protected  String title; 
    protected  int year ;
    protected  double price ;
    protected   String author ;
    public Book(String iSBN, String title, int year, double price, String author) {
        ISBN = iSBN;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract boolean isForSale();
    public abstract void  deliverTo(String address);

}