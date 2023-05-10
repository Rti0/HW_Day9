public class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public Book(String name, double price) {
        super(name, price);
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public double getDiscount(){
         return getPrice()* 0.5;

    }
    @Override
    void displayInfo() {
        System.out.println("Author:"+getAuthor()+"Book Name:"+getName());
        System.out.println("The price:"+" " +getPrice()+"  "+"Discount"+getDiscount());


    }

}

