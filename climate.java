class climate{
	int temperature=25;
	String type="rainy";
	String location= "belagavi";
	climate(){
	}
	climate(String str,int temp){
	type=str;
	temperature=temp;
	}
	public static void main(String []args){
		climate data=new climate();
		System.out.println(data.temperature);
	System.out.println(data.type);
	System.out.println(data.location);
	climate data1=new climate("winter",22);
	System.out.println(data1.type);
	System.out.println(data1.temperature);
	}
}