class StringRunner{
	public static void main(String args[]){
		String company="samsung";
		String model="m12";
		String color="white";
		String charging="fastCharging";
		String quality ="good";
		int wat=18;
		boolean bo=true;
		double price=12500.25;
		float year=2021;
		char[] myName={'p','r','a','v','e','e','n'};
		String NAME=new String(myName);
		System.out.println(NAME);
		byte[] b={22,33,};
		String conversion=new String(b);
		System.out.println(b);
		if(company==charging)
		{
			System.out.println("sp2sm");
		}
		else{
			System.out.println("Sp2Nsm");
		}
		boolean m=model.contains("12");
		System.out.println(m);
		char ref=quality.charAt(2);
		System.out.println(ref);
		boolean clr=color.endsWith("e");
		System.out.println(clr);
		String cmp=company.toUpperCase();
		System.out.println(cmp);
		  byte[] values=NAME.getBytes();
		for(int index=0;index<values.length;index++)
		{
			System.out.println(values[index]);
		}
		String clr1=color.replaceAll("white","blue");
		System.out.println(clr1);
		
	}
}