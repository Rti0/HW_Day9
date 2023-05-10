public class Movie extends Product{
    private String director;

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public Movie(String name, double price) {
        super(name, price);
    }



    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public double getDiscount(){
        return getPrice()* 0.5;

    }

    @Override
    void displayInfo() {
        System.out.println("Director:"+getDirector()+"Film Name:"+getName());
        System.out.println("The price:"+" " +getPrice()+"  "+"Discount:"+getDiscount());
    }

}
