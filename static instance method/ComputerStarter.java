class ComputerStarter{

public static void main(String[] args)
{

Computer computer=new Computer();
computer.brand="hp";
computer.price=25000.25f;
computer.quantity=10;
computer.modelNo=01;
computer.color="silver";

Computer computer1=new Computer();
computer1.brand="dell";
computer1.price=30000.200f;
computer1.quantity=5;
computer1.modelNo=12;
computer1.color="black";

computer.displayDetails();
computer1.displayDetails();
computer.displayTotalPrice();
computer1.displayTotalPrice();
computer.displayTotalOfAll();
computer1.displayTotalOfAll();
}
}