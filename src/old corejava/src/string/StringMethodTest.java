package string;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class StringMethodTest {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s1 = "ABCD";
		String s2 = "abcd";
		String s4 = "ABCD";
		String s3 = new String("ABCD");

		System.out.println("-----------String reference check-----------------------");
		System.out.println("s1 == s2 \t" + (s1 == s2)); //false
		System.out.println("s1 == s3 \t" + (s1 == s3)); //FALSE
		System.out.println("s1 == s4 \t" + (s1 == s4)); //true
		
		System.out.println(" -----------String content check with Case sensetive ----------------------- ");
		System.out.println("s1.equals(s2) \t" + s1.equals(s2)); //false
		System.out.println("s1.equals(s3) \t" + s1.equals(s3)); //true
		System.out.println("s1.equals(s4) \t" + s1.equals(s4)); //true
		System.out.println(" -----------String content check with not Case sensetive -----------------------");
		System.out.println("s1.equals(s2) \t" + s1.equalsIgnoreCase(s2)); //true
		System.out.println("s1.equals(s3) \t" + s1.equalsIgnoreCase(s3)); //true
		System.out.println("------------geting charecter  from string with given position------------------");
		System.out.println("s1.charAt(2) \t" + s1.charAt(2)); //C
		System.out.println("s2.charAt(1) \t" + s2.charAt(1)); //b
		System.out.println("------------geting ASCII value from string with given position------------------");
		System.out.println("s1.codePointAt(2) \t" + s1.codePointAt(1)); //65
		System.out.println("s2.codePointAt(2) \t" + s2.codePointAt(1)); //98
		System.out.println("------------geting ASCII value from string with one before given position--------");
		System.out.println("s1.codePointBefore(1) :\t" + s1.codePointBefore(1)); //65
		System.out.println("s2.codePointBefore(1) :\t" + s2.codePointBefore(1)); //97
		System.out.println("------------count the ASCII value from string with 1st to 2nd position-------");		
		System.out.println("s1.codePointCount(1,3) :\t" + s1.codePointCount(1,3)); //97
		System.out.println("s2.codePointCount(1,3) :\t" + s2.codePointCount(1,3)); //97
		System.out.println("------Compare the one to another with respect ASCII----\n"
				+ "string1 < string1 : Negative\n"
				+ "string1 = string1 : zero(0)\n"
				+ "string1 > string1 : Positive");		
		System.out.println("s1.compareTo(s2) :\t" + s1.compareTo(s2)); //-32
		System.out.println("s1.compareTo(s3) :\t" + s1.compareTo(s3)); //0
		System.out.println("s2.compareTo(s1) :\t" + s2.compareTo(s1)); //32
		
		System.out.println(" s1.compareToIgnoreCase(s2) :\t" + s1.compareToIgnoreCase(s2)); //0
		System.out.println(" ('ABCD').compareToIgnoreCase('Abcde') :\t" + ("ABCD").compareToIgnoreCase("Abcde")); //-1
		System.out.println(" ('Abcdef').compareToIgnoreCase('Abcde') :\t" + ("Abcdef").compareToIgnoreCase("Abcde")); //1
		System.out.println("=====Concatenation =====");
		System.out.println("('ABC').concat('DEF') :\t" + ("ABC").concat("DEF")); //ABCDEF
		System.out.println("('ABC').concat('DEF') :\t" + ("_____").concat("DEF")); //ABCDEF
		System.out.println("=====Contains: ginve string match in main string or not (Case sensitive)=====");
		System.out.println("('ABC').contains('B') :\t" + ("ABC").contains("B")); //true
		System.out.println("('ABCdef').contains('B') :\t" + ("ABCdef").contains("CD")); //false
		System.out.println("('ABCdef').contains('B') :\t" + ("ABCdef").contains("BC")); //true
		System.out.println("======contentEquals : check equality of given string to main string=======");
		System.out.println("('ABCdef').contentEquals('ABCdef') :\t" + ("ABCdef").contentEquals("ABCdef")); //true
		System.out.println(" (\"Vijay Kumar\").contentEquals(\"Vijay  Kumar\") :\t" + ("Vijay Kumar").contentEquals("Vijay  Kumar")); //false
		StringBuffer sb = new StringBuffer("Vijay Kumar");
		System.out.println(" (\"Vijay Kumar\").contentEquals(\"Vijay  Kumar\") :\t" + ("Vijay Kumar").contentEquals(sb)); //true
		System.out.println("======endWith() :  check ending with given string or not =======");
		System.out.println(" (\"Vijay Kumar\").endsWith(\"mar\") :\t" + ("Vijay Kumar").endsWith("mar")); //true
		System.out.println(" (\"Vijay Kumar\").endsWith(\"mar\") :\t" + ("Vijay Kumar").endsWith("jay")); //false
		System.out.println("======== getBytes[] : retur one byte ACSII value of string charector ====== ");
		byte []bt = ("ABC").getBytes();
		for(byte b : bt)
		{
			System.out.println(b);
		}
		System.out.println("======== getChars(int start,int end ,char [] buffer ,int target_start) : return the sub string into char [] ,====== ");
		String gcs="This is a ABCD of getChars method ";
		char chbr[] = new char[4];
		gcs.getChars(10, 14, chbr, 0);
		String sss = new String(chbr);
		System.out.println("gcs.getChars() : " + sss );//ABCD
		System.out.println("======== getBytes(int start,int end ,byte [] buffer ,int target_start) : return the sub string into byte [] ,====== ");
		byte  arby [] = new byte[4];
		gcs.getBytes(10, 14, arby, 0);
		System.out.println("gcs.getBytes(10, 14, arby, 0)");
		for(byte b : arby)
		{
			System.out.print("\t"+b);//65	66	67	68
		}
		System.out.println("\n======== idexOf(int ACSII) : return first occorance of particular char ===== ");
		System.out.println("(\"ABCd\").indexOf(66) : "+ ("ABCd").indexOf(66));
		System.out.println("(\"abcd\").indexOf(100) : "+ ("abcd").indexOf(100)); 
		System.out.println("======== idexOf(String ) : return position of first occorance of substring ===== ");
		System.out.println("(\"My india is grate \").indexOf(\"is\"): "+ ("My india is grate ").indexOf("is")); 
		System.out.println("(\"My india is grate is \").indexOf(\"e is\"): "+ ("My india is grate is ").indexOf("e is")); 
		System.out.println("======== idexOf(int ,int ) : return position of first occorance of int or 'char' ===== ");
		System.out.println("(\"ABC is ABgrate \").indexOf(66,5) :"+ ("ABC is ABgrate ").indexOf(66,5)); 
		System.out.println("(\"My india is grate is \").indexOf('a',10) "+ ("My india is grate is ").indexOf('y',1)); 
		
		System.out.println("======== idexOf(String,int ) : return position of first occorance of subString ===== ");
		System.out.println("(\"My india is grate is \").indexOf('a',10) "+ ("My india is grate is ").indexOf("india",2));
		System.out.println("(\"My india is grate is \").indexOf('a',10) "+ ("My india is grate is ").indexOf("india",2));
		System.out.println("======== intern()===== ");
		String is= ("kkk").intern();
		String is1= ("Mehul").intern();
		String si1="kkk";
		String nis= new String("kkk");
		String si11="kkk";
		if(nis==is)
			System.out.println("same kkkk");
		if(is==si11)
		System.out.println("same");	
		
		System.out.println("======== isEmpty() ===== ");
		System.out.println("(\"ABC\").isEmpty() : "+("ABC").isEmpty());//false 
		System.out.println("(\"ABC\").isEmpty() : "+("").isEmpty());//true
		System.out.println("======== lastIndexOf(int) ===== ");
		System.out.println("(\"ABCBCDB\").lastIndexOf('B') : "+("ABCBCDB").lastIndexOf('B'));// 6
		System.out.println("(\"ABCBCDB\").lastIndexOf('C') : "+("ABCBCDB").lastIndexOf('C'));// 4 
		System.out.println("======== lastIndexOf(String) ===== ");
		System.out.println("(\"ABCACDBC\").lastIndexOf('BC') : "+("ABCACDBC").lastIndexOf("BC"));//6
		System.out.println("(\"my name is ram is ram\").lastIndexOf('is') : "+("my name is ram is ram").lastIndexOf("is"));//15 
		System.out.println("======== lastIndexOf(int ,int ) : first int ASCII value or one char ,secoand int till range ===== ");
		System.out.println("(\"ABCACDBC\").lastIndexOf('A',2) : "+("ABCACDBC").lastIndexOf('A',2));//0
		System.out.println("(\"ABCACDBC\").lastIndexOf(65,2) : "+("ABCACDBC").lastIndexOf(65,4));//3
		System.out.println("======== lastIndexOf(String,int ) : first sub string ,secoand int till range ===== ");
		System.out.println("(\"ABCACDBC\").lastIndexOf(\"AC\",4) : "+("ABCACDBC").lastIndexOf("AC",4));//3
		System.out.println("(\"Ram is Ram is God\").lastIndexOf(\"is\",11) : "+("Ram is Ram is God").lastIndexOf("is",11));//11
		System.out.println("======== length()===== ");
		System.out.println("(\"ABCACDBC\").;length() : "+("ABCACDBC").length());//3
		System.out.println("======== matches(string) : Matches the regular expression useing * and + ===== ");
		System.out.println("(\"india india india india india \").matches(\"(india )*\") : "+("india india india india india ").matches("(india )*"));//true
		System.out.println("(\"india india india india india \").matches(\"(india )+\") : "+("india india india india india ").matches("(india )+"));//true
		System.out.println("(\"AAAAAB\").matches(\"A*B\") : "+("AAAAAB").matches("A*B"));//true
		System.out.println("(\"AAAAAB\").matches(\"A+B\") : "+("AAAAAB").matches("A+B"));//true
		System.out.println("(\"AAAAAABBBA\").matches(\"A*B*A\") : "+("AAAAAABBBA").matches("A*B*A"));//true
		System.out.println("(\"AAAAAB\").matches(\"B*A\") : "+("AAAAAB").matches("B*A"));//false
		System.out.println("======== offsetByCodePoint(int ,int )===== dought-");
		System.out.println("(\"AAAAAB\").matches(\"B*A\") : "+("AAAAAB").offsetByCodePoints(0, 2));//2
		System.out.println("======== regionMatches(int,string,int,int  ) : first int is exact matching position ===== ");
		System.out.println("(\"sidarth\").regionMatches(2, \"da\", 0,2 ) : "+("sidarth").regionMatches(2, "da", 0,2 ));//true
		System.out.println("(\"ABCDef\").regionMatches(3, \"Def\", 0,3 ) : "+("ABCDef").regionMatches(3, "Def", 0,3 ));//true
		System.out.println("======== regionMatches(boolean,int,string,int,int  ) :boolean identify ignoue case, 2nd int is exact matching position ===== ");
		System.out.println("(\"ABCDef\").regionMatches(3, \"Def\", 0,3 ) : "+("ABCDef").regionMatches(true ,3, "def", 0,3 ));//true
		System.out.println("(\"ABCDef\").regionMatches(3, \"Def\", 0,3 ) : "+("ABCDef").regionMatches(true ,0, "aBc", 0,3 ));//true
		System.out.println("======== replace(char ,char ) :replace 1st char to 2nd char  ===== ");
		System.out.println("(\"ABCDef\").replace('A', 'V') : "+("ABCDef").replace('A', 'V'));//VBCDef
		System.out.println("(\"ABCDef\").replace('e', 'E') : "+("ABCDef").replace('e', 'E'));//VBCDef
		System.out.println("======== replace(CharSequence ,CharSequence ) :replace 1st char to 2nd char  ===== ");
		System.out.println("(\"ABCDef\").replace('A', 'V') : "+("ABCDef").replace('A', 'V'));//VBCDef
		System.out.println("(\"ABCDef\").replace('e', 'E') : "+("ABCDef").replace('e', 'E'));//VBCDef
		System.out.println("======== replaceAll(String ,String ) :replace 1st string to 2nd string  ===== ");
		String sss1 = "vijay";
		String rs = sss1.replace('v','K');
		System.out.println("sss1.replace('v','K');\n original string :"+sss1+" Now new String :"+rs);
		System.out.println("(\"ABCDef\").replace(\"ABC\", \"vijay\") : "+("ABCDef").replace("ABC", "vijay"));//VBCDef
		System.out.println("(\"ABCDef\").replace('A', 'V') : "+("ABCDef").replaceAll("ABCDef", "Vijay Kumar"));//VBCDef
		System.out.println("(\"ABCDef\").replaceAll(\"ABCDef\", \"Vijay Kumar\") : "+("ABCDef").replaceAll("ABCDef", "Vijay Kumar"));//VBCDef
		System.out.println("======== replaceFirst(String ,String ) :replace 1st string to 2nd string only first matching  ===== ");	
		System.out.println("(\"ABCDef\").replaceFirst(\"AB\", \"Vijay Kumar\") : "+("ABCDABef").replaceFirst("AB", "Vijay Kumar"));//VBCDef
		System.out.println("(\"my name is my is sername\").replaceFirst(\"is\", \"Vijay Kumar\") : "+("my name is my is sername").replaceFirst("is", "Vijay Kumar"));//VBCDef
		
		System.out.println("======== split(string)  ===== ");	
		String spl ="1111 222 333 444 55";
		String splarr1[] = spl.split(" ");
		System.out.println(spl);
		for (String s : splarr1)
			System.out.println(s);
		

		System.out.println("======== split(string,int )  ===== ");	
		String spl2 ="1111 222 333 444 55";
		String sp2[] = spl2.split(" ",3);
		System.out.println(spl2);
		for (String s : sp2)
			System.out.println(s);
		System.out.println("======== starstWith(string)===== ");	
		System.out.println("(\"my name is vijay is kumar\").startsWith(\"my\") : " + ("my name is vijay is kumar").startsWith("my"));
		
		System.out.println("======== starstWith(string,int )===== ");	
		System.out.println("(\"my name is vijay is kumar\").startsWith(\"my\") : " + ("my name is vijay is kumar").startsWith("name",3));
		
		System.out.println("======== subSequence(int,int )===== ");	
		System.out.println("(\"AB name is vijay is kumar\").subSequence(0, 10) : " + ("AB name is vijay is kumar").subSequence(0, 5));

		System.out.println("======== substring(int )===== ");	
		System.out.println(" (\"vijay is kumar\").substring(5) : " + ("vijay is kumar").substring(5));
		
		System.out.println("======== substring(int,int )===== ");	
		System.out.println(" (\"vijay is kumar\").substring(5) : " + ("vijay is kumar").substring(6,8));
			
		System.out.println("======== toCharArray()===== ");
		char ar[] = ("vijay is kumar").toCharArray();
		System.out.println(ar);
		System.out.println(("vijay is kumar").toCharArray());
			

		System.out.println("======== toLowerCase()===== ");
		System.out.println(("VIJAY is KUMAR kumar").toLowerCase());
		
		System.out.println("======== toLowerCase(Locale )===== ");
		//Locale l = new Locale(in);
	//	System.out.println(("VIJAY is KUMAR kumar").toLowerCase(l));
        String str ="This is a IDE namely Netbeen ,my name is vijay kumar ,i live at bangalore.";

String s= str.toString();
System.out.println("=======toLowerCase(Locale==== )");
String s11 = str.toLowerCase(Locale.ITALIAN);

System.out.println("=======toUpperCase()=======");
System.out.println(s11.toUpperCase());

System.out.println("=======toUpperCase(Locale)======");
System.out.println(s1.toUpperCase(Locale.KOREAN));

System.out.println("=======trim()=======");
System.out.println("     trkumar    kumarrr      ".trim()+" done");
char ch[] ={'A','B','C'};

System.out.println("=======copyValueOf()=======");
System.out.println(String.copyValueOf(ch));

System.out.println("=======copyValueOf(char[],int ,int)=======");
System.out.println(String.copyValueOf(ch, 1, 2));

//System.out.println("=======copyValueOf(char[],int ,int)=======");
String name="Vijay Kumar";
int age =23;
float sal = 25000;
String ii1= String.valueOf(age);
//System.out.println(String.formate("name : %s age : %d salary : %f",name,age,sal));
System.out.println("=======valueOf()=======");
System.out.println(String.valueOf(name));
System.out.println(String.valueOf(true));
System.out.println(ii1);
char d[] ={};
System.out.println(String.valueOf(ch));
System.out.println(String.valueOf(ch,1,2));

		
		
		
		
		 
		
		
		
		
		
		
		

		
		
		
		
		 		
		
		
				
		
		
	}

}
