class CameraStarter{
	 public static void main(String[] args)
	{
		Camera camera=new Camera("canon",5.0f,10000,"m1",true);
		String brand=camera.getBrand();
		int pixel=camera.getPixel();
		float price=camera.getPrice();
		if(brand!=null)
		{
			System.out.println(brand);
		}
		if(pixel>0.0f)
		{
			System.out.println(pixel);
		}
		camera.setBrand("nikon");
		camera.setPrice(25000);
		camera.setPixel(12);
		camera.setModel("newOne");
		camera.setResolution(false);
		System.out.println(camera.getBrand());
		System.out.println(camera.getModel());
		System.out.println(camera.getResolution());
		System.out.println(camera.getPixel());
		System.out.println(camera.getPrice());
	}
}