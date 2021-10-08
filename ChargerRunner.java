class ChargerRunner{
	String brand;
	String color;
	int price;
	String type;
	int capacity;
 ChargerRunner(){
		brand="samasung";
		color="white";
		price=1000;
		type="c";
	capacity=25;
	 
 }
	public static void main(String[] args){
		  ChargerRunner data=new ChargerRunner();
			System.out.println(data.brand);
			System.out.println(data.color);
			System.out.println(data.price);
			System.out.println(data.type);
			System.out.println(data.capacity);
		}
	}
