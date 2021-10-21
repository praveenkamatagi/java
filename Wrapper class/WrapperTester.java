class WrapperTester{
	public static void main(String args[]){
		// Wrapper Byte constructors//
Byte byte1 = new Byte((byte)25);
System.out.println(byte1);
Byte byte2 = new Byte((byte)100);
System.out.println(byte1);
Byte byte3 = new Byte("127");
System.out.println(byte3);
Byte byte4 = new Byte("00025");
System.out.println(byte4);

//byte methods//
System.out.println("byte constructor & method");
double d1 = byte1.doubleValue();
System.out.println(d1);
byte b2 = byte1.byteValue();
System.out.println(b2);
int cmp = Byte.compare(byte1,byte2);
if(cmp>100){                                          
	System.out.println(byte1+" lesser than "+byte2);
}
else if(b2!=0){                                   
    System.out.println(byte1+" not equal "+byte2);
}
else if(b2==0){
	System.out.println(byte1+"  equal  "+byte2);
}
else{                                                  
	System.out.println(byte2+"  is too greater "+byte1);
}  
 System.out.println(Byte.decode("#1"));
 
 //short constructor//
 Short s1 = new Short((short)105);
System.out.println(s1);

Short s2 = new Short("125");
System.out.println(s2);

Short s3 = new Short((short)35);
Short s4=new Short("35");
Short s5=new Short("21");


//short method//
int N1 = s1.intValue();//1
System.out.println(N1);

int N = s1.compareTo(s2);//2
if(N<0){                                           
	System.out.println(s1+" is less than "+s2);
}else if(N==35){                                   
    System.out.println(s1+" is equal to "+s2);
}
else{                                                  
	System.out.println("null");
}
int N2 = Short.hashCode((short)s1);//3
System.out.println(N1);
 short num = Short.reverseBytes(s2);//4
System.out.println(num);
long N5 = s1.longValue();//5
System.out.println(N5);
double N6 = s1.doubleValue();//6
System.out.println(N6);
short s=Short.parseShort("25");//7
 System.out.println(s);
  //char constructors
System.out.println("char constructor and method");
Character cha1 = new Character('P');
Character cha2 = new Character('d');
Character cha3 = new Character('k');
Character cha4 = new Character('a');
Character cha5 = new Character('B');
System.out.println(cha1);
char[] characters = {'C','O','M','P','A','N','Y'};
int int0 = Character.codePointAt(characters,3);
System.out.println(int0);
 CharSequence sequence = "praveen";
int int1 = Character.codePointBefore(sequence,4);
System.out.println(int1);
int int2 = Character.codePointBefore(characters,3);
System.out.println(int2);
int c = Character.charCount(11);
System.out.println(c);

System.out.println("boolean constructor and method");
//Boolean class constructors

System .out.println("boolean constructor and method");
Boolean b1 = new Boolean(true);
System.out.println(b1);
Boolean b12 = new Boolean(false);
Boolean b13 = new Boolean(true);
Boolean b14 = new Boolean(false);

int bln= b12.compareTo(b1);
System.out.println(bln);
if(bln >0){  
    System.out.println("true");  
    }  
else if(bln!=0){  
    System.out.println("false");  
    }  
else{  
    System.out.println(" true"); 
}
boolean b15 = Boolean.getBoolean("false");
System.out.println(b15);
int b16= b1.hashCode();
System.out.println(b16);

//float constructor//
System.out.println("float constructor and method");
System.out.println("float");
Float flt1 = new Float(125.55f);
System.out.println(flt1);

Float flt2 = new Float(126.25f);
System.out.println(flt2);

Float flt3 = new Float("128.33f");
System.out.println(flt3);
Float flt4 = new Float("10.5");
Float flt5 = new Float("110.72");

// flaot method//

int exp1 = flt1.compareTo(flt2);
if(exp1>0){                                           
	System.out.println(flt1+"  less than "+flt2);
	if(exp1!=0){                                           
	System.out.println(flt1+"  not equal "+flt2);
}else if(exp1==0){                                   
    System.out.println(flt1+" is equal to "+flt2);
}
else{                                                  
	System.out.println(flt1+" is greater than "+flt2);
}





 






 
 


		
}	
		
	}
	
}
