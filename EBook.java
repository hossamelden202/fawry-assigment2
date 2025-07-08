public class EBook extends Book{
    private String filetype;

   public EBook(String iSBN, String title, int year, double price, String author, String filetype) {
        super(iSBN, title, year, price, author);
        this.filetype = filetype;
    }
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

   public String getFiletype() {
    return filetype;
    }
    @Override
    public void deliverTo(String email){
        MailService.sendEmail(email);
    }
    @Override
    public boolean isForSale(){
        return true;
    }



}
