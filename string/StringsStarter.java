  class StringsStarter
{
	public static void main(String[] values)
	{
		String company=new String("Realme");
		String brand=new String("narzo");
		String color=new String("blue");
		String quality=new String("good");
		String processor=new String("octa core");
		String review=new String("vgood");
		String display=new String("HD");
		String os=new String("android");
		String ram=new String("four");
		String type=new String("ctype");
		String camera =new String("tripple");
		String flash=new String("realFlash");
		String map=new String("googleMap");
		String sensor=new String("magneticInductionSensor");
		
		String c=company.toLowerCase();
		System.out.println(c); 
		String b=brand.toUpperCase();
		System.out.println(b); 
		int clr=color.length();
		System.out.println(clr); 
		boolean q=quality.isEmpty();
		System.out.println(c); 
		boolean r=review.matches("vgood");
		System.out.println(r); 
		String p=processor.substring(1,6);
		System.out.println(p); 
		int Ram=ram.codePointAt(2);
		System.out.println(Ram); 
		int o=os.codePointBefore(2);
		System.out.println(o); 
		boolean t=type.endsWith("l");
		System.out.println(t); 
		String cc=camera.trim();  
		System.out.println(cc);

		boolean f4=flash.contentEquals("flash");
		System.out.println(f4); 
		 String MAP=map.replace('0','g');
		System.out.println(MAP);  
		char s2=sensor.charAt(1);
		System.out.println(s2); 
	}
}
		 