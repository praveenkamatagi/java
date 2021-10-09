class Headset{
	String brand;
	String type;
	int price;
	boolean mic;
	boolean noiseCancellation;
	float hz;
	
	Headset(String comp, int amnt){
		System.out.println("invoked string and int constructor");
		System.out.println("the company name is:"+comp);
		System.out.println("the price is :"+amnt);
}
Headset(String type, boolean sound){
	System.out.println("the type is :"+type);
	System.out.println("the sound range is good:"+sound);
}
Headset(float hertz){
System.out.println("the frequency is:"+hertz);
}
Headset(int discount){
	System.out.println("the dasara discount:" +discount);
}
	Headset(String but){
		System.out.println("this have inbuilt:"+but);
		 
} 
}	