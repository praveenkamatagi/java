class ProductStarter{

public static void main(String[] args)
{

Product product=new Product();
product.displayDetails();
product.name="oppo";
product.price=18000;
product.quality="good";
product.quantity=25;
product.isiMark="YES";
Product product1=new Product();
product1.displayDetails();
product1.name="realme";
product1.price=45000.25f;
product1.quality="vgood";
product1.quantity=100;
product1.isiMark="yes";
product.displayDetails();
product1.displayDetails();
product.displayTotalPrice();
product1.displayTotalPrice();


}}

 