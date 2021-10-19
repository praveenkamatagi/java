class RefrigeratorRunner{
	public static void main(String args []){
	Refrigerator refrigerator =new Refrigerator("samasung",12,25.0f,"single");
		 String company=refrigerator.getCompany();
		 int model=refrigerator.getModel();
		 float capacity=refrigerator.getCapacity();
		 String door=refrigerator.getDoor();
	
		 if(company!=null){
			 System.out.println(company);
		 }
		 if(model==25.0f){
			 System.out.println(model);
		 }
		  
	refrigerator.setCompany("haier");
	refrigerator.setModel(10);
	refrigerator.setCapacity(120.5f);
	refrigerator.setDoor("double");
	System.out.println(refrigerator.getCompany());
	System.out.println(refrigerator.getModel());
	System.out.println(refrigerator.getCapacity());
	System.out.println(refrigerator.getDoor() );
	
	
	}
	
}