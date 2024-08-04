public class Product {
    private String name;
    private double price;
    private static int counter = 0;
    
    public Product() {
        counter++;
    };
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        
        counter++;
    };
    
    public String getName() {
        return this.name;
    };
    
    public double getPrice() {
        return this.price;
    };
    
    public void setName(String name) {
        this.name = name;
    };
    
    public void setPrice(double price) {
        this.price = price;
    };
    
    public static int count() {
        return counter;
    };
}