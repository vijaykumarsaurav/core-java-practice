package Wrapper;

public class CharactorTest {

	public static void main(String[] args) {

		Character c1 = 'A';
		Character c2 = new Character('v');
		Character c3 ='v';
		
		System.out.println(c1.charValue());
		System.out.println(c1.compareTo('k'));
		System.out.println(c1.equals('k'));
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.toString());
		System.out.println(c3.getClass());
		System.out.println(c1.MAX_CODE_POINT);
		System.out.println(c3.MAX_HIGH_SURROGATE);
		System.out.println(c1.MAX_LOW_SURROGATE);
		System.out.println(c3.MAX_RADIX);
		System.out.println(c1.MAX_SURROGATE);
		System.out.println(c3.MAX_VALUE);
		System.out.println(c1.MIN_CODE_POINT);
		System.out.println(c3.MIN_HIGH_SURROGATE);
		System.out.println(c1.MIN_LOW_SURROGATE);
		System.out.println(c3.MIN_RADIX);
		System.out.println(c1.MIN_SUPPLEMENTARY_CODE_POINT);
		System.out.println(c3.MIN_SURROGATE);
		System.out.println(c1.MIN_VALUE);
		System.out.println(c3.SIZE);
		System.out.println(c1.charCount('a'));
		System.out.println(c3.codePointAt("aaaijay",1 ));
		System.out.println(c1.compare('c', 'a'));
		//maximam char can have 195102 char to all in java
		for (int i = 0; i < 150000; i++) 
		{
			System.out.println(i+ " : "+c1.getName(i));	 	
		}
		System.out.println(c3.getNumericValue('z'));
		System.out.println(c1.isAlphabetic('d'));
		System.out.println(c3.isBmpCodePoint('>'));
		System.out.println(c1.isDefined('_'));
		System.out.println(c3.getType('b'));
		System.out.println(c1.isJavaIdentifierPart('@'));
		System.out.println(c1.isJavaIdentifierPart('a'));
		System.out.println(c1.isJavaIdentifierPart('_'));
		System.out.println(c1.isJavaIdentifierPart('.'));
		System.out.println(c1.isSpace(' '));
		System.out.println(c1.isLowerCase('a'));
		System.out.println(c1.COMBINING_SPACING_MARK);
		System.out.println(c1.CONTROL);
		System.out.println(c1.FORMAT);
		System.out.println(c1.UPPERCASE_LETTER);
		System.out.println(c1.SPACE_SEPARATOR);
		System.out.println(c1.getDirectionality('@'));		
	
	}

}
