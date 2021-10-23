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
double d1 = byte1.doubleValue();//1
System.out.println("doubleValueOF:"+d1);
byte b2 = byte1.byteValue();//2
System.out.println(b2);
int cmp = Byte.compare(byte1,byte2);//3
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

 byte bt= Byte.decode("#1");//4
 System.out.println("decode:"+bt);
 byte bt1=byte2.byteValue();//5
System.out.println("Value:"+bt1);
int bt3=byte3.compareTo((byte)72);//6
System.out.println("compareTo :"+bt3);
boolean bt4=byte1.equals("false");//8
System.out.println("equals:"+bt4);
String bt5=Byte.toString((byte)40);//9
System.out.println("toString:"+bt5);
float bt6=byte2.floatValue();//10
System.out.println("FloatValue:"+bt6);


//short constructor//
 System.out.println("Short constructor & method");
 Short s1 = new Short((short)105);
System.out.println("short:"+s1);

Short s2 = new Short("125");
System.out.println(s2);

Short s3 = new Short((short)35);
Short s4=new Short("35");
Short s5=new Short("21");


//short method//
int N1 = s1.intValue();//1
System.out.println("intValue:"+N1);

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
System.out.println("hashCode:"+N1);
 short num = Short.reverseBytes(s2);//4
System.out.println("reverseByte:"+num);
long N5 = s1.longValue();//5
System.out.println("longValue:"+N5);
double N6 = s1.doubleValue();//6
System.out.println("doubleValue:"+N6);
short s=Short.parseShort("25");//7
 System.out.println("parse:"+s);
 short N7=Short.reverseBytes((short)34);//8
System.out.println("reverse:"+N7);
String N8=Short.toString((short)25);//9
System.out.println("toString:"+N8);
short N9=Short.valueOf("3");//10
System.out.println("valueOf:"+N9);

//char constructors
System.out.println("char constructor and method");
Character cha1 = new Character('P');
Character cha2 = new Character('d');
Character cha3 = new Character('k');
Character cha4 = new Character('a');
Character cha5 = new Character((char)'B');
System.out.println(cha1);

//char methods//
System.out.println("character const & method");
char[] characters = {'C','O','M','P','A','N','Y'};
int ch0 = Character.codePointAt(characters,3);
System.out.println("codePoint:"+ch0);//1
 CharSequence sequence = "praveen";
int ch1 = Character.codePointBefore(sequence,4);//2
System.out.println("codePointBefore:"+ch1);
int ch2 = Character.codePointBefore(characters,3);//3
System.out.println("codePointAfter:"+ch2);
int ch3 = Character.charCount(11);//4
System.out.println("charCount:"+ch3);
char[] ch4=Character.toChars(2);//5
System.out.println("toChars:"+ch4);

System.out.println("boolean constructor and method");
//Boolean class constructors

System .out.println("boolean constructor and method");
Boolean b1 = new Boolean(true);
System.out.println(b1);
Boolean b12 = new Boolean(false);
Boolean b13 = new Boolean(true);
Boolean b14 = new Boolean(false);
//boolean method//
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
System.out.println("getBoolean:"+b15);
int b16= b1.hashCode();
System.out.println("hashCode:"+b16);
boolean b17=Boolean.valueOf("tv");
System.out.println("valueOf:"+b17);
String b18=Boolean.toString(false);
System.out.println("to String:"+b18);
boolean b19=b1.equals(1);
System.out.println("equals:"+b19);
boolean b20=Boolean.getBoolean("true");
System.out.println("getBoolean:"+b20);

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
	
}
	if(exp1!=0){                                           
	System.out.println(flt1+"  not equal "+flt2);
}
else if(exp1==0){                                   
    System.out.println(flt1+" is equal to "+flt2);
}
else{                                                  
	System.out.println(flt1+" is greater than "+flt2);
}

int compare1=flt1.compareTo(flt2);
System.out.println("compareTo:"+compare1);
 
int code1=flt2.hashCode();
System.out.println("hashcode:"+code1);
boolean equalto=flt1.equals(150.00f);
System.out.println("equals:"+equalto);

//Double constructor

Double double1=new Double(1.255d);
System.out.println(double1);

Double double2=new Double("5.555d");
System.out.println(double2);
//double methods
System.out.println("double constructor and method");
int do1=Double.compare(double1,double2);
System.out.println("compare:"+do1);      

		 int d2=double1.compareTo(double2);
System.out.println("compareTo:"+d2);

double d3=Double.longBitsToDouble(123456789);
System.out.println("longBitsToDouble:"+d3);

boolean d4=double1.isNaN();
System.out.println("isIt:"+d4);
double d5=double2.doubleValue();
System.out.println("doubleValue:"+d5);

long do6=Double.doubleToLongBits(double1);
System.out.println("doubleToLongBits:"+do6);
String hexadecimal=Double.toHexString((double)0.55);
System.out.println("hexadecimal:"+hexadecimal);
long d6=Double.doubleToLongBits(double1);
System.out.println("doubleToLongBits:"+d6);
boolean d7=double1.equals(100);
System.out.println("equal:"+d7);
String tostring1=Double.toString(double2);
System.out.println("string:"+tostring1);

//integer constructors

Integer int1=new Integer(2345);
System.out.println("int1:"+int1);

Integer int2=new Integer("23456");
System.out.println("int2:"+int2);

System.out.println("  Integer methods  ");
//Integer methods 

int aa=Integer.bitCount(int1);
System.out.println("bitCount:"+aa);

int bb=Integer.rotateLeft(int1,2);
System.out.println("rotateLeft:"+bb);         

int cc=Integer.reverse(int2);
System.out.println("reverse:"+cc);

int signum1=Integer.signum(352);
System.out.println("signum:"+signum1);

int dd=Integer.reverseBytes(int1);
System.out.println("reverseBytes:"+dd);

int ee=Integer.highestOneBit(int2);
System.out.println("highestOneBit:"+ee);

int ff=Integer.numberOfTrailingZeros(500000);
System.out.println("numberOfTrailingZeros:"+ff);

String gg=Integer.toOctalString(7205);
System.out.println("toOctalString:"+gg);

String hh=Integer.toHexString(1250);
System.out.println("toHexString:"+hh);

Integer valueOf2=Integer.valueOf(2502);
System.out.println("valueOf:"+valueOf2);
//long constructor//
Long long1=new Long(123456);
System.out.println("long1:"+long1);

Long long2=new Long("25250");
System.out.println("long2:"+long2);

System.out.println("  Long methods and const ");
//long methods
int compare3=Long.compare(long1,long2);
System.out.println("compare:"+compare3);        

String toBinaryString2=Long.toBinaryString(long1);
System.out.println("toBinaryString:"+toBinaryString2);

String toString2=Long.toString(long1);
System.out.println("toString:"+toBinaryString2);

long parseLong1=Long.parseLong("2021");
System.out.println("parseLong:"+parseLong1);

long valueOf3=Long.valueOf("2022");
System.out.println("valueOf:"+valueOf3);

long valueOf4=Long.valueOf(long2);
System.out.println("valueOf:"+valueOf4);

long decode1=Long.decode("-#25");
System.out.println("decode:"+decode1);

long decode2=Long.decode("-#23");
System.out.println("decode:"+decode1);

int welcome=Long.bitCount(long1);
System.out.println("bitCount:"+welcome);

int signum3=Long.signum(long2);
System.out.println("signum:"+signum3);

long reverseBytes2=Long.reverseBytes(long2);
System.out.println("reverseBytes:"+reverseBytes2);




		 
		 
		 
		 
		 
	}
 }	
		 





 




 
 
 








 

 
 
	
 