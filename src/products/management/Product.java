package products.management;

public class Product {

    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] image;

    public Product(int pid, String pname, float pPrice, String pAddDate, byte[] pImg) {
        this.id = pid;
        this.name = pname;
        this.price = pPrice;
        this.addDate = pAddDate;
        this.image = pImg;
    }
    
    public int getId()
    {
        return  id;     
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getAddDate()
    {
        return addDate;
    }
    
    public byte[] getImage()
    {
        return image; 
    }
}
