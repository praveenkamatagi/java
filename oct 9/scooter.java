class scooter{
	String company;
	String type;
	int price;
	String color;
	int voltage;
	String review;
	double discount;
	String numberofBattery="two";
	scooter(int price,String company){
		this.price=price;
		this.company=company;
		System.out.println("price:"+price+"company:"+company);
	}
		scooter(String color,String type){
			this.color=color;
			this.type=type;
			System.out.println("color is:"+color);
			System.out.println("type is:"+type);
		}
		scooter(){
			this.voltage=25;
			System.out.println("the voltage is:"+voltage);
		}
		scooter(String review){
			this.review=review;
			System.out.println("the review of scooter is:"+review);
		}
		scooter(double discount){
		this.discount=discount;
		System.out.println("the offer is discount of :"+discount);
		
	}
}
	
