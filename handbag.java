class handbag{
	String color="red";
	int price=10;
	int size=25;
	String material="paper";
	int capacityInKg=10;
	
	handbag(){
	}	
	handbag(String str,int amt,String type){
		    color=str;
			price=amt;
			material=type;
	}
		public static void main(String[] args){
		handbag data=new handbag();
		System.out.println(data.color);
		System.out.println(data.price);
		System.out.println(data.size);
		System.out.println(data.material);
		System.out.println(data.capacityInKg);
		 handbag data1=new handbag("white",10,"cardSheet");
		 System.out.println(  data1.color);
		 System.out.println( data1.price);
		 System.out.println( data1.material);
		 
}
}	