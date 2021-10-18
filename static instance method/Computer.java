class Computer{

String brand;
float price;
int quantity;
int modelNo;
String color;
static double totalOfAll;
Computer()
{
System.out.println("Invoked Computer");
}
void displayDetails()
{
System.out.println("Invoked DisplayDetails");
System.out.println(this.brand);
System.out.println(this.price);
System.out.println(this.quantity);
System.out.println(this.modelNo);
System.out.println(this.color);
}

void displayTotalPrice()
{
  System.out.println("Invoked DisplayTotalPrice");
  double totalPrice=this.quantity*this.price;
  System.out.println(totalPrice);
  Computer.totalOfAll=Computer.totalOfAll+totalPrice;
    System.out.println(Computer.totalOfAll);
}
void displayTotalOfAll()
{
	System.out.println("Invoked DisplayTotalOfAll");
	double totalOfAll=this.quantity*this.price;
	System.out.println(totalOfAll);
}
} 