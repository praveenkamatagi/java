class Refrigerator{
	String company;
	int model;
	float capacity;
	String door;
	
	
	Refrigerator(String company,int model,float capacity,String door){
		System.out.println("invoked refrigerator");
		this.company=company;
		this.model=model;
		this.capacity=capacity;
		this.door=door;
		System.out.println(this.company);
		System.out.println(this.model);
		System.out.println(this.capacity);
		System.out.println(this.door);
	}
	String getCompany(){
		return this.company;
	}
	int getModel(){
		return this.model;
	}
	float getCapacity(){
		return this.capacity;
	}
	String getDoor(){
		return this.door;
	}
	void setCompany(String company){
		 this.company=company;
	}
	void setModel(int model){
		 this.model=model;
	}
	void setCapacity(float capacity){
		 this.capacity=capacity;
	}
	void setDoor(String door){
	 this.door=door;	
	}
	
	}
	
