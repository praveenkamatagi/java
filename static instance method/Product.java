class Product{

String quality;
float price;
int quantity;
String isiMark;
String name;
static double totalOfAllProduct;
Product()
{
System.out.println("Invoked Product");
}
void displayDetails()
{
System.out.println("Invoked DisplayDetails");
System.out.println(this.quality);
System.out.println(this.name);
System.out.println(this.quantity);
System.out.println(this.price);
System.out.println(this.isiMark);

}

void displayTotalPrice()
{
  System.out.println("Invoked DisplayTotalPrice");
  double totalPrice=this.quantity*this.price;
  System.out.println(totalPrice);
  Product.totalOfAllProduct=Product.totalOfAllProduct+totalPrice;
  System.out.println(Product.totalOfAllProduct);