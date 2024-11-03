package do_an;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.id=" ";
        this.name=" ";
        this.price=0;
        this.quantity=0;
    }
    public Product(String id,String name, double price, int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }

    public String getid(){ return id;}
    public void setid(String id){this.id=id;}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }











    
    @Override
    public String toString(){
      return "Product ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}
