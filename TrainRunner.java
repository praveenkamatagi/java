class TrainRunner{
	String name;
	int platformNo;
	String classes;
	int waiting;
	int travellingHours;
	
	TrainRunner(){
		name="RaniChennamExpress";
		platformNo=2;
		classes="AC";
		waiting=25;
		travellingHours=8;
	}
	
	public static void main(String []values){
	TrainRunner data=new TrainRunner();
	System.out.println(data.name);
	System.out.println(data.platformNo);
	System.out.println(data.classes);
	System.out.println(data.waiting);
	System.out.println(data.travellingHours);
}
}