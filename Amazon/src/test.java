
import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
import customer.Customer;
import product.*;
import product.category.Category;

public class test{
    public static void main(String[] args){
        Customer c1=new Customer();
        Customer c2=new Customer();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter customer 1 details");
        c1.custName=scn.nextLine();
        c1.type=scn.nextLine();
        c1.location=scn.nextLine();
        c1.sex=scn.nextLine();
        c1.custId=scn.nextInt();

        System.out.println("Enter customer 2 details");
        c2.custId=scn.nextInt();
        c2.custName=scn.nextLine();
        c2.type=scn.nextLine();
        c2.location=scn.nextLine();
        
        c1.login();
        c2.login();
        c1.logout();
        c2.logout();

        Product p1=new Product();
        Product p2=new Product();
        System.out.println("Enter Product 1 Details");
        p1.prodPrice=scn.nextInt();
        p1.prodName=scn.nextLine();
        p1.prodColor=scn.nextLine();
        p1.prodBrand=scn.nextLine();
        p1.prodQuant=scn.nextInt();
        System.out.println("Enter Product 2 Details");
        p2.prodPrice=scn.nextInt();
        p2.prodName=scn.nextLine();
        p2.prodColor=scn.nextLine();
        p2.prodBrand=scn.nextLine();
        p2.prodQuant=scn.nextInt();


        p1.book();
        p2.book();
        p1.cancel();
        p2.cancel();
    }
}