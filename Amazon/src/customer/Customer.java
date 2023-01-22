package customer;

public class Customer {
    public int custId;
    public String custName;
    public String type;
    public String location;
    public String sex;

    public void login()
    {
        System.out.println(custName+" log as "+type+ " customer");
    }

    public void logout()
    {
        System.out.println(custName+" who is a "+type+" customer lives in "+location+" is logged out");
    }

    
}
