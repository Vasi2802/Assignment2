package product;

public class Product {
    public int prodPrice;
    public String prodName;
    public String prodColor;
    public int prodQuant;
    public String prodBrand;

    public void book()
    {
        System.out.println(prodQuant+" "+prodName+" of price "+prodPrice+" of "+prodColor+" Color and of "+prodBrand+" is booked");
    }
    
    public void cancel()
    {
        System.out.println("your return request for "+prodQuant+prodName+" is recieved");
    }
}
