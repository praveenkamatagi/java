class Handbags{
	String color;
	int price;
	String brand;
	int size;
	String material;
	float capacity;
	double warranty;
	Handbags(String clr,int rs){
		System.out.println("invoked headset String and int constructor");
		System.out.println("the color is:"+clr);
		System.out.println("the price is:"+rs);
	}
	Handbags(String bran,String mtrl){
		System.out.println("the brand is:"+bran);
		System.out.println("the material used is:"+mtrl);
	}
	Handbags(float cap ){
		System.out.println("the capacity of bag in kg:"+cap);
	}
	Handbags(int mm){
		System .out.println("the length of bag in cm:"+mm);
	}
	 Handbags(String quality){
	       System.out.println("the quality of bag is:"+quality );
	     
    }
	Handbags(double warranties){
		System.out.println("the warranty is:"+warranties);
	}
}